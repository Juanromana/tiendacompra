package Controlador;

import Modelo.ModeloCliente;
import Modelo.ModeloProducto;
import Modelo.ModeloUsuario;
import Modelo.ModeloVenta;
import Vista.AgregarDetalleventa;
import Vista.Clientes_Tabla;
import Vista.Factura;
import Vista.Principal;
import Vista.Producto_Tabla;
import Vista.Usuarios_Tabla;
import Vista.Ver_venta;
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

/**
 *
 * @author SENA
 */
public class ControladorVenta implements ActionListener, DocumentListener {

    Principal prin = new Principal();
    Factura fact = new Factura();
    Usuarios_Tabla user_table = new Usuarios_Tabla();
    Clientes_Tabla cliente_table = new Clientes_Tabla();
    ModeloVenta modven = new ModeloVenta();
    ModeloUsuario moduser = new ModeloUsuario();
    ModeloCliente modcli = new ModeloCliente();
    Ver_venta verventa = new Ver_venta();
    AgregarDetalleventa agredetaventa = new AgregarDetalleventa();
    Producto_Tabla tableproduc = new Producto_Tabla();
    ModeloProducto modproduc = new ModeloProducto();

    public ControladorVenta() {
        fact.getBtnCancelar().addActionListener(this);
        fact.getBtnBusUsu().addActionListener(this);
        fact.getBtnbuscarcliente().addActionListener(this);
        fact.getBtnGuardarVenta().addActionListener(this);
        agredetaventa.getBtnBusProduc().addActionListener(this);
        agredetaventa.getBtnagregarventa().addActionListener(this);

        fact.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        user_table.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cliente_table.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        verventa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        agredetaventa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tableproduc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        user_table.getTxtbuscarusu().getDocument().addDocumentListener(this);
        cliente_table.getTxtbuscarcli().getDocument().addDocumentListener(this);

        fact.addWindowListener(new WindowAdapter() {
            ;
        public void windowClosed(WindowEvent e) {
                ControladorPrincipal prin = new ControladorPrincipal();
                prin.iniciarPrincipal(5);
            }
        });

        user_table.addWindowListener(new WindowAdapter() {
            ;
        public void windowClosed(WindowEvent e) {
                fact.setVisible(true);
                user_table.setVisible(false);
            }
        });

        cliente_table.addWindowListener(new WindowAdapter() {
            ;
        public void windowClosed(WindowEvent e) {
                fact.setVisible(true);
                cliente_table.setVisible(false);
            }
        });

        verventa.addWindowListener(new WindowAdapter() {
            ;
        public void windowClosed(WindowEvent e) {
                ControladorPrincipal prin = new ControladorPrincipal();
                prin.iniciarPrincipal(5);
                verventa.setVisible(false);
            }
        });

        agredetaventa.addWindowListener(new WindowAdapter() {
            ;
        public void windowClosed(WindowEvent e) {
                ControladorPrincipal prin = new ControladorPrincipal();
                prin.iniciarPrincipal(5);
                agredetaventa.setVisible(false);
            }
        });

        tableproduc.addWindowListener(new WindowAdapter() {
            ;
        public void windowClosed(WindowEvent e) {
                ControladorPrincipal prin = new ControladorPrincipal();
                agredetaventa.setVisible(true);
                tableproduc.setVisible(false);
            }
        });
    }

    public void iniciarVenta() {
        prin.setVisible(false);
        fact.setVisible(true);
        fact.setLocationRelativeTo(null);
        fact.setTitle("Nueva Venta | Ventana");
    }

