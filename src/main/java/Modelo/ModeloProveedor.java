package Modelo;

import Controlador.Conexion;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class ModeloProveedor {

    private int ced, sex;
    private String dir, tel, cor, nom, tipdedeocu, tipdeper;
    private Date fec;

    public int getCed() {
        return ced;
    }

    public void setCed(int ced) {
        this.ced = ced;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getDir() {
        return dir;
    }

    public String getTipdedeocu() {
        return tipdedeocu;
    }

    public void setTipdedeocu(String tipdedeocu) {
        this.tipdedeocu = tipdedeocu;
    }

    public String getTipdeper() {
        return tipdeper;
    }

    public void setTipdeper(String tipdeper) {
        this.tipdeper = tipdeper;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getFec() {
        return fec;
    }

    public void setFec(Date fec) {
        this.fec = fec;
    }

    public Map<String, Integer> llenarCombo(String genero) {

        Conexion conect = new Conexion();
        Connection cn = conect.iniciarConexion();

        String sql = "Select * from mostrar_sexo";

        Map<String, Integer> llenar_combo = new HashMap<>();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                llenar_combo.put(rs.getString(2), rs.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return llenar_combo;
    }

    public void insertarProveedor() {
        Conexion conect = new Conexion();
        Connection cn = conect.iniciarConexion();
        String sql = "Call Insersion_Proveedor(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, getSex());
            ps.setString(2, getTipdedeocu());
            ps.setString(3, getNom());
            ps.setString(4, getCor());
            ps.setString(5, getTel());
            ps.setString(6, getDir());
            ps.setString(7, getTipdeper());
            ps.setDate(8, (java.sql.Date) getFec());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro almacenamiento", "registro", sex);
            cn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conect.cerrarConexion();
    }

    public void limpiarCasillas(Component[] panel) {
        for (Object vaciar : panel) {
            if (vaciar instanceof JTextField) {
                ((JTextField) vaciar).setText("");
            }

            if (vaciar instanceof JComboBox) {
                ((JComboBox) vaciar).setSelectedItem("Seleccionar:");
            }

            if (vaciar instanceof JDateChooser) {
                ((JDateChooser) vaciar).setDate(null);
            }
        }
    }

    public void mostrarTablaProvedor(JTable tabla, String valor, String nomPesta) {
        Conexion conect = new Conexion();
        Connection cn = conect.iniciarConexion();

        JButton editar = new JButton();
        JButton eliminar = new JButton();
        JButton agregar = new JButton();

        JTableHeader encabezado = tabla.getTableHeader();
        encabezado.setDefaultRenderer(new Encabezado());
        tabla.setTableHeader(encabezado);
        tabla.setDefaultRenderer(Object.class, new Celdas());

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png")));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png")));
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-usuario.png")));
   
        String[] titulo = {"tipo de documento", "cedula", "nombre", "sexo", "Telefono", "Correo", "Direccion", "Tipo De Persona", "Fecha De Nacimiento"};
        int total = titulo.length;

        if (nomPesta.equals("Provedor")) {
            titulo = Arrays.copyOf(titulo, titulo.length + 2);
            titulo[titulo.length - 2] = "Editar";
            titulo[titulo.length - 1] = "Eliminar";
        } else {
            titulo = Arrays.copyOf(titulo, titulo.length + 1);
            titulo[titulo.length - 1] = "Agregar";
        }
        DefaultTableModel tablaProvedor = new DefaultTableModel(null, titulo) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String sqlProvedor;
        if (valor.equals("")) {
            sqlProvedor = "Select * from mostrar_proveedor";
        } else {
            sqlProvedor = "call Filtro_Provedor('" + valor + "')";
        }
        try {
            String[] dato = new String[titulo.length];
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sqlProvedor);
            while (rs.next()) {
                for (int i = 0; i < total; i++) {
                    dato[i] = rs.getString(i + 1);
                }
                Object[] fila = {dato[2], dato[0], dato[3], dato[1], dato[4], dato[5], dato[6], dato[7], dato[8]};
                if (nomPesta.equals("Provedor")) {
                    fila = Arrays.copyOf(fila, fila.length + 2);
                    fila[fila.length - 2] = editar;
                    fila[fila.length - 1] = eliminar;
                }else {
                    fila = Arrays.copyOf(fila, fila.length + 1);
                    fila[fila.length - 1] = agregar;
                }
                tablaProvedor.addRow(fila);
            }
            cn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        tabla.setModel(tablaProvedor);

        int numColumnas = tabla.getColumnCount();
        int[] tamanos = {100, 100, 100, 100, 100, 100, 100, 100, 50, 80, 80};
        for (int i = 0; i < numColumnas; i++) {
            TableColumn columna = tabla.getColumnModel().getColumn(i);
            columna.setPreferredWidth(tamanos[i]);
        }
        conect.cerrarConexion();

    }

    public void buscarProvedor(int valor) {
        Conexion cone = new Conexion();
        Connection cn = cone.iniciarConexion();

        String sql = "call BuscarRegistro_Provedor(" + valor + ")";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                setCed(rs.getInt(1));
                setNom(rs.getString(4));
                setTel(rs.getString(6));
                setCor(rs.getString(5));
                setDir(rs.getString(7));
                setFec(rs.getDate(9));
                setSex(rs.getInt(2));
                setTipdeper(rs.getString(8));
                setTipdedeocu(rs.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public String obtenerSeleccion(Map<String, Integer> dato, int valor) {
        for (Map.Entry<String, Integer> seleccion : dato.entrySet()) {
            if (seleccion.getValue() == valor) {
                return seleccion.getKey();
            }
        }
        return null;
    }

    public void actualizarProvedor() {
        Conexion cone = new Conexion();
        Connection cn = cone.iniciarConexion();

        String sql = "call Actualizar_Provedor(?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setInt(1, getCed());
            ps.setString(2, getNom());
            ps.setString(3, getTel());
            ps.setString(4, getCor());
            ps.setString(5, getDir());
            ps.setDate(6, (java.sql.Date) getFec());
            ps.setInt(7, getSex());
            ps.setString(8, getTipdeper());
            ps.setString(9, getTipdedeocu());
    
            ps.executeUpdate();
            cn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarProvedor() {
        Conexion cone = new Conexion();
        Connection cn = cone.iniciarConexion();
        String sql = "call Eliminar_Provedor(?)";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setInt(1, getCed());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Provedor Eliminado", "Eliminar Provedor", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
