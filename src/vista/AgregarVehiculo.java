
package vista;

import controlador.VehiculoController;
import javax.swing.JOptionPane;
import modelo.Validador;
import modelo.Vehiculo;

/**
 *
 * @author Administrador
 */
public class AgregarVehiculo extends javax.swing.JFrame {


    public AgregarVehiculo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblCreador = new javax.swing.JLabel();
        lblTituloAddV = new javax.swing.JLabel();
        lblSubTituloAdd = new javax.swing.JLabel();
        lblAddPatente = new javax.swing.JLabel();
        lblAddVehiculo = new javax.swing.JLabel();
        lblAddModelo = new javax.swing.JLabel();
        lblAddMotor = new javax.swing.JLabel();
        lblAddMarca = new javax.swing.JLabel();
        lblAddAnnioV = new javax.swing.JLabel();
        btnAddGuardar = new javax.swing.JButton();
        btnAddLimpiar = new javax.swing.JButton();
        txtAddPatente = new javax.swing.JTextField();
        txtAddChasis = new javax.swing.JTextField();
        txtAddModelo = new javax.swing.JTextField();
        txtAddMotor = new javax.swing.JTextField();
        txtAddMarca = new javax.swing.JTextField();
        txtAddAnioV = new javax.swing.JTextField();
        btnAddVolver = new javax.swing.JButton();
        lblAddCombusitble = new javax.swing.JLabel();
        lblAddTipoV = new javax.swing.JLabel();
        cboAddTipoVehiculo = new javax.swing.JComboBox<>();
        cboAddCombustible = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CARmona Autos - Rent a car");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 236, 154));

