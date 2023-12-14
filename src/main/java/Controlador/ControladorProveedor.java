package Controlador;

import Modelo.ModeloProveedor;
import Vista.Principal;
import Vista.Proveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorProveedor implements ActionListener {

    Proveedor pro = new Proveedor();
    ModeloProveedor modpro = new ModeloProveedor();
    Principal prin = new Principal();

    public ControladorProveedor() {
        pro.getBtnGuardarProve().addActionListener(this);
        pro.getBtnCancelar().addActionListener(this);
        pro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pro.addWindowListener(new WindowAdapter() {
            ;
        public void windowClosed(WindowEvent e) {
                ControladorPrincipal princ = new ControladorPrincipal();
                princ.iniciarPrincipal(1);
            }
        });
    }

    public void iniciarProveedor() {
        pro.setVisible(true);
        pro.setLocationRelativeTo(null);
        pro.setTitle("Añadir Nuevo Proveedor | Ventana");

        pro.getJcbsexo().addItem("Seleccionar:");
        Map<String, Integer> dato = modpro.llenarCombo("sexo");
        for (String sexo : dato.keySet()) {
            pro.getJcbsexo().addItem(sexo);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == (pro.getBtnGuardarProve())) {

            if ((pro.getJcbsexo().getSelectedItem().equals("Seleccionar:")) 
                    || (pro.getTxtNombre().getText().isEmpty()) 
                    || (pro.getTxtTelefono().getText().isEmpty()) 
                    || (pro.getTxtCorreo().getText().isEmpty()) 
                    || (pro.getTxtDireccion().getText().isEmpty()) 
                    || (pro.getJDFechadeNaci().getDate() == null) 
                    || (pro.getCbxTipoDocu().getSelectedItem().equals("Seleccionar:")) 
                    || (pro.getCbxTipoDePersona().getSelectedItem().equals("Seleccionar:"))) {
                JOptionPane.showMessageDialog(null, "Hace Falta Informacion");
            } else {

                String valorSexo = pro.getJcbsexo().getSelectedItem().toString();
                int sexo = modpro.llenarCombo("sexo").get(valorSexo);
                java.util.Date fec = pro.getJDFechadeNaci().getDate();
                long fe = fec.getTime();
                java.sql.Date fecha = new Date(fe);

                modpro.setNom(pro.getTxtNombre().getText());
                modpro.setFec(fecha);
                modpro.setDir(pro.getTxtDireccion().getText());
                modpro.setTel(pro.getTxtTelefono().getText());
                modpro.setCor(pro.getTxtCorreo().getText());
                modpro.setSex(sexo);
                modpro.setTipdedeocu(pro.getCbxTipoDocu().getSelectedItem().toString());
                modpro.setTipdeper(pro.getCbxTipoDePersona().getSelectedItem().toString());
                ControladorPrincipal princ = new ControladorPrincipal();

                if (princ.validacioncorreo(modpro.getCor()) == true) {
                    if (pro.getBtnGuardarProve().getText().equals("Guardar")) {
                        JOptionPane.showMessageDialog(null, "registro almacenado");
                        modpro.insertarProveedor();
                        modpro.limpiarCasillas(pro.getJpPanelProve().getComponents());
                    } else {

                        modpro.actualizarProvedor();

                        pro.setVisible(false);
                        prin.getJtPrincipal().setSelectedIndex(1);
                        modpro.mostrarTablaProvedor(prin.getJtProvedor(), "", "Provedor");
                        pro.dispose();

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Correo Invalido");
                }
            }
        }

        if (e.getSource() == (pro.getBtnCancelar())) {
            pro.dispose();
        }
    }

    public void actualizarProvedor(int Doc) {
        modpro.buscarProvedor(Doc);
        pro.getTxtNombre().setText(modpro.getNom());
        pro.getTxtTelefono().setText(modpro.getTel());
        pro.getTxtCorreo().setText(modpro.getCor());
        pro.getJDFechadeNaci().setDate(modpro.getFec());
        pro.getTxtDireccion().setText(modpro.getDir());
        pro.getJcbsexo().setSelectedItem(modpro.getSex());
        pro.getCbxTipoDePersona().setSelectedItem(modpro.getTipdeper());
        pro.getCbxTipoDocu().setSelectedItem(modpro.getTipdedeocu());

        Map<String, Integer> datos = modpro.llenarCombo("sexo");
        for (String sexo : datos.keySet()) {
            pro.getJcbsexo().addItem(sexo);
        }

        String valorSexo = modpro.obtenerSeleccion(datos, modpro.getSex());
        pro.getJcbsexo().setSelectedItem(valorSexo);

        prin.setVisible(false);
        pro.getLblNuevoProve().setText("ACTUALIZAR PROVEDOR");
        pro.setLocationRelativeTo(null);
        pro.getBtnGuardarProve().setText("Actualizar");
        pro.setVisible(true);
        pro.setTitle("Actualizar Proveedor | Ventana");
    }

    public void eliminarProvedor(int Doc) {
        int resp = JOptionPane.showConfirmDialog(null, "Eliminar Provedor? \n" + Doc, "Eliminar Provedor", JOptionPane.YES_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            modpro.setCed(Doc);
            modpro.eliminarProvedor();
            modpro.mostrarTablaProvedor(prin.getJtProvedor(), "", "Provedor");

        }

    }
}
