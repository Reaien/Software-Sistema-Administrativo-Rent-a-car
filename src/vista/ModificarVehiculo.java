
package vista;

import controlador.VehiculoController;
import controlador.VendedorController;
import javax.swing.JOptionPane;
import modelo.Validador;
import modelo.Vehiculo;

/**
 *
 * @author Administrador
 */
public class ModificarVehiculo extends javax.swing.JFrame {

    //traer los datos previamente cargados en un objeto vehiculo desde el listar hasta esta interfaz para luego cargarlo en los txt
    public ModificarVehiculo(Vehiculo vehiculo) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.txtModPatente.setText(vehiculo.getPatenteVehiculo());
        this.txtModPatente.setEnabled(false);
        this.txtModMotor.setText(vehiculo.getMotorVehiculo());
        this.txtModChasis.setText(vehiculo.getChasisVehiculo());
        this.txtModMarca.setText(vehiculo.getMarcaVehiculo());
        this.txtModModelo.setText(vehiculo.getModeloVehiculo());
        this.txtModAnio.setText(vehiculo.getAnioVehiculo());
        this.cboModCombustible.setSelectedItem(vehiculo.getCombustibleVehiculo());
        this.cboModTipoVehiculo.setSelectedItem(vehiculo.getTipoVehiculo());        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnModMenu = new javax.swing.JButton();
        lblCreador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblModPatente = new javax.swing.JLabel();
        lblModChasis = new javax.swing.JLabel();
        lblModModelo = new javax.swing.JLabel();
        lblModMotor = new javax.swing.JLabel();
        lblModMarca = new javax.swing.JLabel();
        lblModAnio = new javax.swing.JLabel();
        btnGuardarMod = new javax.swing.JButton();
        btnCleanMod = new javax.swing.JButton();
        txtModPatente = new javax.swing.JTextField();
        txtModChasis = new javax.swing.JTextField();
        txtModModelo = new javax.swing.JTextField();
        txtModMotor = new javax.swing.JTextField();
        txtModMarca = new javax.swing.JTextField();
        txtModAnio = new javax.swing.JTextField();
        btnModVolver = new javax.swing.JButton();
        lblModCombustible = new javax.swing.JLabel();
        lblModTipo = new javax.swing.JLabel();
        cboModCombustible = new javax.swing.JComboBox<>();
        cboModTipoVehiculo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CARmona Autos - Rent a car");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 236, 154));

