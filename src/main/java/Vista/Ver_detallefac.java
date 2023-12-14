/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author SENA
 */
public class Ver_detallefac extends javax.swing.JFrame {

   
    public Ver_detallefac() {
        initComponents();
    }

    public JPanel getJpaverdaetafac() {
        return jpaverdaetafac;
    }

    public void setJpaverdaetafac(JPanel jpaverdaetafac) {
        this.jpaverdaetafac = jpaverdaetafac;
    }

    public JLabel getLabcomprovante() {
        return labcomprovante;
    }

    public void setLabcomprovante(JLabel labcomprovante) {
        this.labcomprovante = labcomprovante;
    }

    public JLabel getLabfactu() {
        return labfactu;
    }

    public void setLabfactu(JLabel labfactu) {
        this.labfactu = labfactu;
    }

    public JLabel getLabfecha() {
        return labfecha;
    }

    public void setLabfecha(JLabel labfecha) {
        this.labfecha = labfecha;
    }

    public JLabel getLabiva() {
        return labiva;
    }

    public void setLabiva(JLabel labiva) {
        this.labiva = labiva;
    }

    public JLabel getLabprove() {
        return labprove;
    }

    public void setLabprove(JLabel labprove) {
        this.labprove = labprove;
    }

    public JLabel getLabtipopago() {
        return labtipopago;
    }

    public void setLabtipopago(JLabel labtipopago) {
        this.labtipopago = labtipopago;
    }

    public JLabel getLabtotalpago() {
        return labtotalpago;
    }

    public void setLabtotalpago(JLabel labtotalpago) {
        this.labtotalpago = labtotalpago;
    }

    public JLabel getLabusuario() {
        return labusuario;
    }

    public void setLabusuario(JLabel labusuario) {
        this.labusuario = labusuario;
    }

    public JTable getTablaverdetallefac() {
        return tablaverdetallefac;
    }

    public void setTablaverdetallefac(JTable tablaverdetallefac) {
        this.tablaverdetallefac = tablaverdetallefac;
    }

    public JLabel getLdescuento() {
        return ldescuento;
    }

    public void setLdescuento(JLabel ldescuento) {
        this.ldescuento = ldescuento;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpaverdaetafac = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaverdetallefac = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labfactu = new javax.swing.JLabel();
        labprove = new javax.swing.JLabel();
        labfecha = new javax.swing.JLabel();
        labtipopago = new javax.swing.JLabel();
        labusuario = new javax.swing.JLabel();
        labcomprovante = new javax.swing.JLabel();
        labiva = new javax.swing.JLabel();
        labtotalpago = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ldescuento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpaverdaetafac.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Factura");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Proveedor");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("tipo de pago");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("fecha");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Comprovante");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Detalle Factura");

        tablaverdetallefac.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tablaverdetallefac.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tablaverdetallefac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaverdetallefac);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Impuesto iva");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total pago");

        labfactu.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labfactu.setForeground(new java.awt.Color(255, 255, 255));

        labprove.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labprove.setForeground(new java.awt.Color(255, 255, 255));

        labfecha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labfecha.setForeground(new java.awt.Color(255, 255, 255));

        labtipopago.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labtipopago.setForeground(new java.awt.Color(255, 255, 255));

        labusuario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labusuario.setForeground(new java.awt.Color(255, 255, 255));

        labcomprovante.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labcomprovante.setForeground(new java.awt.Color(255, 255, 255));

        labiva.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labiva.setForeground(new java.awt.Color(255, 255, 255));

        labtotalpago.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labtotalpago.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Descuento");

        ldescuento.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ldescuento.setForeground(new java.awt.Color(255, 255, 255));
        ldescuento.setText("d");

        javax.swing.GroupLayout jpaverdaetafacLayout = new javax.swing.GroupLayout(jpaverdaetafac);
        jpaverdaetafac.setLayout(jpaverdaetafacLayout);
        jpaverdaetafacLayout.setHorizontalGroup(
            jpaverdaetafacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaverdaetafacLayout.createSequentialGroup()
                .addGroup(jpaverdaetafacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpaverdaetafacLayout.createSequentialGroup()
                        .addGroup(jpaverdaetafacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpaverdaetafacLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(jpaverdaetafacLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel10)
                                .addGap(36, 36, 36)
                                .addComponent(ldescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)))
                        .addGap(34, 34, 34)
                        .addGroup(jpaverdaetafacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labiva, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labtotalpago, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpaverdaetafacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpaverdaetafacLayout.createSequentialGroup()
                            .addGap(242, 242, 242)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpaverdaetafacLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jpaverdaetafacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(45, 45, 45)
                            .addGroup(jpaverdaetafacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labfactu, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labtipopago, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labprove, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(39, 39, 39)
                            .addGroup(jpaverdaetafacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jpaverdaetafacLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpaverdaetafacLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpaverdaetafacLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(labcomprovante, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jpaverdaetafacLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jpaverdaetafacLayout.setVerticalGroup(
            jpaverdaetafacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaverdaetafacLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpaverdaetafacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(labfactu)
                    .addComponent(labfecha))
                .addGap(18, 18, 18)
                .addGroup(jpaverdaetafacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(labusuario)
                    .addComponent(labprove))
                .addGap(18, 18, 18)
                .addGroup(jpaverdaetafacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(labcomprovante)
                    .addComponent(labtipopago))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jpaverdaetafacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labiva)
                    .addComponent(jLabel10)
                    .addComponent(ldescuento))
                .addGap(18, 18, 18)
                .addGroup(jpaverdaetafacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labtotalpago))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaverdaetafac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpaverdaetafac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpaverdaetafac;
    private javax.swing.JLabel labcomprovante;
    private javax.swing.JLabel labfactu;
    private javax.swing.JLabel labfecha;
    private javax.swing.JLabel labiva;
    private javax.swing.JLabel labprove;
    private javax.swing.JLabel labtipopago;
    private javax.swing.JLabel labtotalpago;
    private javax.swing.JLabel labusuario;
    private javax.swing.JLabel ldescuento;
    private javax.swing.JTable tablaverdetallefac;
    // End of variables declaration//GEN-END:variables
}