    public void actualizarVenta(int idfactura) {
        modven.buscarVenta(idfactura);
        fact.getTxtUsuario().setText(String.valueOf(modven.getIdusuario()));
        fact.getTxtcliente().setText(String.valueOf(modven.getIdcliente()));
        fact.getCbxtipodepago().setSelectedItem(modven.getTipodepago());

        prin.setVisible(false);
        fact.getLbltitulo().setText("ACTUALIZAR VENTA");
        fact.setLocationRelativeTo(null);
        fact.getBtnGuardarVenta().setText("Actualizar");
        fact.setVisible(true);
        fact.setTitle("Actualizar Venta | Ventana");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(fact.getBtnBusUsu())) {
            fact.setVisible(false);
            user_table.setVisible(true);
            user_table.setLocationRelativeTo(null);
            moduser.mostrarTablaUsuario(user_table.getJtUsuario(), "", "");

            user_table.getJtUsuario().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int fila = user_table.getJtUsuario().rowAtPoint(e.getPoint());
                    int columna = user_table.getJtUsuario().columnAtPoint(e.getPoint());
                    moduser.setDoc(Integer.parseInt(user_table.getJtUsuario().getValueAt(fila, 0).toString()));
                    if (columna == 9) {
                        user_table.setVisible(false);
                        fact.setVisible(true);
                        Object idusuario = moduser.getDoc();
                        fact.getTxtUsuario().setText(idusuario.toString());
                    }
                }
            });
        }
        if (e.getSource().equals(fact.getBtnbuscarcliente())) {
            fact.setVisible(false);
            cliente_table.setVisible(true);
            cliente_table.setLocationRelativeTo(null);
            modcli.mostrarTablaCliente(cliente_table.getJtCliente(), "", "");

            cliente_table.getJtCliente().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int fila = cliente_table.getJtCliente().rowAtPoint(e.getPoint());
                    int columna = cliente_table.getJtCliente().columnAtPoint(e.getPoint());
                    modcli.setCdl(Integer.parseInt(cliente_table.getJtCliente().getValueAt(fila, 0).toString()));
                    if (columna == 8) {
                        cliente_table.setVisible(false);
                        fact.setVisible(true);
                        Object idcliente = modcli.getCdl();
                        fact.getTxtcliente().setText(idcliente.toString());
                    }
                }
            });
        }
        if (e.getSource().equals(fact.getBtnGuardarVenta())) {
            if (fact.getCbxtipodepago().getSelectedItem().equals("Seleccionar:")
                    || fact.getTxtUsuario().getText().isEmpty()
                    || fact.getTxtcliente().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Hace Falta Informacion");
            } else {
                modven.setIdcliente(Integer.parseInt(fact.getTxtcliente().getText()));
                modven.setIdusuario(Integer.parseInt(fact.getTxtUsuario().getText()));
                modven.setTipodepago(fact.getCbxtipodepago().getSelectedItem().toString());

                if (fact.getBtnGuardarVenta().getText().equals("Guardar")) {
                    modven.insertarVenta();
                } else {
                    modven.actualizarVenta();
                    fact.dispose();
                    prin.getJtPrincipal().setSelectedIndex(5);
                    modven.mostrarVentaTabla(prin.getJtVenta(), "", "Editar");
                }
            }
        }
        if (e.getSource().equals(fact.getBtnCancelar())) {
            fact.dispose();
        }
        if (e.getSource().equals(agredetaventa.getBtnBusProduc())) {
            tableproduc.setVisible(true);
            tableproduc.setLocationRelativeTo(null);
            agredetaventa.setVisible(false);
            tableproduc.setTitle("Buscar Producto | Ventana");
            modproduc.mostrarTablaProducto(tableproduc.getJtproducto(), "", "");

            JButton agregar = new JButton("Añadir");
            agregar.setBounds(13, 80, 80, 20);
            tableproduc.getJtproducto().add(agregar);

            agregar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    modven.agregardatos(tableproduc.getJtproducto(), agredetaventa.getJtDetalleFactura());
                    tableproduc.setVisible(false);
                    agredetaventa.setVisible(true);
                    agredetaventa.setLocationRelativeTo(null);
                }
            });

        }

        if (e.getSource().equals(agredetaventa.getBtnagregarventa())) {
            if (agredetaventa.getTtidfactur().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Hace falta informacion");
            } else {
                agredetaventa.getBtnagregarventa().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int fila = agredetaventa.getJtDetalleFactura().rowAtPoint(e.getPoint());
                        int columna = agredetaventa.getJtDetalleFactura().columnAtPoint(e.getPoint());
                        modven.setIdfactura(Integer.parseInt(agredetaventa.getTtidfactur().getText()));
                        modven.setProduc(Integer.parseInt(agredetaventa.getJtDetalleFactura().getValueAt(fila, 0).toString()));
                        modven.setCanti(Integer.parseInt(agredetaventa.getJtDetalleFactura().getValueAt(fila, 3).toString()));
                        modven.setDes(Float.parseFloat((agredetaventa.getJtDetalleFactura().getValueAt(fila, 4).toString())));
                        modven.insertarProductoFactura();
                    }
                });

            }
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        moduser.mostrarTablaUsuario(user_table.getJtUsuario(), user_table.getTxtbuscarusu().getText(), "");
        modcli.mostrarTablaCliente(cliente_table.getJtCliente(), cliente_table.getTxtbuscarcli().getText(), "");

    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        moduser.mostrarTablaUsuario(user_table.getJtUsuario(), user_table.getTxtbuscarusu().getText(), "");
        modcli.mostrarTablaCliente(cliente_table.getJtCliente(), cliente_table.getTxtbuscarcli().getText(), "");

    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        moduser.mostrarTablaUsuario(user_table.getJtUsuario(), user_table.getTxtbuscarusu().getText(), "");
        modcli.mostrarTablaCliente(cliente_table.getJtCliente(), cliente_table.getTxtbuscarcli().getText(), "");

    }
}
