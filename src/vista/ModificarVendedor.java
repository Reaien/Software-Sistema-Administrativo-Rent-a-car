package vista;

import controlador.VendedorController;
import javax.swing.JOptionPane;
import modelo.Validador;
import modelo.Vendedor;


/**
 *
 * @author Administrador
 */
public class ModificarVendedor extends javax.swing.JFrame {

    //traer los datos previamente cargados en un objeto vendedor desde el listar hasta esta interfaz para luego cargarlo en los txt
    public ModificarVendedor(Vendedor vendedor) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.txtModRutVendedor.setText(vendedor.getRutVendedor());
        this.txtModRutVendedor.setEnabled(false);
        this.txtModDvVendedor.setText(vendedor.getDigVer());
        this.txtModDvVendedor.setEnabled(false);
        this.txtModNombreVendedor.setText(vendedor.getNombreVendedor());
        this.txtModMailVendedor.setText(vendedor.getMailVendedor());
        this.txtModDireccVendedor.setText(vendedor.getDireccionVendedor());
        this.txtModTelefonoVendedor.setText(vendedor.getFonoVendedor());        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnModVendVolver = new javax.swing.JButton();
        lblCreador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblModRut = new javax.swing.JLabel();
        lblModDv = new javax.swing.JLabel();
        lblModNombre = new javax.swing.JLabel();
        lblModDireccion = new javax.swing.JLabel();
        lblModMail = new javax.swing.JLabel();
        lblModFono = new javax.swing.JLabel();
        btnGuardarModVendedor = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtModRutVendedor = new javax.swing.JTextField();
        txtModDvVendedor = new javax.swing.JTextField();
        txtModNombreVendedor = new javax.swing.JTextField();
        txtModDireccVendedor = new javax.swing.JTextField();
        txtModMailVendedor = new javax.swing.JTextField();
        txtModTelefonoVendedor = new javax.swing.JTextField();
        btnModVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CARmona Autos - Rent a car");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 236, 154));

