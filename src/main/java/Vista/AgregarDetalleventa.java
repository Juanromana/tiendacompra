/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class AgregarDetalleventa extends javax.swing.JFrame {

    /**
     * Creates new form AgregarDetalleventa
     */
    public AgregarDetalleventa() {
        initComponents();
    }

    public JButton getBtnBusProduc() {
        return btnBusProduc;
    }

    public void setBtnBusProduc(JButton btnBusProduc) {
        this.btnBusProduc = btnBusProduc;
    }

    public JButton getBtnagregarventa() {
        return btnagregarventa;
    }

    public void setBtnagregarventa(JButton btnagregarventa) {
        this.btnagregarventa = btnagregarventa;
    }

    public JTable getJtDetalleFactura() {
        return jtDetalleFactura;
    }

    public void setJtDetalleFactura(JTable jtDetalleFactura) {
        this.jtDetalleFactura = jtDetalleFactura;
    }

    public JLabel getLbfactura() {
        return lbfactura;
    }

    public void setLbfactura(JLabel lbfactura) {
        this.lbfactura = lbfactura;
    }

    public JTextField getTtidfactur() {
        return ttidfactur;
    }

    public void setTtidfactur(JTextField ttidfactur) {
        this.ttidfactur = ttidfactur;
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetalleFactura = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbfactura = new javax.swing.JLabel();
        ttidfactur = new javax.swing.JTextField();
        btnagregarventa = new javax.swing.JButton();
        btnBusProduc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Agregar Detalle Venta");

        jtDetalleFactura.setBackground(new java.awt.Color(153, 153, 153));
        jtDetalleFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtDetalleFactura.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtDetalleFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtDetalleFactura);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Producto:");

        lbfactura.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbfactura.setForeground(new java.awt.Color(255, 255, 255));
        lbfactura.setText("Id facturara");

        ttidfactur.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ttidfactur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttidfacturActionPerformed(evt);
            }
        });

        btnagregarventa.setBackground(new java.awt.Color(0, 0, 0));
        btnagregarventa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnagregarventa.setForeground(new java.awt.Color(255, 255, 255));
        btnagregarventa.setText("Agregar venta");
        btnagregarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarventaActionPerformed(evt);
            }
        });

        btnBusProduc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Filtrar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbfactura)
                .addGap(18, 18, 18)
                .addComponent(ttidfactur, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnBusProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnagregarventa)
                .addGap(187, 187, 187))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBusProduc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(lbfactura)
                                .addComponent(ttidfactur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnagregarventa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ttidfacturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttidfacturActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttidfacturActionPerformed

    private void btnagregarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarventaActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusProduc;
    private javax.swing.JButton btnagregarventa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtDetalleFactura;
    private javax.swing.JLabel lbfactura;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField ttidfactur;
    // End of variables declaration//GEN-END:variables
}
