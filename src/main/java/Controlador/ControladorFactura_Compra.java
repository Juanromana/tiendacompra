package Controlador;

import Modelo.ModeloFactura_Compra;
import Modelo.ModeloProducto;
import Modelo.ModeloProveedor;
import Modelo.ModeloUsuario;
import Vista.Agregar_Detalle_Factura;
import Vista.Factura_Compra;
import Vista.Principal;
import Vista.Producto_Tabla;
import Vista.Proveedor_Tabla;
import Vista.Usuarios_Tabla;
import Vista.Ver_detallefac;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorFactura_Compra implements ActionListener, DocumentListener {

    Factura_Compra vista_factucomp = new Factura_Compra();
    Usuarios_Tabla User_Table = new Usuarios_Tabla();
    Principal prin = new Principal();
    ModeloUsuario modusu = new ModeloUsuario();
    ModeloProveedor modprove = new ModeloProveedor();
    Producto_Tabla tablapro = new Producto_Tabla();
    Proveedor_Tabla Proveedor_Table = new Proveedor_Tabla();
    ModeloProducto modpro = new ModeloProducto();
    ModeloFactura_Compra modfactucomp = new ModeloFactura_Compra();
    Ver_detallefac ver = new Ver_detallefac();
    Agregar_Detalle_Factura agredetafac = new Agregar_Detalle_Factura();

    public ControladorFactura_Compra() {
        vista_factucomp.getBtnBuscarProveedor().addActionListener(this);
        vista_factucomp.getBtnBuscarUsuario().addActionListener(this);
        vista_factucomp.getBtnGuardarFacturaCompra().addActionListener(this);
        vista_factucomp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        User_Table.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Proveedor_Table.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Proveedor_Table.getTxtbuscarprove().getDocument().addDocumentListener(this);
        User_Table.getTxtbuscarusu().getDocument().addDocumentListener(this);
        vista_factucomp.getBtnCancelar().addActionListener(this);
        vista_factucomp.addWindowListener(new WindowAdapter() {
            ;
        public void windowClosed(WindowEvent e) {
                ControladorPrincipal princ = new ControladorPrincipal();
                princ.iniciarPrincipal(4);
            }
        });

        User_Table.addWindowListener(new WindowAdapter() {
            ;
        public void windowClosed(WindowEvent e) {
                User_Table.setVisible(false);
                vista_factucomp.setVisible(true);
            }
        });

        Proveedor_Table.addWindowListener(new WindowAdapter() {
            ;
        public void windowClosed(WindowEvent e) {
                Proveedor_Table.setVisible(false);
                vista_factucomp.setVisible(true);
            }
        });
    }

    public void agregarUsuario() {
        User_Table.setTitle("Añadir Usuario | Ventana");
        User_Table.getJtUsuario().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = User_Table.getJtUsuario().rowAtPoint(e.getPoint());
                int columna = User_Table.getJtUsuario().columnAtPoint(e.getPoint());
                modusu.setDoc(Integer.parseInt(User_Table.getJtUsuario().getValueAt(fila, 0).toString()));
                if (columna == 9) {
                    User_Table.setVisible(false);
                    vista_factucomp.setVisible(true);
                    Object idusu = modusu.getDoc();
                    vista_factucomp.getTxtUsuario().setText(idusu.toString());
                }
            }
        });

        User_Table.getTxtbuscarusu().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                User_Table.getTxtbuscarusu().setText("");
                User_Table.getTxtbuscarusu().setForeground(Color.black);
            }
        });
    }

    public void agregarproveedor() {
        Proveedor_Table.setTitle("Añadir Proveedor | Ventana");

        Proveedor_Table.getJtProveedor().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = Proveedor_Table.getJtProveedor().rowAtPoint(e.getPoint());
                int columna = Proveedor_Table.getJtProveedor().columnAtPoint(e.getPoint());
                modprove.setCed(Integer.parseInt(Proveedor_Table.getJtProveedor().getValueAt(fila, 1).toString()));
                if (columna == 9) {
                    Proveedor_Table.setVisible(false);
                    vista_factucomp.setVisible(true);
                    Object idpro = modprove.getCed();
                    vista_factucomp.getTxtProveedor().setText(idpro.toString());
                    JOptionPane.showMessageDialog(null, "Proveedor Agregado");
                }
            }
        });
        Proveedor_Table.getTxtbuscarprove().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Proveedor_Table.getTxtbuscarprove().setText("");
                Proveedor_Table.getTxtbuscarprove().setForeground(Color.black);
            }
        });
    }

    public void agregarDetalleFactura(int fac) {
        agredetafac.setVisible(true);
        agredetafac.setLocationRelativeTo(null);
        agredetafac.setTitle("Añadir Detalle Factura | Ventana");
        agredetafac.getTxtidfactura().setText(String.valueOf(fac));

    }

    public void ver_Factura(int fact) {
        String dato[] = modfactucomp.buscarFacturaDetalle(fact, ver.getTablaverdetallefac());
        ver.getLabfactu().setText(String.valueOf(fact));
        ver.getLabprove().setText(dato[1]);
        ver.getLabtipopago().setText(dato[2]);
        ver.getLabfecha().setText(dato[3]);
        ver.getLabusuario().setText(dato[4]);
        ver.getLabcomprovante().setText(dato[5]);
        ver.getLdescuento().setText(dato[6]);
        ver.getLabiva().setText(dato[7]);
        ver.getLabtotalpago().setText(dato[8]);
        ver.setLocationRelativeTo(null);
        ver.setVisible(true);
    }

    public void actualizarFactura_Compra(int idfactucom) {
        modfactucomp.buscarFactura_Compra(idfactucom);
        vista_factucomp.getTxtComprobante().setEnabled(false);
        vista_factucomp.getTxtUsuario().setText(String.valueOf(modfactucomp.getIdusu()));
        vista_factucomp.getTxtProveedor().setText(String.valueOf(modfactucomp.getCed()));
        vista_factucomp.getCbxtipodepago().setSelectedItem(modfactucomp.getTipopago());
        vista_factucomp.getTxtComprobante().setText(String.valueOf(modfactucomp.getNumerodecomprobante()));
        vista_factucomp.getLblTitulo().setText("ACTUALIZAR FACTURA");
        prin.setVisible(false);
        vista_factucomp.setLocationRelativeTo(null);
        vista_factucomp.getBtnGuardarFacturaCompra().setText("Actualizar");
        vista_factucomp.setVisible(true);
        vista_factucomp.setTitle("Actualizar Factura Compra | Ventana");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vista_factucomp.getBtnBuscarUsuario())) {
            vista_factucomp.setVisible(false);
            User_Table.setLocationRelativeTo(null);
            modusu.mostrarTablaUsuario(User_Table.getJtUsuario(), "", "BuscarUsuario");
            User_Table.setVisible(true);
            agregarUsuario();
        }
        if (e.getSource().equals(vista_factucomp.getBtnBuscarProveedor())) {
            vista_factucomp.setVisible(false);
            Proveedor_Table.setLocationRelativeTo(null);
            modprove.mostrarTablaProvedor(Proveedor_Table.getJtProveedor(), "", "BuscarProveedor");
            Proveedor_Table.setVisible(true);
            agregarproveedor();
        }

        if (e.getSource().equals(vista_factucomp.getBtnGuardarFacturaCompra())) {
            if ((vista_factucomp.getTxtProveedor().getText().isEmpty()) || (vista_factucomp.getTxtUsuario().getText().isEmpty()) || (vista_factucomp.getCbxtipodepago().getSelectedItem().equals("Seleccionar:")) || (vista_factucomp.getTxtComprobante().getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Hace Falta Informacion");
            } else {

                modfactucomp.setCed(Integer.parseInt(vista_factucomp.getTxtProveedor().getText()));
                modfactucomp.setIdusu(Integer.parseInt(vista_factucomp.getTxtUsuario().getText()));
                modfactucomp.setTipopago(vista_factucomp.getCbxtipodepago().getSelectedItem().toString());
                modfactucomp.setNumerodecomprobante(Integer.parseInt(vista_factucomp.getTxtComprobante().getText()));
                if (vista_factucomp.getBtnGuardarFacturaCompra().getText().equals("Guardar")) {
                    modfactucomp.insertarfacturacompra();
                    modfactucomp.limpiarCasillas(vista_factucomp.getJpFacturaCompra().getComponents());
                } else {
                    modfactucomp.actualizarFactura_Compra();
                    vista_factucomp.dispose();
                    prin.getJtPrincipal().setSelectedIndex(4);
                    modfactucomp.mostrarFactura_Compra(prin.getJtFactura(), "", "Factura");
                }
            }
        }

        if (e.getSource().equals(vista_factucomp.getBtnCancelar())) {
            vista_factucomp.dispose();
        }
        if (e.getSource().equals(agredetafac.getBtnBuscarProducto())) {
            tablapro.setVisible(true);
            tablapro.setLocationRelativeTo(null);
            agredetafac.setVisible(false);
            tablapro.setTitle("Buscar Producto | Ventana");
            modpro.mostrarTablaProducto(tablapro.getJtproducto(), "", "Factura");

            JButton agregar = new JButton("Añadir");
            agregar.setBounds(13, 80, 80, 20);
            tablapro.getJtproducto().add(agregar);

            agregar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    modfactucomp.agregardatos(tablapro.getJtproducto(), agredetafac.getJtDetalleFactura());
                    tablapro.setVisible(false);
                    agredetafac.setVisible(true);
                    agredetafac.setLocationRelativeTo(null);
                }
            });

        }

        if (e.getSource().equals(agredetafac.getBtnagregardetallefactura())) {
            if (agredetafac.getTxtidfactura().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Hace falta informacion");
            } else {
                agredetafac.getBtnagregardetallefactura().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int fila = agredetafac.getJtDetalleFactura().rowAtPoint(e.getPoint());
                        int columna = agredetafac.getJtDetalleFactura().columnAtPoint(e.getPoint());
                        modfactucomp.setIdfactu(Integer.parseInt(agredetafac.getTxtidfactura().getText()));
                        modfactucomp.setIdprodu(Integer.parseInt(agredetafac.getJtDetalleFactura().getValueAt(fila, 0).toString()));
                        modfactucomp.setCantidadcompra(Integer.parseInt(agredetafac.getJtDetalleFactura().getValueAt(fila, 3).toString()));
                        modfactucomp.setPreciouni(Integer.parseInt(agredetafac.getJtDetalleFactura().getValueAt(fila, 4).toString()));
                        modfactucomp.insertarfacturacompraproducto();
                        agredetafac.dispose();
                    }
                });

            }
        }
    }

    public void iniciarFactura_Compra() {
        vista_factucomp.setVisible(true);
        vista_factucomp.setLocationRelativeTo(null);
        prin.setVisible(false);
        prin.setExtendedState(JFrame.MAXIMIZED_BOTH);
        vista_factucomp.setTitle("Añadir Nueva Factura | Ventana");
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        modprove.mostrarTablaProvedor(Proveedor_Table.getJtProveedor(), Proveedor_Table.getTxtbuscarprove().getText(), "");
        modusu.mostrarTablaUsuario(User_Table.getJtUsuario(), User_Table.getTxtbuscarusu().getText(), "");

    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        modprove.mostrarTablaProvedor(Proveedor_Table.getJtProveedor(), Proveedor_Table.getTxtbuscarprove().getText(), "");
        modusu.mostrarTablaUsuario(User_Table.getJtUsuario(), User_Table.getTxtbuscarusu().getText(), "");

    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        modprove.mostrarTablaProvedor(Proveedor_Table.getJtProveedor(), Proveedor_Table.getTxtbuscarprove().getText(), "");
        modusu.mostrarTablaUsuario(User_Table.getJtUsuario(), User_Table.getTxtbuscarusu().getText(), "");
        modpro.mostrarTablaProducto(tablapro.getJtproducto(), tablapro.getTxtbuscarpro().getText(), "");
    }

}