        btnModVendVolver.setBackground(new java.awt.Color(255, 236, 154));
        btnModVendVolver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModVendVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnModVendVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3643769-building-home-house-main-menu-start_113416.png"))); // NOI18N
        btnModVendVolver.setText("Menu");
        btnModVendVolver.setBorder(null);
        btnModVendVolver.setContentAreaFilled(false);
        btnModVendVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModVendVolver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModVendVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModVendVolverActionPerformed(evt);
            }
        });

        lblCreador.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblCreador.setForeground(new java.awt.Color(102, 102, 102));
        lblCreador.setText("Ivan Andres Duarte Herrera ®");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnModVendVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblCreador)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModVendVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lblCreador))
        );

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("      CARmona Autos");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Modificar Vendedor");

        lblModRut.setForeground(new java.awt.Color(0, 0, 0));
        lblModRut.setText("Rut:");

        lblModDv.setForeground(new java.awt.Color(0, 0, 0));
        lblModDv.setText("Digito verificador:");

        lblModNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblModNombre.setText("Nombre:");

        lblModDireccion.setForeground(new java.awt.Color(0, 0, 0));
        lblModDireccion.setText("Direccion: ");

        lblModMail.setForeground(new java.awt.Color(0, 0, 0));
        lblModMail.setText("Correo electronico: ");

        lblModFono.setForeground(new java.awt.Color(0, 0, 0));
        lblModFono.setText("Telefono:");

        btnGuardarModVendedor.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarModVendedor.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarModVendedor.setText("Guardar");
        btnGuardarModVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModVendedorActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtModRutVendedor.setBackground(new java.awt.Color(255, 255, 255));
        txtModRutVendedor.setForeground(new java.awt.Color(0, 0, 0));
        txtModRutVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModRutVendedorKeyTyped(evt);
            }
        });

        txtModDvVendedor.setBackground(new java.awt.Color(255, 255, 255));
        txtModDvVendedor.setForeground(new java.awt.Color(0, 0, 0));

        txtModNombreVendedor.setBackground(new java.awt.Color(255, 255, 255));
        txtModNombreVendedor.setForeground(new java.awt.Color(0, 0, 0));

        txtModDireccVendedor.setBackground(new java.awt.Color(255, 255, 255));
        txtModDireccVendedor.setForeground(new java.awt.Color(0, 0, 0));

        txtModMailVendedor.setBackground(new java.awt.Color(255, 255, 255));
        txtModMailVendedor.setForeground(new java.awt.Color(0, 0, 0));

        txtModTelefonoVendedor.setBackground(new java.awt.Color(255, 255, 255));
        txtModTelefonoVendedor.setForeground(new java.awt.Color(0, 0, 0));
        txtModTelefonoVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModTelefonoVendedorKeyTyped(evt);
            }
        });

        btnModVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnModVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnModVolver.setText("Volver");
        btnModVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblModRut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtModRutVendedor))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblModDv)
                                                    .addComponent(lblModNombre))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtModDvVendedor)
                                                    .addComponent(txtModNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(btnModVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblModDireccion)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtModDireccVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblModMail)
                                                    .addComponent(lblModFono, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtModMailVendedor)
                                                    .addComponent(txtModTelefonoVendedor)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(368, 368, 368)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(98, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarModVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModRut)
                    .addComponent(lblModDireccion)
                    .addComponent(txtModRutVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModDireccVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModDv)
                    .addComponent(lblModMail)
                    .addComponent(txtModDvVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModMailVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModNombre)
                    .addComponent(lblModFono)
                    .addComponent(txtModNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModTelefonoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarModVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModVendVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModVendVolverActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModVendVolverActionPerformed

    private void btnModVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModVolverActionPerformed
        ListarVendedor v = new ListarVendedor();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModVolverActionPerformed

    private void btnGuardarModVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModVendedorActionPerformed
        String rutVendedor, digVerVen, nombreVendedor,fonoVendedor, mailVendedor, direccionVendedor;
        
        
        rutVendedor = this.txtModRutVendedor.getText();
        digVerVen = this.txtModDvVendedor.getText();
        nombreVendedor = this.txtModNombreVendedor.getText();
        fonoVendedor = this.txtModTelefonoVendedor.getText();
        mailVendedor = this.txtModMailVendedor.getText();
        direccionVendedor = this.txtModDireccVendedor.getText();
        
        Validador v = new Validador();
        if (!v.validaVacio(rutVendedor) || !v.validaVacio(digVerVen) || !v.validaVacio(nombreVendedor) || !v.validaVacio(direccionVendedor) 
            || !v.validaVacio(mailVendedor) || !v.validaVacio(fonoVendedor)) {
            JOptionPane.showMessageDialog(this, "Debe rellenar los campos vacios", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //rellenar instancia
        Vendedor vendedor = new Vendedor(rutVendedor, digVerVen, nombreVendedor,direccionVendedor, mailVendedor, fonoVendedor);
        //llamar la clase controller correspondiente para utilizar el metodo que corresponda
        VendedorController rgv = new VendedorController();
        //llamar metodo del controller
        if(rgv.actualizarVendedor(vendedor)){
            JOptionPane.showMessageDialog(this,"Vendedor modificado","Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this,"Error","Informacion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarModVendedorActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.txtModNombreVendedor.setText("");
        this.txtModTelefonoVendedor.setText("");
        this.txtModMailVendedor.setText("");
        this.txtModDireccVendedor.setText("");        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtModTelefonoVendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModTelefonoVendedorKeyTyped
        //metodo para solo ingresar numeros
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtModTelefonoVendedorKeyTyped

    private void txtModRutVendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModRutVendedorKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtModRutVendedorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarModVendedor;
    private javax.swing.JButton btnModVendVolver;
    private javax.swing.JButton btnModVolver;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCreador;
    private javax.swing.JLabel lblModDireccion;
    private javax.swing.JLabel lblModDv;
    private javax.swing.JLabel lblModFono;
    private javax.swing.JLabel lblModMail;
    private javax.swing.JLabel lblModNombre;
    private javax.swing.JLabel lblModRut;
    private javax.swing.JTextField txtModDireccVendedor;
    private javax.swing.JTextField txtModDvVendedor;
    private javax.swing.JTextField txtModMailVendedor;
    private javax.swing.JTextField txtModNombreVendedor;
    private javax.swing.JTextField txtModRutVendedor;
    private javax.swing.JTextField txtModTelefonoVendedor;
    // End of variables declaration//GEN-END:variables
}
