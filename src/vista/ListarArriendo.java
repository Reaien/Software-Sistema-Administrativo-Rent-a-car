
package vista;

import controlador.ArriendoController;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Arriendo;
import modelo.Validador;

/**
 *
 * @author Administrador
 */
public class ListarArriendo extends javax.swing.JFrame {

    
    ArriendoController rga = new ArriendoController();
    
    //metodo para traer datos de la tabla y llenar table desde la bd
    public ListarArriendo() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        String idArriendo;
        Date fechaInicioArriendo;        
        Date fechaFinArriendo;
        int valorArriendo;
        String observacion;
        String rutCliente;
        String rutVendedor;
        String patente;
        
        DefaultTableModel modelo = (DefaultTableModel) this.tblArriendo.getModel();
        modelo.setRowCount(0);
        idArriendo = this.txtArriendo.getText();
        
        if (idArriendo.isEmpty()) {
            ArrayList<Arriendo> lista = rga.llenarTableArriendos();
            for(Arriendo arr : lista){
                idArriendo = arr.getIdArriendo();
                fechaInicioArriendo = arr.getFechaInicioArriendo();
                fechaFinArriendo = arr.getFechaFinArriendo();
                valorArriendo = arr.getValorArriendo();
                observacion = arr.getObservacionArriendo();
                rutCliente = arr.getRutCliente();
                rutVendedor = arr.getRutVendedor();
                patente = arr.getPatente();
                
                modelo.addRow(new Object[]{idArriendo, fechaInicioArriendo, fechaFinArriendo, valorArriendo, observacion, rutCliente, rutVendedor, patente});
            }
        }
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtArriendo = new javax.swing.JTextField();
        btnBuscarArriendo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblCreador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArriendo = new javax.swing.JTable();
        btnEliminarArriendo = new javax.swing.JButton();
        btnCrearArriendo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnEditarArriendo = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CARmona Autos - Rent a car");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar N° de contrado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        txtArriendo.setBackground(new java.awt.Color(255, 255, 255));
        txtArriendo.setForeground(new java.awt.Color(0, 0, 0));
        txtArriendo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtArriendoKeyTyped(evt);
            }
        });

        btnBuscarArriendo.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarArriendo.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarArriendo.setText("Buscar");
        btnBuscarArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarArriendoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(txtArriendo, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarArriendo)
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarArriendo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                .addGap(24, 24, 24)
                .addComponent(lblCreador))
        );

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("      CARmona Autos");

        tblArriendo.setBackground(new java.awt.Color(255, 255, 255));
        tblArriendo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Contrato", "Fecha Inicio contrado", "Fecha fin contrato", "Valor arriendo", "Observacion", "Rut Cliente", "Rut Vendedor", "Patente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblArriendo);

        btnEliminarArriendo.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarArriendo.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarArriendo.setText("Eliminar contrato");
        btnEliminarArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarArriendoActionPerformed(evt);
            }
        });

        btnCrearArriendo.setBackground(new java.awt.Color(255, 255, 255));
        btnCrearArriendo.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearArriendo.setText("Crear arriendo");
        btnCrearArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArriendoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contrato de arriendo");

        btnEditarArriendo.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarArriendo.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarArriendo.setText("Editar arriendo");
        btnEditarArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarArriendoActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(206, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEliminarArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(btnCrearArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditarArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(214, 214, 214))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(156, 156, 156)
                                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnBuscarArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarArriendoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.tblArriendo.getModel();
        modelo.setRowCount(0);
        
        String idArriendo;
        Date fechaInicioArriendo;        
        Date fechaFinArriendo;
        int valorArriendo;
        String observacion;
        String rutCliente;
        String rutVendedor;
        String patente;


        idArriendo = this.txtArriendo.getText();
        
        Validador v = new Validador();
        if (!v.validaVacio(idArriendo)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero de contrato de arriendo", "Validación", JOptionPane.WARNING_MESSAGE);
            return;            
        }        
        
        Arriendo arriendo = rga.buscarArriendo(idArriendo);
        fechaInicioArriendo = arriendo.getFechaInicioArriendo();
        fechaFinArriendo = arriendo.getFechaFinArriendo();
        valorArriendo = arriendo.getValorArriendo();
        observacion = arriendo.getObservacionArriendo();
        rutCliente = arriendo.getRutCliente();
        rutVendedor = arriendo.getRutVendedor();
        patente = arriendo.getPatente();
        
        //llenar fila
        modelo.addRow(new Object[]{idArriendo, fechaInicioArriendo, fechaFinArriendo, valorArriendo, observacion, rutCliente, rutVendedor, patente});
        
                
        
    }//GEN-LAST:event_btnBuscarArriendoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCrearArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArriendoActionPerformed
        AgregarArriendo cc = new AgregarArriendo();
        cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCrearArriendoActionPerformed

    private void btnEditarArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarArriendoActionPerformed
        
        int fila = this.tblArriendo.getSelectedRow(); //validacion fila seleccionada
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila", "Validación", JOptionPane.WARNING_MESSAGE);
            this.tblArriendo.requestFocus();
            return;
        } else{
            
            Arriendo arriendo = new Arriendo();
            
            arriendo.setIdArriendo((String) this.tblArriendo.getValueAt(fila, 0)); //se selecciona la columna 0 de la fila seleccionada
            arriendo.setFechaInicioArriendo((Date) this.tblArriendo.getValueAt(fila, 1));
            arriendo.setFechaFinArriendo((Date) this.tblArriendo.getValueAt(fila, 2));
            arriendo.setValorArriendo((int) this.tblArriendo.getValueAt(fila, 3));
            arriendo.setObservacionArriendo((String) this.tblArriendo.getValueAt(fila, 4));
            arriendo.setRutCliente((String) this.tblArriendo.getValueAt(fila, 5));
            arriendo.setRutVendedor((String) this.tblArriendo.getValueAt(fila, 6));            
            arriendo.setPatente((String) this.tblArriendo.getValueAt(fila, 7)); 
            
        
            ModificarArriendo ma = new ModificarArriendo(arriendo);
            ma.setVisible(true);
            this.setVisible(false);
        }        
        
        
        
        

    }//GEN-LAST:event_btnEditarArriendoActionPerformed

    private void btnEliminarArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarArriendoActionPerformed
        int fila = this.tblArriendo.getSelectedRow(); //validacion fila seleccionada
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila", "Validación", JOptionPane.WARNING_MESSAGE);
            this.tblArriendo.requestFocus();
            return;
        } else {
            //obtengo el pasaporte de la fila seleccionada 
            String ncontrato = (String) this.tblArriendo.getValueAt(fila, 0);
            if (rga.eliminarArriendo(ncontrato)) {
                JOptionPane.showMessageDialog(this, "Se eliminó correctamente el cliente con rut: " + ncontrato, "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se eliminó el cliente con rut: " + ncontrato, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
            
    }//GEN-LAST:event_btnEliminarArriendoActionPerformed

    private void txtArriendoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtArriendoKeyTyped
        //metodo para solo ingresar numeros
        
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtArriendoKeyTyped

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        ListarArriendo la = new ListarArriendo();
        la.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCleanActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarArriendo;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnCrearArriendo;
    private javax.swing.JButton btnEditarArriendo;
    private javax.swing.JButton btnEliminarArriendo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreador;
    private javax.swing.JTable tblArriendo;
    private javax.swing.JTextField txtArriendo;
    // End of variables declaration//GEN-END:variables
}