        btnModMenu.setBackground(new java.awt.Color(255, 236, 154));
        btnModMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModMenu.setForeground(new java.awt.Color(0, 0, 0));
        btnModMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3643769-building-home-house-main-menu-start_113416.png"))); // NOI18N
        btnModMenu.setText("Menu");
        btnModMenu.setBorder(null);
        btnModMenu.setContentAreaFilled(false);
        btnModMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModMenuActionPerformed(evt);
            }
        });

        lblCreador.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblCreador.setForeground(new java.awt.Color(102, 102, 102));
        lblCreador.setText("Ivan Andres Duarte Herrera ®");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnModMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblCreador)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblCreador))
        );

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("      CARmona Autos");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Modificar Vehiculo");

        lblModPatente.setForeground(new java.awt.Color(0, 0, 0));
        lblModPatente.setText("Patente:");

        lblModChasis.setForeground(new java.awt.Color(0, 0, 0));
        lblModChasis.setText("Chasis:");

        lblModModelo.setForeground(new java.awt.Color(0, 0, 0));
        lblModModelo.setText("Modelo:");

        lblModMotor.setForeground(new java.awt.Color(0, 0, 0));
        lblModMotor.setText("Motor:");

        lblModMarca.setForeground(new java.awt.Color(0, 0, 0));
        lblModMarca.setText("Marca: ");

        lblModAnio.setForeground(new java.awt.Color(0, 0, 0));
        lblModAnio.setText("Año vehiculo YYYY:");

        btnGuardarMod.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarMod.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarMod.setText("Guardar");
        btnGuardarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModActionPerformed(evt);
            }
        });

        btnCleanMod.setBackground(new java.awt.Color(255, 255, 255));
        btnCleanMod.setForeground(new java.awt.Color(0, 0, 0));
        btnCleanMod.setText("Limpiar");
        btnCleanMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanModActionPerformed(evt);
            }
        });

        txtModPatente.setBackground(new java.awt.Color(255, 255, 255));
        txtModPatente.setForeground(new java.awt.Color(0, 0, 0));

        txtModChasis.setBackground(new java.awt.Color(255, 255, 255));
        txtModChasis.setForeground(new java.awt.Color(0, 0, 0));

        txtModModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtModModelo.setForeground(new java.awt.Color(0, 0, 0));

        txtModMotor.setBackground(new java.awt.Color(255, 255, 255));
        txtModMotor.setForeground(new java.awt.Color(0, 0, 0));

        txtModMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtModMarca.setForeground(new java.awt.Color(0, 0, 0));

        txtModAnio.setBackground(new java.awt.Color(255, 255, 255));
        txtModAnio.setForeground(new java.awt.Color(0, 0, 0));
        txtModAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModAnioKeyTyped(evt);
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

        lblModCombustible.setForeground(new java.awt.Color(0, 0, 0));
        lblModCombustible.setText("Combustible:");

        lblModTipo.setForeground(new java.awt.Color(0, 0, 0));
        lblModTipo.setText("Tipo de vehiculo:");

        cboModCombustible.setBackground(new java.awt.Color(255, 255, 255));
        cboModCombustible.setForeground(new java.awt.Color(0, 0, 0));
        cboModCombustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Diesel" }));

        cboModTipoVehiculo.setBackground(new java.awt.Color(255, 255, 255));
        cboModTipoVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        cboModTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automovil", "Camioneta" }));

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
                                .addGap(368, 368, 368)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnModVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(217, 217, 217)
                                        .addComponent(btnCleanMod, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblModCombustible)
                                                .addGap(18, 18, 18)
                                                .addComponent(cboModCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblModChasis)
                                                    .addComponent(lblModModelo)
                                                    .addComponent(lblModPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtModPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtModChasis, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtModModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(84, 84, 84)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lblModMarca)
                                                            .addComponent(lblModMotor)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(76, 76, 76)
                                                        .addComponent(lblModAnio)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtModMotor, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                                    .addComponent(txtModMarca)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cboModTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtModAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addComponent(lblModTipo)))))))
                        .addContainerGap(153, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModPatente)
                    .addComponent(lblModMotor)
                    .addComponent(txtModPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModChasis)
                    .addComponent(lblModMarca)
                    .addComponent(txtModChasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModModelo)
                    .addComponent(lblModAnio)
                    .addComponent(txtModModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModCombustible)
                    .addComponent(lblModTipo)
                    .addComponent(cboModCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboModTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnCleanMod, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnModMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModMenuActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModMenuActionPerformed

    private void btnModVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModVolverActionPerformed
        ListarVehiculo vh = new ListarVehiculo();
        vh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModVolverActionPerformed

    private void btnCleanModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanModActionPerformed
        this.txtModMotor.setText("");
        this.txtModChasis.setText("");
        this.txtModMarca.setText("");
        this.txtModModelo.setText("");
        this.txtModAnio.setText("");  
        this.cboModCombustible.setSelectedIndex(0);  
        this.cboModTipoVehiculo.setSelectedIndex(0);  
    }//GEN-LAST:event_btnCleanModActionPerformed

    private void txtModAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModAnioKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtModAnioKeyTyped

    private void btnGuardarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModActionPerformed
        String patente, motor, chasis, marca, modelo, anio_vehiculo, combustible, tipo_vehiculo;
        
        
        patente = this.txtModPatente.getText();
        motor = this.txtModMotor.getText();
        chasis = this.txtModChasis.getText();
        marca = this.txtModMarca.getText();
        modelo = this.txtModModelo.getText();
        anio_vehiculo = this.txtModAnio.getText();
        combustible = this.cboModCombustible.getItemAt(this.cboModCombustible.getSelectedIndex());
        tipo_vehiculo = this.cboModTipoVehiculo.getItemAt(this.cboModTipoVehiculo.getSelectedIndex());
        
        //validador de campos vacios
        Validador v = new Validador();
        if (!v.validaVacio(patente) || !v.validaVacio(motor) || !v.validaVacio(chasis) || !v.validaVacio(marca) 
            || !v.validaVacio(modelo) || !v.validaVacio(anio_vehiculo)|| !v.validaVacio(combustible)|| !v.validaVacio(tipo_vehiculo)) {
            JOptionPane.showMessageDialog(this, "Debe rellenar los campos vacios", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //agregar datos a vehiculo
        Vehiculo vehiculo = new Vehiculo(patente, motor, chasis,marca, modelo, anio_vehiculo, combustible,tipo_vehiculo);
        //llamar la clase controller correspondiente para utilizar el metodo que corresponda
        VehiculoController rgvh = new VehiculoController();
        //llamar metodo del controller
        if(rgvh.actualizarVehiculo(vehiculo)){
            JOptionPane.showMessageDialog(this,"Vehiculo modificado","Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this,"Error","Informacion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarModActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCleanMod;
    private javax.swing.JButton btnGuardarMod;
    private javax.swing.JButton btnModMenu;
    private javax.swing.JButton btnModVolver;
    private javax.swing.JComboBox<String> cboModCombustible;
    private javax.swing.JComboBox<String> cboModTipoVehiculo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCreador;
    private javax.swing.JLabel lblModAnio;
    private javax.swing.JLabel lblModChasis;
    private javax.swing.JLabel lblModCombustible;
    private javax.swing.JLabel lblModMarca;
    private javax.swing.JLabel lblModModelo;
    private javax.swing.JLabel lblModMotor;
    private javax.swing.JLabel lblModPatente;
    private javax.swing.JLabel lblModTipo;
    private javax.swing.JTextField txtModAnio;
    private javax.swing.JTextField txtModChasis;
    private javax.swing.JTextField txtModMarca;
    private javax.swing.JTextField txtModModelo;
    private javax.swing.JTextField txtModMotor;
    private javax.swing.JTextField txtModPatente;
    // End of variables declaration//GEN-END:variables
}
