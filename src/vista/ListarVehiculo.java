/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.VehiculoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Validador;
import modelo.Vehiculo;

/**
 *
 * @author Administrador
 */
public class ListarVehiculo extends javax.swing.JFrame {

    
    VehiculoController rgvh = new VehiculoController();
    //iniciar con carga de tabla bd 
    public ListarVehiculo() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        String patente, motor, chasis, marca, modelo, anio_vehiculo, combustible, tipo_vehiculo;
        
        DefaultTableModel modeloVh = (DefaultTableModel) this.tblVehiculo.getModel();
        
        modeloVh.setRowCount(0);
        patente= this.txtBuscarPatente.getText();
        if (patente.isEmpty()) {
            ArrayList<Vehiculo> lista = rgvh.llenarTableVehiculos();
            for(Vehiculo vh : lista){
                patente=vh.getPatenteVehiculo(); 
                motor=vh.getMotorVehiculo();
                chasis=vh.getChasisVehiculo(); 
                marca=vh.getMarcaVehiculo();
                modelo=vh.getModeloVehiculo();
                anio_vehiculo=vh.getAnioVehiculo(); 
                combustible=vh.getCombustibleVehiculo();
                tipo_vehiculo=vh.getTipoVehiculo();
                
                modeloVh.addRow(new Object[]{patente, motor, chasis, marca, modelo, anio_vehiculo, combustible, tipo_vehiculo});
            }
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblCreador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculo = new javax.swing.JTable();
        btnDeleteVehiculo = new javax.swing.JButton();
        btnEditVehiculo = new javax.swing.JButton();
        btnAddVehiculo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtBuscarPatente = new javax.swing.JTextField();
        btnBuscarPatente = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();

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

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("      CARmona Autos");

        tblVehiculo.setBackground(new java.awt.Color(255, 255, 255));
        tblVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patente", "Motor", "Chasis", "Marca", "Modelo", "Anio Vehiculo", "Tipo Combustible", "Tipo Vehiculo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVehiculo);

        btnDeleteVehiculo.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        btnDeleteVehiculo.setText("Eliminar registro");
        btnDeleteVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteVehiculoActionPerformed(evt);
            }
        });

        btnEditVehiculo.setBackground(new java.awt.Color(255, 255, 255));
        btnEditVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        btnEditVehiculo.setText("Editar registro");
        btnEditVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditVehiculoActionPerformed(evt);
            }
        });

        btnAddVehiculo.setBackground(new java.awt.Color(255, 255, 255));
        btnAddVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        btnAddVehiculo.setText("Agregar registro");
        btnAddVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVehiculoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Vehiculo");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar patente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        txtBuscarPatente.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarPatente.setForeground(new java.awt.Color(0, 0, 0));

        btnBuscarPatente.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarPatente.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarPatente.setText("Buscar");
        btnBuscarPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPatenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(txtBuscarPatente, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarPatente)
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPatente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnClean.setBackground(new java.awt.Color(255, 255, 255));
        btnClean.setForeground(new java.awt.Color(0, 0, 0));
        btnClean.setText("Recargar tabla");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
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
                        .addGap(392, 392, 392)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnDeleteVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAddVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(173, 173, 173))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 152, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(33, 33, 33)
                                .addComponent(btnEditVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
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

    private void btnBuscarPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPatenteActionPerformed
        DefaultTableModel modeloVh = (DefaultTableModel) this.tblVehiculo.getModel();
        modeloVh.setRowCount(0); //limpiar tabla y mostrar solo 1 resultado buscado
        
        String patente, motor, chasis, marca, modelo, anio_vehiculo, combustible, tipo_vehiculo;
        
        patente = this.txtBuscarPatente.getText();
        
        Validador v = new Validador();
        if (!v.validaVacio(patente)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una patente", "Validación", JOptionPane.WARNING_MESSAGE);
            return;            
        }        
        
        Vehiculo vehiculo = rgvh.buscarVehiculo(patente);
        motor = vehiculo.getMotorVehiculo();
        chasis = vehiculo.getChasisVehiculo();
        marca = vehiculo.getMarcaVehiculo();
        modelo = vehiculo.getModeloVehiculo();
        anio_vehiculo = vehiculo.getAnioVehiculo();        
        combustible = vehiculo.getCombustibleVehiculo();       
        tipo_vehiculo = vehiculo.getTipoVehiculo();
        
        modeloVh.addRow(new Object[]{patente, motor, chasis, marca, modelo, anio_vehiculo, combustible, tipo_vehiculo});
                
    }//GEN-LAST:event_btnBuscarPatenteActionPerformed

    private void btnEditVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditVehiculoActionPerformed
        int fila = this.tblVehiculo.getSelectedRow(); //validar fila seleccionada
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila", "Validación", JOptionPane.WARNING_MESSAGE);
            this.tblVehiculo.requestFocus();
            return;
        } else{
            
            Vehiculo vehiculo = new Vehiculo();
            
            vehiculo.setPatenteVehiculo((String) this.tblVehiculo.getValueAt(fila, 0));
            vehiculo.setMotorVehiculo((String) this.tblVehiculo.getValueAt(fila, 1));
            vehiculo.setChasisVehiculo((String) this.tblVehiculo.getValueAt(fila, 2));
            vehiculo.setMarcaVehiculo((String) this.tblVehiculo.getValueAt(fila, 3));
            vehiculo.setModeloVehiculo((String) this.tblVehiculo.getValueAt(fila, 4));
            vehiculo.setAnioVehiculo((String) this.tblVehiculo.getValueAt(fila, 5));
            vehiculo.setCombustibleVehiculo((String) this.tblVehiculo.getValueAt(fila, 6));
            vehiculo.setTipoVehiculo((String) this.tblVehiculo.getValueAt(fila, 7));
            
            
            ModificarVehiculo mVh = new ModificarVehiculo(vehiculo);
            mVh.setVisible(true);
            this.setVisible(false);            
        }         
        
        





    }//GEN-LAST:event_btnEditVehiculoActionPerformed

    private void btnAddVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVehiculoActionPerformed
        AgregarVehiculo addVh = new AgregarVehiculo();
        addVh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddVehiculoActionPerformed

    private void btnDeleteVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteVehiculoActionPerformed
       int fila = this.tblVehiculo.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila", "Validación", JOptionPane.WARNING_MESSAGE);
            this.tblVehiculo.requestFocus();
            return;
        } else {
            String patente = (String) this.tblVehiculo.getValueAt(fila, 0);
            if (rgvh.eliminarVehiculo(patente)) {
                JOptionPane.showMessageDialog(this, "Se eliminó correctamente el vehiculo con patente n°: " + patente, "Información", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel modeloVh = (DefaultTableModel) this.tblVehiculo.getModel();
                modeloVh.setRowCount(0); //limpiar tabla y mostrar solo 1 resultado                
            } else {
                JOptionPane.showMessageDialog(this, "No se eliminó el vehiculo con patente n°: " + patente, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }        
    }//GEN-LAST:event_btnDeleteVehiculoActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        ListarVehiculo lvh = new ListarVehiculo();
        lvh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCleanActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVehiculo;
    private javax.swing.JButton btnBuscarPatente;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDeleteVehiculo;
    private javax.swing.JButton btnEditVehiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreador;
    private javax.swing.JTable tblVehiculo;
    private javax.swing.JTextField txtBuscarPatente;
    // End of variables declaration//GEN-END:variables
}