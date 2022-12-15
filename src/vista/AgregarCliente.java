
package vista;

import controlador.ClienteController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Validador;

/**
 *
 * @author Administrador
 */
public class AgregarCliente extends javax.swing.JFrame {


    public AgregarCliente() {
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
        lblTituloAdd = new javax.swing.JLabel();
        lblSubtituloAdd = new javax.swing.JLabel();
        lblRutAddCliente = new javax.swing.JLabel();
        lblDvCLiente = new javax.swing.JLabel();
        lblNombreClienteAdd = new javax.swing.JLabel();
        lblFechaNacCliente = new javax.swing.JLabel();
        lblDireccionCliente = new javax.swing.JLabel();
        lblEmailCliente = new javax.swing.JLabel();
        lblFonoClienteAdd = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        txtAddRutCliente = new javax.swing.JTextField();
        txtAddDvCliente = new javax.swing.JTextField();
        txtAddNombreCliente = new javax.swing.JTextField();
        txtAddFechaCLiente = new javax.swing.JTextField();
        txtAddDireccionCliente = new javax.swing.JTextField();
        txtAddEmailCliente = new javax.swing.JTextField();
        txtAddFonoCliente = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        lblFormatoFecha = new javax.swing.JLabel();

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
                .addGap(37, 37, 37)
                .addComponent(lblCreador))
        );

        lblTituloAdd.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 40)); // NOI18N
        lblTituloAdd.setForeground(new java.awt.Color(51, 51, 51));
        lblTituloAdd.setText("      CARmona Autos");

        lblSubtituloAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSubtituloAdd.setForeground(new java.awt.Color(0, 0, 0));
        lblSubtituloAdd.setText("Agregar Cliente");

        lblRutAddCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblRutAddCliente.setText("Rut:");

        lblDvCLiente.setForeground(new java.awt.Color(0, 0, 0));
        lblDvCLiente.setText("Digito verificador:");

        lblNombreClienteAdd.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreClienteAdd.setText("Nombre cliente:");

        lblFechaNacCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaNacCliente.setText("Fecha de nacimiento:");

        lblDireccionCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccionCliente.setText("Direccion: ");

        lblEmailCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblEmailCliente.setText("Correo electronico: ");

        lblFonoClienteAdd.setForeground(new java.awt.Color(0, 0, 0));
        lblFonoClienteAdd.setText("Telefono:");

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnClean.setBackground(new java.awt.Color(255, 255, 255));
        btnClean.setForeground(new java.awt.Color(0, 0, 0));
        btnClean.setText("Limpiar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        txtAddRutCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtAddRutCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtAddRutCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddRutClienteKeyTyped(evt);
            }
        });

        txtAddDvCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtAddDvCliente.setForeground(new java.awt.Color(0, 0, 0));

        txtAddNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtAddNombreCliente.setForeground(new java.awt.Color(0, 0, 0));

        txtAddFechaCLiente.setBackground(new java.awt.Color(255, 255, 255));
        txtAddFechaCLiente.setForeground(new java.awt.Color(0, 0, 0));

        txtAddDireccionCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtAddDireccionCliente.setForeground(new java.awt.Color(0, 0, 0));

        txtAddEmailCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtAddEmailCliente.setForeground(new java.awt.Color(0, 0, 0));

        txtAddFonoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtAddFonoCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtAddFonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddFonoClienteKeyTyped(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblFormatoFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFormatoFecha.setText("    YYYY - MM  - DD");

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
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDvCLiente)
                                            .addComponent(lblNombreClienteAdd)
                                            .addComponent(lblRutAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtAddRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtAddNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(156, 156, 156)
                                                .addComponent(txtAddDvCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblDireccionCliente)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtAddDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblEmailCliente)
                                                    .addComponent(lblFonoClienteAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtAddEmailCliente)
                                                    .addComponent(txtAddFonoCliente)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(368, 368, 368)
                                .addComponent(lblSubtituloAdd))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(lblTituloAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(102, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblFechaNacCliente)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFormatoFecha)
                                    .addComponent(txtAddFechaCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblTituloAdd)
                .addGap(18, 18, 18)
                .addComponent(lblSubtituloAdd)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRutAddCliente)
                    .addComponent(lblDireccionCliente)
                    .addComponent(txtAddRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDvCLiente)
                    .addComponent(lblEmailCliente)
                    .addComponent(txtAddDvCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreClienteAdd)
                    .addComponent(lblFonoClienteAdd)
                    .addComponent(txtAddNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddFonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(lblFormatoFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNacCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddFechaCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        vista.ListarCliente c = new vista.ListarCliente();
        c.setVisible(true);
        this.setVisible(false);       
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String digVer, nombreCliente, direccionCliente, mailCliente, fonoCliente, fechaStr;
        Date fechaNacimiento;
        String rutCliente;
        
        
        //
        rutCliente = this.txtAddRutCliente.getText();
        
        digVer = this.txtAddDvCliente.getText();
        
        nombreCliente = this.txtAddNombreCliente.getText();
        
        fechaStr = this.txtAddFechaCLiente.getText();

        //dar formato al string de la fecha esto para que pueda ser compatible con mysql
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        try{
            fechaNacimiento = formatter1.parse(fechaStr);
        }
        catch(ParseException e){
            JOptionPane.showMessageDialog(this, "Ingrese fecha en el formato YYYY-MM-DD", "Validacion", JOptionPane.WARNING_MESSAGE);
            this.txtAddFechaCLiente.requestFocus(); //mandara el click a donde falta dato
            return;            
        }        
        
        direccionCliente = this.txtAddDireccionCliente.getText();
        
        mailCliente = this.txtAddEmailCliente.getText();
        
        fonoCliente = this.txtAddFonoCliente.getText();
        
        //validador de campos vacios
        
        Validador v = new Validador();
        if (!v.validaVacio(rutCliente) || !v.validaVacio(digVer) || !v.validaVacio(nombreCliente) || !v.validaVacio(direccionCliente) 
            || !v.validaVacio(mailCliente) || !v.validaVacio(fonoCliente)) {
            JOptionPane.showMessageDialog(this, "Debe rellenar los campos vacios", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }          
        
        
        //Traer el objeto libro para entregarle todos los parametros recibidos en los txt ya transformados segun el formato de las columnas y rellenarlo
        
        Cliente cliente1 = new Cliente(rutCliente, digVer,nombreCliente,fechaNacimiento,direccionCliente,mailCliente,fonoCliente);
        
        ClienteController rg = new ClienteController();
        
        //validar rut cliente y dv
        if (rg.buscarCliente(rutCliente).getRutCliente()==null || rg.buscarDv(digVer).getDigVer()==null) {
            if(rg.agregarCliente(cliente1)){
                JOptionPane.showMessageDialog(this,"Cliente agregado","Infomacion", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this,"Error","Informacion", JOptionPane.ERROR_MESSAGE);
            }        
        }else{
            JOptionPane.showMessageDialog(this, "N de rut ya registrado: " + rutCliente+"-"+digVer + " Ya existe en la base de datos!", "Validación",JOptionPane.WARNING_MESSAGE ); 
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        this.txtAddRutCliente.setText("");
        this.txtAddNombreCliente.setText("");
        this.txtAddFonoCliente.setText("");
        this.txtAddEmailCliente.setText("");
        this.txtAddDvCliente.setText("");
        this.txtAddDireccionCliente.setText("");
        this.txtAddFechaCLiente.setText("");

    }//GEN-LAST:event_btnCleanActionPerformed

    private void txtAddFonoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddFonoClienteKeyTyped
        //metodo para solo ingresar numeros
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAddFonoClienteKeyTyped

    private void txtAddRutClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddRutClienteKeyTyped
        //metodo para solo ingresar numeros
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAddRutClienteKeyTyped



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCreador;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblDvCLiente;
    private javax.swing.JLabel lblEmailCliente;
    private javax.swing.JLabel lblFechaNacCliente;
    private javax.swing.JLabel lblFonoClienteAdd;
    private javax.swing.JLabel lblFormatoFecha;
    private javax.swing.JLabel lblNombreClienteAdd;
    private javax.swing.JLabel lblRutAddCliente;
    private javax.swing.JLabel lblSubtituloAdd;
    private javax.swing.JLabel lblTituloAdd;
    private javax.swing.JTextField txtAddDireccionCliente;
    private javax.swing.JTextField txtAddDvCliente;
    private javax.swing.JTextField txtAddEmailCliente;
    private javax.swing.JTextField txtAddFechaCLiente;
    private javax.swing.JTextField txtAddFonoCliente;
    private javax.swing.JTextField txtAddNombreCliente;
    private javax.swing.JTextField txtAddRutCliente;
    // End of variables declaration//GEN-END:variables
}