        jButton1.setBackground(new java.awt.Color(255, 236, 154));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3643769-building-home-house-main-menu-start_113416.png"))); // NOI18N
        jButton1.setText("Menu");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblCreador.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblCreador.setForeground(new java.awt.Color(102, 102, 102));
        lblCreador.setText("Ivan Andres Duarte Herrera ®");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblCreador)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblCreador))
        );

        lblTituloAddV.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 40)); // NOI18N
        lblTituloAddV.setForeground(new java.awt.Color(51, 51, 51));
        lblTituloAddV.setText("      CARmona Autos");

        lblSubTituloAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSubTituloAdd.setForeground(new java.awt.Color(0, 0, 0));
        lblSubTituloAdd.setText("Agregar Vehiculo");

        lblAddPatente.setForeground(new java.awt.Color(0, 0, 0));
        lblAddPatente.setText("Patente:");

        lblAddVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        lblAddVehiculo.setText("Chasis:");

        lblAddModelo.setForeground(new java.awt.Color(0, 0, 0));
        lblAddModelo.setText("Modelo:");

        lblAddMotor.setForeground(new java.awt.Color(0, 0, 0));
        lblAddMotor.setText("Motor:");

        lblAddMarca.setForeground(new java.awt.Color(0, 0, 0));
        lblAddMarca.setText("Marca: ");

        lblAddAnnioV.setForeground(new java.awt.Color(0, 0, 0));
        lblAddAnnioV.setText("Año vehiculo YYYY:");

        btnAddGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnAddGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnAddGuardar.setText("Guardar");
        btnAddGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGuardarActionPerformed(evt);
            }
        });

        btnAddLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnAddLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnAddLimpiar.setText("Limpiar");
        btnAddLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLimpiarActionPerformed(evt);
            }
        });

        txtAddPatente.setBackground(new java.awt.Color(255, 255, 255));
        txtAddPatente.setForeground(new java.awt.Color(0, 0, 0));

        txtAddChasis.setBackground(new java.awt.Color(255, 255, 255));
        txtAddChasis.setForeground(new java.awt.Color(0, 0, 0));

        txtAddModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtAddModelo.setForeground(new java.awt.Color(0, 0, 0));

        txtAddMotor.setBackground(new java.awt.Color(255, 255, 255));
        txtAddMotor.setForeground(new java.awt.Color(0, 0, 0));

        txtAddMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtAddMarca.setForeground(new java.awt.Color(0, 0, 0));

        txtAddAnioV.setBackground(new java.awt.Color(255, 255, 255));
        txtAddAnioV.setForeground(new java.awt.Color(0, 0, 0));
        txtAddAnioV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddAnioVKeyTyped(evt);
            }
        });

        btnAddVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnAddVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnAddVolver.setText("Volver");
        btnAddVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVolverActionPerformed(evt);
            }
        });

        lblAddCombusitble.setForeground(new java.awt.Color(0, 0, 0));
        lblAddCombusitble.setText("Combustible:");

        lblAddTipoV.setForeground(new java.awt.Color(0, 0, 0));
        lblAddTipoV.setText("Tipo de vehiculo:");

        cboAddTipoVehiculo.setBackground(new java.awt.Color(255, 255, 255));
        cboAddTipoVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        cboAddTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automovil", "Camioneta" }));

        cboAddCombustible.setBackground(new java.awt.Color(255, 255, 255));
        cboAddCombustible.setForeground(new java.awt.Color(0, 0, 0));
        cboAddCombustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Diesel" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(lblSubTituloAdd))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(lblTituloAddV, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblAddCombusitble)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboAddCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAddVehiculo)
                                            .addComponent(lblAddModelo)
                                            .addComponent(lblAddPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAddPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAddChasis, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAddModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(84, 84, 84)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblAddMarca)
                                                    .addComponent(lblAddMotor)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(lblAddAnnioV)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAddMotor, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                            .addComponent(txtAddMarca)
                                            .addComponent(txtAddAnioV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(lblAddTipoV)
                                        .addGap(34, 34, 34)
                                        .addComponent(cboAddTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAddVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(217, 217, 217)
                                .addComponent(btnAddLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnAddGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblTituloAddV)
                .addGap(18, 18, 18)
                .addComponent(lblSubTituloAdd)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddPatente)
                    .addComponent(lblAddMotor)
                    .addComponent(txtAddPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddVehiculo)
                    .addComponent(lblAddMarca)
                    .addComponent(txtAddChasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddModelo)
                    .addComponent(lblAddAnnioV)
                    .addComponent(txtAddModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddAnioV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddCombusitble)
                    .addComponent(lblAddTipoV)
                    .addComponent(cboAddTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboAddCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnAddLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVolverActionPerformed
        ListarVehiculo vh = new ListarVehiculo();
        vh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddVolverActionPerformed

    private void btnAddGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGuardarActionPerformed
        String patente, motor, chasis, marca, modelo, anio_vehiculo, combustible, tipo_vehiculo; 
        
        patente = this.txtAddPatente.getText();
        motor = this.txtAddMotor.getText();
        chasis = this.txtAddChasis.getText();
        marca = this.txtAddMarca.getText();
        modelo = this.txtAddModelo.getText();
        anio_vehiculo = this.txtAddAnioV.getText();
        combustible = this.cboAddCombustible.getSelectedItem().toString();
        tipo_vehiculo = this.cboAddTipoVehiculo.getSelectedItem().toString();


        Validador v = new Validador();
        if (!v.validaVacio(patente)|| !v.validaVacio(motor)|| !v.validaVacio(chasis)
            || !v.validaVacio(marca)|| !v.validaVacio(modelo)) { 
            JOptionPane.showMessageDialog(this, "Debe rellenar los campos vacios", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }        
        
        
        Vehiculo vehiculo = new Vehiculo(patente, motor, chasis, marca, modelo, anio_vehiculo, combustible, tipo_vehiculo);
        
        VehiculoController rg = new VehiculoController();

        
        //validador de patente
        if (rg.buscarVehiculo(patente).getPatenteVehiculo()==null) {
            if (rg.agregarVehiculo(vehiculo)){
                JOptionPane.showMessageDialog(this, "Vehiculo agregado con EXITO!!", "Información",JOptionPane.INFORMATION_MESSAGE );
            }else{
                JOptionPane.showMessageDialog(this, "Vehiculo NO fue agregado", "Error",JOptionPane.ERROR_MESSAGE );
            }
        }else{
           JOptionPane.showMessageDialog(this, "N de patente ya registrada: " + patente + " Ya existe en la base de datos!", "Validación",JOptionPane.WARNING_MESSAGE ); 
        }        
        
        
    }//GEN-LAST:event_btnAddGuardarActionPerformed

    private void btnAddLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLimpiarActionPerformed
        this.txtAddPatente.setText("");
        this.txtAddMotor.setText("");
        this.txtAddChasis.setText("");
        this.txtAddMarca.setText("");
        this.txtAddModelo.setText("");
        this.txtAddAnioV.setText("");  
        this.cboAddCombustible.setSelectedIndex(0);  
        this.cboAddTipoVehiculo.setSelectedIndex(0);  
    }//GEN-LAST:event_btnAddLimpiarActionPerformed

    private void txtAddAnioVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddAnioVKeyTyped
        //metodo para solo ingresar numeros
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAddAnioVKeyTyped



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddGuardar;
    private javax.swing.JButton btnAddLimpiar;
    private javax.swing.JButton btnAddVolver;
    private javax.swing.JComboBox<String> cboAddCombustible;
    private javax.swing.JComboBox<String> cboAddTipoVehiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddAnnioV;
    private javax.swing.JLabel lblAddCombusitble;
    private javax.swing.JLabel lblAddMarca;
    private javax.swing.JLabel lblAddModelo;
    private javax.swing.JLabel lblAddMotor;
    private javax.swing.JLabel lblAddPatente;
    private javax.swing.JLabel lblAddTipoV;
    private javax.swing.JLabel lblAddVehiculo;
    private javax.swing.JLabel lblCreador;
    private javax.swing.JLabel lblSubTituloAdd;
    private javax.swing.JLabel lblTituloAddV;
    private javax.swing.JTextField txtAddAnioV;
    private javax.swing.JTextField txtAddChasis;
    private javax.swing.JTextField txtAddMarca;
    private javax.swing.JTextField txtAddModelo;
    private javax.swing.JTextField txtAddMotor;
    private javax.swing.JTextField txtAddPatente;
    // End of variables declaration//GEN-END:variables
}
