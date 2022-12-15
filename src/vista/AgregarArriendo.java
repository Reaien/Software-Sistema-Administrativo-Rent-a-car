
package vista;

import controlador.ArriendoController;
import controlador.ClienteController;
import controlador.VehiculoController;
import controlador.VendedorController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import modelo.Cliente;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Arriendo;
import modelo.Validador;
import modelo.Vehiculo;
import modelo.Vendedor;
/**
 *
 * @author Administrador
 */
public class AgregarArriendo extends javax.swing.JFrame {


    public AgregarArriendo() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarComboCliente(); //cargar el cbo de ruts de tabla mysql traidas a través del registroCliente
        llenarComboVehiculo(); //cargar el cbo de patentes de tabla mysql traidas a través del registroCliente
        llenarComboVendedores(); //cargar el cbo de ruts de tabla mysql traidas a través del registroCliente
    }
    
    
    //metodo llenar cbo con ruts de los clientes registrados
    public void llenarComboCliente(){
        ClienteController rgc = new ClienteController();
        ArrayList<Cliente> listaClientes = rgc.buscarClientes();
        for(Cliente c: listaClientes){
            this.cboCrearArriendoCliente.addItem(c.getRutCliente());
        }
    }
    
    
    //metodo llenar cbo con patentes de los vehiculos registrados
    public void llenarComboVehiculo(){
        VehiculoController rgvh = new VehiculoController();
        ArrayList<Vehiculo> listaVehiculos = rgvh.buscarVehiculos();
        for(Vehiculo vh: listaVehiculos){
            this.cboCrearArriendoPatente.addItem(vh.getPatenteVehiculo());
        }
    }    
    
    //metodo llenar cbo con ruts de los vendedores registrados
    public void llenarComboVendedores(){
        VendedorController rgv = new VendedorController();
        ArrayList<Vendedor> listaVendedores = rgv.buscarVendedores();
        for(Vendedor v: listaVendedores){
            this.cboCrearArriendoVendedor.addItem(v.getRutVendedor());
        }
    } 


    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblCreador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblContrato = new javax.swing.JLabel();
        lblCrearArriendoFechaInicio = new javax.swing.JLabel();
        lblCrearArriendoCliente = new javax.swing.JLabel();
        lblCrearArriendoVendedor = new javax.swing.JLabel();
        lblCrearArriendoPatente = new javax.swing.JLabel();
        btnCrearArriendo = new javax.swing.JButton();
        btnLimpiarCrearArriendo = new javax.swing.JButton();
        txtCrearNArrriendo = new javax.swing.JTextField();
        txtCrearArriendoFechaInicio = new javax.swing.JTextField();
        txtCrearArriendoFechaFin = new javax.swing.JTextField();
        btnVolverCrearArriendo = new javax.swing.JButton();
        lblCrearValorArriendo = new javax.swing.JLabel();
        txtCrearValorArriendo = new javax.swing.JTextField();
        lblCrearArriendoFechaFin = new javax.swing.JLabel();
        cboCrearArriendoCliente = new javax.swing.JComboBox<>();
        cboCrearArriendoVendedor = new javax.swing.JComboBox<>();
        cboCrearArriendoPatente = new javax.swing.JComboBox<>();
        lblObservCrearArriendo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaCrearArriendoObservacion = new javax.swing.JTextArea();

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
                .addGap(42, 42, 42)
                .addComponent(lblCreador))
        );

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("      CARmona Autos");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Crear contrato de arriendo");

        lblContrato.setForeground(new java.awt.Color(0, 0, 0));
        lblContrato.setText("N° Contrato:");

        lblCrearArriendoFechaInicio.setForeground(new java.awt.Color(0, 0, 0));
        lblCrearArriendoFechaInicio.setText("Fecha inicio yyyy-mm-dd:");

        lblCrearArriendoCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblCrearArriendoCliente.setText("Cliente:");

        lblCrearArriendoVendedor.setForeground(new java.awt.Color(0, 0, 0));
        lblCrearArriendoVendedor.setText("Vendedor: ");

        lblCrearArriendoPatente.setForeground(new java.awt.Color(0, 0, 0));
        lblCrearArriendoPatente.setText("Patente:");

        btnCrearArriendo.setBackground(new java.awt.Color(255, 255, 255));
        btnCrearArriendo.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearArriendo.setText("Crear Contrato");
        btnCrearArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArriendoActionPerformed(evt);
            }
        });

        btnLimpiarCrearArriendo.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarCrearArriendo.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiarCrearArriendo.setText("Limpiar");
        btnLimpiarCrearArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCrearArriendoActionPerformed(evt);
            }
        });

        txtCrearNArrriendo.setBackground(new java.awt.Color(255, 255, 255));
        txtCrearNArrriendo.setForeground(new java.awt.Color(0, 0, 0));
        txtCrearNArrriendo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCrearNArrriendoKeyTyped(evt);
            }
        });

        txtCrearArriendoFechaInicio.setBackground(new java.awt.Color(255, 255, 255));
        txtCrearArriendoFechaInicio.setForeground(new java.awt.Color(0, 0, 0));

        txtCrearArriendoFechaFin.setBackground(new java.awt.Color(255, 255, 255));
        txtCrearArriendoFechaFin.setForeground(new java.awt.Color(0, 0, 0));

        btnVolverCrearArriendo.setBackground(new java.awt.Color(255, 255, 255));
        btnVolverCrearArriendo.setForeground(new java.awt.Color(0, 0, 0));
        btnVolverCrearArriendo.setText("Volver");
        btnVolverCrearArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverCrearArriendoActionPerformed(evt);
            }
        });

        lblCrearValorArriendo.setForeground(new java.awt.Color(0, 0, 0));
        lblCrearValorArriendo.setText("Valor total arriendo:");

        txtCrearValorArriendo.setBackground(new java.awt.Color(255, 255, 255));
        txtCrearValorArriendo.setForeground(new java.awt.Color(0, 0, 0));
        txtCrearValorArriendo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCrearValorArriendoKeyTyped(evt);
            }
        });

        lblCrearArriendoFechaFin.setForeground(new java.awt.Color(0, 0, 0));
        lblCrearArriendoFechaFin.setText("Fecha fin yyyy-mm-dd:");

        cboCrearArriendoCliente.setBackground(new java.awt.Color(255, 255, 255));
        cboCrearArriendoCliente.setForeground(new java.awt.Color(0, 0, 0));
        cboCrearArriendoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        cboCrearArriendoVendedor.setBackground(new java.awt.Color(255, 255, 255));
        cboCrearArriendoVendedor.setForeground(new java.awt.Color(0, 0, 0));
        cboCrearArriendoVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        cboCrearArriendoPatente.setBackground(new java.awt.Color(255, 255, 255));
        cboCrearArriendoPatente.setForeground(new java.awt.Color(0, 0, 0));
        cboCrearArriendoPatente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        lblObservCrearArriendo.setForeground(new java.awt.Color(0, 0, 0));
        lblObservCrearArriendo.setText("Observaciones:");

        txtaCrearArriendoObservacion.setBackground(new java.awt.Color(255, 255, 255));
        txtaCrearArriendoObservacion.setColumns(20);
        txtaCrearArriendoObservacion.setForeground(new java.awt.Color(0, 0, 0));
        txtaCrearArriendoObservacion.setRows(5);
        jScrollPane1.setViewportView(txtaCrearArriendoObservacion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVolverCrearArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(217, 217, 217)
                                .addComponent(btnLimpiarCrearArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(lblCrearArriendoFechaInicio)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                                        .addComponent(txtCrearArriendoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lblContrato)
                                                                .addGap(24, 24, 24)
                                                                .addComponent(txtCrearNArrriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lblCrearValorArriendo)
                                                                .addGap(27, 27, 27)
                                                                .addComponent(txtCrearValorArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(84, 84, 84))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(lblCrearArriendoFechaFin)
                                                .addGap(27, 27, 27)
                                                .addComponent(txtCrearArriendoFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblObservCrearArriendo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblCrearArriendoVendedor)
                                                    .addComponent(lblCrearArriendoCliente)
                                                    .addComponent(lblCrearArriendoPatente))
                                                .addGap(31, 31, 31)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(cboCrearArriendoVendedor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cboCrearArriendoPatente, javax.swing.GroupLayout.Alignment.LEADING, 0, 176, Short.MAX_VALUE)
                                                    .addComponent(cboCrearArriendoCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addGap(262, 262, 262)))
                                .addContainerGap(82, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrearArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrato)
                    .addComponent(lblCrearArriendoCliente)
                    .addComponent(txtCrearNArrriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCrearArriendoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCrearArriendoFechaInicio)
                            .addComponent(txtCrearArriendoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCrearArriendoVendedor)
                            .addComponent(cboCrearArriendoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCrearArriendoPatente)
                            .addComponent(cboCrearArriendoPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCrearArriendoFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCrearArriendoFechaFin))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblObservCrearArriendo)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCrearValorArriendo)
                            .addComponent(txtCrearValorArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(btnLimpiarCrearArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolverCrearArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1017, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnVolverCrearArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverCrearArriendoActionPerformed
        ListarArriendo a = new ListarArriendo();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverCrearArriendoActionPerformed

    private void btnCrearArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArriendoActionPerformed
        String idArriendo;
        Date fechaInicioArriendo;
        String fechaInicioStr;
        Date fechaFinArriendo;
        String fechaFinStr;
        int valorArriendo;
        String observacion;
        String rutCliente;
        String rutVendedor;
        String patente;
        
        idArriendo = this.txtCrearNArrriendo.getText();
        fechaInicioStr = this.txtCrearArriendoFechaInicio.getText();
        fechaFinStr = this.txtCrearArriendoFechaFin.getText();
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        //try catch para formatear fecha inicio
        try{
            fechaInicioArriendo = formatter1.parse(fechaInicioStr);
        }
        catch(ParseException e){
            JOptionPane.showMessageDialog(this, "Ingrese fecha en el formato YYYY-MM-DD", "Validacion", JOptionPane.WARNING_MESSAGE);
            this.txtCrearArriendoFechaInicio.requestFocus(); //mandara el click a donde falta dato
            return;            
        }        
        
        //try catch para formater fecha fin
        try{
            fechaFinArriendo = formatter1.parse(fechaFinStr);
        }
        catch(ParseException e){
            JOptionPane.showMessageDialog(this, "Ingrese fecha en el formato YYYY-MM-DD", "Validacion", JOptionPane.WARNING_MESSAGE);
            this.txtCrearArriendoFechaFin.requestFocus(); //mandara el click a donde falta dato
            return;            
        }    
        
        valorArriendo = Integer.parseInt(this.txtCrearValorArriendo.getText());
        
        observacion = this.txtaCrearArriendoObservacion.getText();
        
        rutCliente = this.cboCrearArriendoCliente.getItemAt(this.cboCrearArriendoCliente.getSelectedIndex());
        
        rutVendedor = this.cboCrearArriendoVendedor.getItemAt(this.cboCrearArriendoVendedor.getSelectedIndex());
        
        patente = this.cboCrearArriendoPatente.getItemAt(this.cboCrearArriendoPatente.getSelectedIndex());
        
        
        //validador campos vacios
        Validador v = new Validador();
        if (!v.validaVacio(idArriendo)|| !v.validaVacio(fechaInicioStr)|| !v.validaVacio(fechaFinStr)
            || !v.validaVacio(this.txtCrearValorArriendo.getText())|| !v.validaVacio(observacion) ){ 
            JOptionPane.showMessageDialog(this, "Debe rellenar los campos vacios", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        
        Arriendo arriendo = new Arriendo(idArriendo, fechaInicioArriendo, fechaFinArriendo, valorArriendo, observacion,rutCliente, rutVendedor, patente);
        ArriendoController rga = new ArriendoController();
        
        
        //validador de patentes en la tabla arriendo, para no repetir auto ya arrendado
        if (rga.buscarPatente(patente).getPatente()!=null) {
            JOptionPane.showMessageDialog(this, "N de patente ya registrada: " + patente + " Ya arrendada!!", "Validación",JOptionPane.WARNING_MESSAGE );
            return;
        }else{
            ;
        }

        //validador de nro de contrato de arriendo para no ingresar duplicado
        if (rga.buscarArriendo(idArriendo).getIdArriendo()==null) {
            if (rga.agregarArriendo(arriendo)){
                JOptionPane.showMessageDialog(this, "Arriendo agregado con EXITO!!", "Información",JOptionPane.INFORMATION_MESSAGE );
            }else{
                JOptionPane.showMessageDialog(this, "N de arriendo ya registrado: " + idArriendo + " Ya existe en la base de datos!", "Validación",JOptionPane.WARNING_MESSAGE );
            }
        }else{
           JOptionPane.showMessageDialog(this, "N de arriendo ya registrado: " + idArriendo + " Ya existe en la base de datos!", "Validación",JOptionPane.WARNING_MESSAGE ); 
        }
                
    }//GEN-LAST:event_btnCrearArriendoActionPerformed

    private void txtCrearNArrriendoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCrearNArrriendoKeyTyped
        //metodo para ingresar solo numeros
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCrearNArrriendoKeyTyped

    private void txtCrearValorArriendoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCrearValorArriendoKeyTyped
        //metodo para ingresar solo numeros
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCrearValorArriendoKeyTyped

    private void btnLimpiarCrearArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCrearArriendoActionPerformed
        this.txtCrearNArrriendo.setText("");
        this.txtCrearArriendoFechaInicio.setText("");
        this.txtCrearArriendoFechaFin.setText("");
        this.txtCrearValorArriendo.setText("");
        this.txtaCrearArriendoObservacion.setText("");
    }//GEN-LAST:event_btnLimpiarCrearArriendoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearArriendo;
    private javax.swing.JButton btnLimpiarCrearArriendo;
    private javax.swing.JButton btnVolverCrearArriendo;
    private javax.swing.JComboBox<String> cboCrearArriendoCliente;
    private javax.swing.JComboBox<String> cboCrearArriendoPatente;
    private javax.swing.JComboBox<String> cboCrearArriendoVendedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContrato;
    private javax.swing.JLabel lblCreador;
    private javax.swing.JLabel lblCrearArriendoCliente;
    private javax.swing.JLabel lblCrearArriendoFechaFin;
    private javax.swing.JLabel lblCrearArriendoFechaInicio;
    private javax.swing.JLabel lblCrearArriendoPatente;
    private javax.swing.JLabel lblCrearArriendoVendedor;
    private javax.swing.JLabel lblCrearValorArriendo;
    private javax.swing.JLabel lblObservCrearArriendo;
    private javax.swing.JTextField txtCrearArriendoFechaFin;
    private javax.swing.JTextField txtCrearArriendoFechaInicio;
    private javax.swing.JTextField txtCrearNArrriendo;
    private javax.swing.JTextField txtCrearValorArriendo;
    private javax.swing.JTextArea txtaCrearArriendoObservacion;
    // End of variables declaration//GEN-END:variables
}
