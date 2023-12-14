
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author HuevosFundidos
 */
public class Usuario extends javax.swing.JFrame {

  
    public Usuario() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPanelUsuario = new javax.swing.JPanel();
        lblNuevoUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnGuardarUsuario = new javax.swing.JButton();
        txtDocumento = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        jcbGenero = new javax.swing.JComboBox<>();
        jcbCargo = new javax.swing.JComboBox<>();
        jpClave = new javax.swing.JPasswordField();
        JDFechadeNacimiento = new com.toedter.calendar.JDateChooser();
        btnVisibilidad = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cbxtipodedocumento = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpPanelUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jpPanelUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpPanelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNuevoUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        lblNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuevoUsuario.setText("NUEVO USUARIO");
        jpPanelUsuario.add(lblNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 412, 67));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Documento");
        jpPanelUsuario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 109, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre");
        jpPanelUsuario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 143, 46, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Telefono");
        jpPanelUsuario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 177, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Correo");
        jpPanelUsuario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 211, 46, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de Nacimiento");
        jpPanelUsuario.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Direccion");
        jpPanelUsuario.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 273, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sexo");
        jpPanelUsuario.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 307, 31, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("cargo");
        jpPanelUsuario.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 30, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Login");
        jpPanelUsuario.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 377, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Contraseña");
        jpPanelUsuario.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 399, -1, 22));

        btnGuardarUsuario.setText("Guardar");
        btnGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUsuarioActionPerformed(evt);
            }
        });
        jpPanelUsuario.add(btnGuardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 441, 99, -1));
        jpPanelUsuario.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 104, 277, -1));
        jpPanelUsuario.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 138, 279, -1));
        jpPanelUsuario.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 172, 279, -1));

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jpPanelUsuario.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 206, 279, -1));
        jpPanelUsuario.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 268, 276, -1));
        jpPanelUsuario.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 282, -1));

        jpPanelUsuario.add(jcbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 302, 282, -1));

        jpPanelUsuario.add(jcbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 282, -1));

        jpClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpClaveActionPerformed(evt);
            }
        });
        jpPanelUsuario.add(jpClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 398, 235, -1));

        JDFechadeNacimiento.setDateFormatString("yyyy/MM/dd");
        jpPanelUsuario.add(JDFechadeNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 276, -1));

        btnVisibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ojo-Cerrado.png"))); // NOI18N
        jpPanelUsuario.add(btnVisibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 401, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tipo de Documento");
        jpPanelUsuario.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 74, -1, 16));

        cbxtipodedocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione", "cc", "contraseña", "pasaporte", "otros" }));
        jpPanelUsuario.add(cbxtipodedocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 70, 277, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jpPanelUsuario.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPanelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jpClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpClaveActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarUsuarioActionPerformed

    public JLabel getLblNuevoUsuario() {
        return lblNuevoUsuario;
    }

    public void setLblNuevoUsuario(JLabel lblNuevoUsuario) {
        this.lblNuevoUsuario = lblNuevoUsuario;
    }

    public JPanel getJpPanelUsuario() {
        return jpPanelUsuario;
    }

    public void setJpPanelUsuario(JPanel jpPanelUsuario) {
        this.jpPanelUsuario = jpPanelUsuario;
    }

    public JDateChooser getJDFechadeNaci() {
        return JDFechadeNacimiento;
    }

    public void setJDFechadeNaci(JDateChooser JDFechadeNacimiento) {
        this.JDFechadeNacimiento = JDFechadeNacimiento;
    }

    public JComboBox<String> getCbxtipodocu() {
        return cbxtipodedocumento;
    }

    public void setCbxtipodocu(JComboBox<String> cbxtipodedocumento) {
        this.cbxtipodedocumento = cbxtipodedocumento;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnGuardarUsuario() {
        return btnGuardarUsuario;
    }

    public void setBtnGuardarUsuario(JButton btnGuardarUsuario) {
        this.btnGuardarUsuario = btnGuardarUsuario;
    }

    public JButton getBtnVisibilidad() {
        return btnVisibilidad;
    }

    public void setBtnVisibilidad(JButton btnVisibilidad) {
        this.btnVisibilidad = btnVisibilidad;
    }

    public JComboBox<String> getJcbCargo() {
        return jcbCargo;
    }

    public void setJcbCargo(JComboBox<String> jcbCargo) {
        this.jcbCargo = jcbCargo;
    }

    public JComboBox<String> getJcbsexo() {
        return jcbGenero;
    }

    public void setJcbsexo(JComboBox<String> jcbGenero) {
        this.jcbGenero = jcbGenero;
    }

    public JPasswordField getJpContra() {
        return jpClave;
    }

    public void setJpContra(JPasswordField jpClave) {
        this.jpClave = jpClave;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtDocumento() {
        return txtDocumento;
    }

    public void setTxtDocumento(JTextField txtDocumento) {
        this.txtDocumento = txtDocumento;
    }

    public JTextField getTxtLogin() {
        return txtLogin;
    }

    public void setTxtLogin(JTextField txtLogin) {
        this.txtLogin = txtLogin;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDFechadeNacimiento;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarUsuario;
    private javax.swing.JButton btnVisibilidad;
    private javax.swing.JComboBox<String> cbxtipodedocumento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jcbCargo;
    private javax.swing.JComboBox<String> jcbGenero;
    private javax.swing.JPasswordField jpClave;
    private javax.swing.JPanel jpPanelUsuario;
    private javax.swing.JLabel lblNuevoUsuario;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
