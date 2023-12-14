
package Controlador;

import Modelo.ModeloProducto;
import Vista.Principal;
import Vista.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ControladorProducto implements ActionListener {

    Producto pro = new Producto();
    Principal prin = new Principal();
    ModeloProducto modpro = new ModeloProducto();

    public ControladorProducto() {
        pro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pro.getBtnBuscarIma().addActionListener(this);
        pro.getBtnGuardarProduc().addActionListener(this);
        pro.getBtnCancelar().addActionListener(this);

        pro.addWindowListener(new WindowAdapter() {
            ;
        public void windowClosed(WindowEvent e) {
                ControladorPrincipal princ = new ControladorPrincipal();
                princ.iniciarPrincipal(3);
            }
        });
    }

    public void iniciarProducto() {
        pro.setVisible(true);
        pro.setLocationRelativeTo(null);
        prin.setVisible(false);
        prin.setExtendedState(JFrame.MAXIMIZED_BOTH);
        pro.setTitle("Añadir Nuevo Producto | Ventana");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(pro.getBtnBuscarIma())) {
            modpro.buscarImagen();
            File file = new File(modpro.getRuta());
            String archivo = file.getName();
            pro.getTxtIma().setText(archivo);
        }

        if (e.getSource().equals(pro.getBtnGuardarProduc())) {
            if (pro.getTxtNombre().getText().isEmpty() 
                    || pro.getTxtIma().getText().isEmpty() 
                    || pro.getJtxtDescri().getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Hace Falta Informacion");
            } else {

                modpro.setNom(pro.getTxtNombre().getText());
                modpro.setDesc(pro.getJtxtDescri().getText());
                modpro.setImagen(modpro.convertirImagenes(modpro.getRuta()));

                if (pro.getBtnGuardarProduc().getText().equals("Guardar")) {
                    modpro.insertarProducto();
                    modpro.limpiarCasillas(pro.getJpPanelProducto().getComponents());
                } else {

                    modpro.actualizarProducto();

                    pro.setVisible(false);
                    prin.getJtPrincipal().setSelectedIndex(1);
                    modpro.mostrarTablaProducto(prin.getJtProducto(), "", "Producto");
                    pro.dispose();

                }
            }
        }
        if (e.getSource().equals(pro.getBtnCancelar())) {
            pro.dispose();
        }
    }

    public void actualizarProducto(int idpro) {
        modpro.buscarProducto(idpro);
        pro.getTxtNombre().setText(modpro.getNom());
        pro.getTxtIma().setEnabled(false);
        pro.getJtxtDescri().setText(modpro.getDesc());
        pro.getLblTitulo().setText("ACTUALIZAR PRODUCTO");
        prin.setVisible(false);
        pro.setLocationRelativeTo(null);
        pro.getBtnGuardarProduc().setText("Actualizar");
        pro.setVisible(true);
        File file = new File(modpro.getRuta());
        String archivo = file.getName();
        pro.getTxtIma().setText(archivo);
        pro.setTitle("Actualizar Producto | Ventana");
    }

    public void eliminarProducto(int idpro) {
        int resp = JOptionPane.showConfirmDialog(null, "Eliminar Producto? \n" + idpro, "Eliminar Producto", JOptionPane.YES_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            modpro.setIdpro(idpro);
            modpro.eliminarProducto();
            modpro.mostrarTablaProducto(prin.getJtProducto(), "", "Producto");

        }
    }
}
