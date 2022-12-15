
package vista;

import controlador.ArriendoController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Arriendo;

/**
 *
 * @author Administrador
 */
public class ModificarArriendo extends javax.swing.JFrame {
    //llamar la clase controller correspondiente para utilizar el metodo que corresponda mas abajo
    ArriendoController rga = new ArriendoController();
    
    //traer los datos previamente cargados en un objeto arriendo desde el listar hasta esta interfaz para luego cargarlo en los txt
    public ModificarArriendo(Arriendo arriendo) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        this.txtModNArriendo.setText(arriendo.getIdArriendo());
        this.txtModNArriendo.setEnabled(false);
        this.txtModArriendoRutC.setText(arriendo.getRutCliente());
        this.txtModArriendoRutC.setEnabled(false);
        this.txtModArriendoRutV.setText(arriendo.getRutVendedor());
        this.txtModArriendoRutV.setEnabled(false);
        this.txtModArriendoPatente.setText(arriendo.getPatente());
        this.txtModArriendoPatente.setEnabled(false);
        this.txtModArriendoFechaInicio.setText(arriendo.getFechaInicioArriendo().toString());
        this.txtModArriendoFechaInicio.setEnabled(false);
        this.txtModArriendoFechaFin.setText(arriendo.getFechaFinArriendo().toString());
        this.txtModArriendoFechaFin.setEnabled(false);
        this.txtModArriendoValor.setText(String.valueOf(arriendo.getValorArriendo())); //obtener el int de valor y pasarlo a str para settext
        this.txtModArriendoObs.setText(arriendo.getObservacionArriendo());
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
        lblModNContrato = new javax.swing.JLabel();
        lblModArriendoRutC = new javax.swing.JLabel();
        lblModArriendoRutV = new javax.swing.JLabel();
        lblModArriendoFechaInicio = new javax.swing.JLabel();
        lblModArriendoFechaFin = new javax.swing.JLabel();
        lblModArriendoValor = new javax.swing.JLabel();
        btnGuardarModArriendo = new javax.swing.JButton();
        btnLimpiarModArriendo = new javax.swing.JButton();
        txtModNArriendo = new javax.swing.JTextField();
        txtModArriendoRutC = new javax.swing.JTextField();
        txtModArriendoRutV = new javax.swing.JTextField();
        txtModArriendoFechaInicio = new javax.swing.JTextField();
        txtModArriendoFechaFin = new javax.swing.JTextField();
        txtModArriendoValor = new javax.swing.JTextField();
        btnModArriendoVolver = new javax.swing.JButton();
        lblModArriendoObs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtModArriendoObs = new javax.swing.JTextArea();
        lblModArriendoPatente = new javax.swing.JLabel();
        txtModArriendoPatente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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
                .addGap(28, 28, 28)
                .addComponent(lblCreador))
        );

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("      CARmona Autos");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Modificar Contrato Arriendo");

        lblModNContrato.setForeground(new java.awt.Color(0, 0, 0));
        lblModNContrato.setText("Nro Contrato: ");

        lblModArriendoRutC.setForeground(new java.awt.Color(0, 0, 0));
        lblModArriendoRutC.setText("Rut Cliente");

        lblModArriendoRutV.setForeground(new java.awt.Color(0, 0, 0));
        lblModArriendoRutV.setText("Rut Vendedor");

        lblModArriendoFechaInicio.setForeground(new java.awt.Color(0, 0, 0));
        lblModArriendoFechaInicio.setText("Fecha Inicio contrato:");

        lblModArriendoFechaFin.setForeground(new java.awt.Color(0, 0, 0));
        lblModArriendoFechaFin.setText("Fecha Fin contrato: ");

        lblModArriendoValor.setForeground(new java.awt.Color(0, 0, 0));
        lblModArriendoValor.setText("Valor arriendo:");

        btnGuardarModArriendo.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarModArriendo.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarModArriendo.setText("Guardar");
        btnGuardarModArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModArriendoActionPerformed(evt);
            }
        });

        btnLimpiarModArriendo.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarModArriendo.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiarModArriendo.setText("Limpiar");
        btnLimpiarModArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarModArriendoActionPerformed(evt);
            }
        });

        txtModNArriendo.setBackground(new java.awt.Color(255, 255, 255));
        txtModNArriendo.setForeground(new java.awt.Color(0, 0, 0));

        txtModArriendoRutC.setBackground(new java.awt.Color(255, 255, 255));
        txtModArriendoRutC.setForeground(new java.awt.Color(0, 0, 0));

        txtModArriendoRutV.setBackground(new java.awt.Color(255, 255, 255));
        txtModArriendoRutV.setForeground(new java.awt.Color(0, 0, 0));

        txtModArriendoFechaInicio.setBackground(new java.awt.Color(255, 255, 255));
        txtModArriendoFechaInicio.setForeground(new java.awt.Color(0, 0, 0));

        txtModArriendoFechaFin.setBackground(new java.awt.Color(255, 255, 255));
        txtModArriendoFechaFin.setForeground(new java.awt.Color(0, 0, 0));

        txtModArriendoValor.setBackground(new java.awt.Color(255, 255, 255));
        txtModArriendoValor.setForeground(new java.awt.Color(0, 0, 0));
        txtModArriendoValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModArriendoValorKeyTyped(evt);
            }
        });

        btnModArriendoVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnModArriendoVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnModArriendoVolver.setText("Volver");
        btnModArriendoVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModArriendoVolverActionPerformed(evt);
            }
        });

        lblModArriendoObs.setBackground(new java.awt.Color(255, 255, 255));
        lblModArriendoObs.setForeground(new java.awt.Color(0, 0, 0));
        lblModArriendoObs.setText("Observaciones:");

        txtModArriendoObs.setBackground(new java.awt.Color(255, 255, 255));
        txtModArriendoObs.setColumns(20);
        txtModArriendoObs.setForeground(new java.awt.Color(0, 0, 0));
        txtModArriendoObs.setRows(5);
        jScrollPane1.setViewportView(txtModArriendoObs);

        lblModArriendoPatente.setForeground(new java.awt.Color(0, 0, 0));
        lblModArriendoPatente.setText("Patente:");

        txtModArriendoPatente.setBackground(new java.awt.Color(255, 255, 255));
        txtModArriendoPatente.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("YYYY - MM - DD");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("YYYY - MM - DD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarModArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(355, 355, 355)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(lblModArriendoObs)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnModArriendoVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblModArriendoPatente)
                                        .addComponent(lblModArriendoRutV))
                                    .addComponent(lblModArriendoRutC)
                                    .addComponent(lblModNContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtModArriendoRutC, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtModNArriendo)
                                        .addComponent(txtModArriendoRutV)
                                        .addComponent(txtModArriendoPatente, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(btnLimpiarModArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblModArriendoFechaInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblModArriendoValor)
                                                .addComponent(lblModArriendoFechaFin)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtModArriendoValor, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtModArriendoFechaFin, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtModArriendoFechaInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(60, 60, 60))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(110, 110, 110))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModArriendoFechaInicio)
                            .addComponent(txtModArriendoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModArriendoFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModArriendoFechaFin))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModArriendoValor)
                            .addComponent(txtModArriendoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(lblModArriendoObs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModNContrato)
                            .addComponent(txtModNArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModArriendoRutC)
                            .addComponent(txtModArriendoRutC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModArriendoRutV)
                            .addComponent(txtModArriendoRutV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModArriendoPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModArriendoPatente))
                        .addGap(44, 44, 44)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnLimpiarModArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModArriendoVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarModArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnGuardarModArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModArriendoActionPerformed
        
        String nArriendo, rutCliente, rutVendedor, patente, observacion, fechaInicioStr, fechaFinStr;
        Date fechaInicio, fechaFin;
        int valorArriendo;
        
        //formatear el get text de las fechas y del valor
        
        fechaInicioStr = this.txtModArriendoFechaInicio.getText();
        fechaFinStr = this.txtModArriendoFechaFin.getText();
        //valor a int
        valorArriendo = Integer.parseInt(this.txtModArriendoValor.getText());
        
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        //validador del campo fecha para que esté escrito correctamente
        try{
            fechaInicio = formatter1.parse(fechaInicioStr);
        }
        catch(ParseException e){
            JOptionPane.showMessageDialog(this, "Ingrese fecha en el formato YYYY-MM-DD", "Validacion", JOptionPane.WARNING_MESSAGE);
            this.txtModArriendoFechaInicio.requestFocus(); //mandara el click a donde falta dato
            return;            
        }                
        try{
            fechaFin = formatter1.parse(fechaFinStr);
        }
        catch(ParseException e){
            JOptionPane.showMessageDialog(this, "Ingrese fecha en el formato YYYY-MM-DD", "Validacion", JOptionPane.WARNING_MESSAGE);
            this.txtModArriendoFechaFin.requestFocus(); //mandara el click a donde falta dato
            return;            
        }        

        
        nArriendo = this.txtModNArriendo.getText();
        rutCliente = this.txtModArriendoRutC.getText();
        rutVendedor = this.txtModArriendoRutV.getText();
        patente = this.txtModArriendoPatente.getText();
        observacion = this.txtModArriendoObs.getText();
        
        //rellenar arriendo con nuevos datos
        Arriendo arriendo = new Arriendo(nArriendo, fechaInicio, fechaFin, valorArriendo, observacion, rutCliente, rutVendedor,patente);
        //llamar metodo del controller
        if (rga.actualizarArriendo(arriendo)) {
            JOptionPane.showMessageDialog(this, "Arriendo modificado con EXITO!!", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Arriendo NO fue modificado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btnGuardarModArriendoActionPerformed

    private void btnLimpiarModArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarModArriendoActionPerformed

        this.txtModArriendoValor.setText("");
        this.txtModArriendoObs.setText("");
    }//GEN-LAST:event_btnLimpiarModArriendoActionPerformed

    private void btnModArriendoVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModArriendoVolverActionPerformed
        ListarArriendo v = new ListarArriendo();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModArriendoVolverActionPerformed

    private void txtModArriendoValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModArriendoValorKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtModArriendoValorKeyTyped

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarModArriendo;
    private javax.swing.JButton btnLimpiarModArriendo;
    private javax.swing.JButton btnModArriendoVolver;
    private javax.swing.JButton btnModVendVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreador;
    private javax.swing.JLabel lblModArriendoFechaFin;
    private javax.swing.JLabel lblModArriendoFechaInicio;
    private javax.swing.JLabel lblModArriendoObs;
    private javax.swing.JLabel lblModArriendoPatente;
    private javax.swing.JLabel lblModArriendoRutC;
    private javax.swing.JLabel lblModArriendoRutV;
    private javax.swing.JLabel lblModArriendoValor;
    private javax.swing.JLabel lblModNContrato;
    private javax.swing.JTextField txtModArriendoFechaFin;
    private javax.swing.JTextField txtModArriendoFechaInicio;
    private javax.swing.JTextArea txtModArriendoObs;
    private javax.swing.JTextField txtModArriendoPatente;
    private javax.swing.JTextField txtModArriendoRutC;
    private javax.swing.JTextField txtModArriendoRutV;
    private javax.swing.JTextField txtModArriendoValor;
    private javax.swing.JTextField txtModNArriendo;
    // End of variables declaration//GEN-END:variables
}
