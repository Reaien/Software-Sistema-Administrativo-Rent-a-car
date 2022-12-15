package vista;

import java.util.Date;
import controlador.ClienteController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Validador;

public class ListarCliente extends javax.swing.JFrame {

    ClienteController rgc = new ClienteController();
    //traer los datos de la tabla de bd al iniciar
    public ListarCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        String rut;
        String nombreCliente, direccionCliente, mailCliente, fonoCliente, dv;
        Date fechaNacimiento;        
        DefaultTableModel modelo = (DefaultTableModel) this.tblCliente.getModel();        
        
        modelo.setRowCount(0);
        rut = this.txtBusquedaCliente.getText();
        if (rut.isEmpty()) {
            ArrayList<Cliente> lista = rgc.llenarTableClientes();
            for(Cliente cl : lista){
                rut = cl.getRutCliente();
                dv = cl.getDigVer();
                nombreCliente = cl.getNombreCliente();
                fechaNacimiento = cl.getFechaNacimiento();
                direccionCliente = cl.getDireccionCliente();
                mailCliente = cl.getMailCliente();
                fonoCliente = cl.getFonoCliente();
                
                
                modelo.addRow(new Object[]{rut, dv,nombreCliente, fechaNacimiento, direccionCliente,mailCliente, fonoCliente, });
            }
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtBusquedaCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        lblCreador = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnDeleteCLiente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnAddCliente = new javax.swing.JButton();
        lblSubTitulo = new javax.swing.JLabel();
        btnClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CARmona Autos - Rent a car");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar rut sin punto ni digito verificador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        txtBusquedaCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtBusquedaCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtBusquedaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaClienteKeyTyped(evt);
            }
        });

        btnBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarCliente.setText("Buscar cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBusquedaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 236, 154));

        btnMenu.setBackground(new java.awt.Color(255, 236, 154));
        btnMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(0, 0, 0));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3643769-building-home-house-main-menu-start_113416.png"))); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.setBorder(null);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        lblCreador.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblCreador.setForeground(new java.awt.Color(102, 102, 102));
        lblCreador.setText("Ivan Andres Duarte Herrera ®");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblCreador)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblCreador))
        );

        lblTitulo.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 40)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo.setText("      CARmona Autos");

        tblCliente.setBackground(new java.awt.Color(255, 255, 255));
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Dv", "Nombre", "Fecha nacimiento", "Direccion", "Email", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCliente);
        if (tblCliente.getColumnModel().getColumnCount() > 0) {
            tblCliente.getColumnModel().getColumn(2).setResizable(false);
        }

        btnDeleteCLiente.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteCLiente.setForeground(new java.awt.Color(0, 0, 0));
        btnDeleteCLiente.setText("Eliminar registro");
        btnDeleteCLiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCLienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarCliente.setText("Editar cliente");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnAddCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnAddCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnAddCliente.setText("Agregar cliente");
        btnAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClienteActionPerformed(evt);
            }
        });

        lblSubTitulo.setBackground(new java.awt.Color(153, 153, 153));
        lblSubTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSubTitulo.setForeground(new java.awt.Color(153, 153, 153));
        lblSubTitulo.setText("Cliente");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(376, 376, 376)
                                                .addComponent(lblSubTitulo))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(155, 155, 155)
                                                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(btnDeleteCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(184, 184, 184)
                                        .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(lblSubTitulo))
                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed

        
        DefaultTableModel modelo = (DefaultTableModel) this.tblCliente.getModel();
        modelo.setRowCount(0); //limpiar tabla y mostrar solo 1 resultado de la busqueda
        
        String rut;
        String nombreCliente, direccionCliente, mailCliente, fonoCliente, dv;
        Date fechaNacimiento;
        

        
        
        rut = this.txtBusquedaCliente.getText();

        Validador v = new Validador();
        if (!v.validaVacio(rut)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un rut", "Validación", JOptionPane.WARNING_MESSAGE);
            return;            
        }        
        
        
        Cliente cliente = rgc.buscarCliente(rut);
        dv = cliente.getDigVer();
        nombreCliente = cliente.getNombreCliente();
        direccionCliente = cliente.getDireccionCliente();
        mailCliente = cliente.getMailCliente();
        fonoCliente = cliente.getFonoCliente();
        fechaNacimiento = cliente.getFechaNacimiento();
        

        
        
        //rellenar fila
        modelo.addRow(new Object[]{rut, dv,nombreCliente, fechaNacimiento, direccionCliente,mailCliente, fonoCliente, });
        
        

    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClienteActionPerformed
        AgregarCliente addCliente = new AgregarCliente();
        addCliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        int fila = this.tblCliente.getSelectedRow(); //validar fila seleccionada
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila", "Validación", JOptionPane.WARNING_MESSAGE);
            this.tblCliente.requestFocus();
            return;
        } else {
            //obtengo la informacion del cliente desde la fila seleccionada 
            Cliente cliente = new Cliente();
            //obtengo el rut de la fila seleccionada
            cliente.setRutCliente((String) this.tblCliente.getValueAt(fila, 0)); //se selecciona la columna 0 de la fila seleccionada
            cliente.setDigVer((String) this.tblCliente.getValueAt(fila, 1));
            cliente.setNombreCliente((String) this.tblCliente.getValueAt(fila, 2));
            cliente.setFechaNacimiento((Date) this.tblCliente.getValueAt(fila, 3));
            cliente.setDireccionCliente((String) this.tblCliente.getValueAt(fila, 4));
            cliente.setMailCliente((String) this.tblCliente.getValueAt(fila, 5));
            cliente.setFonoCliente((String) this.tblCliente.getValueAt(fila, 6));
            
            
            ModificarCliente editCliente = new ModificarCliente(cliente);
            editCliente.setVisible(true);
            this.setVisible(false);            
        }        

    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        ListarCliente l = new ListarCliente();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnDeleteCLienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCLienteActionPerformed
        int fila = this.tblCliente.getSelectedRow(); //validar fila seleccionada
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila", "Validación", JOptionPane.WARNING_MESSAGE);
            this.tblCliente.requestFocus();
            return;
        } else {
            //obtengo el pasaporte de la fila seleccionada 
            String rut = (String) this.tblCliente.getValueAt(fila, 0);
            if (rgc.eliminarCliente(rut)) {
                JOptionPane.showMessageDialog(this, "Se eliminó correctamente el cliente con rut: " + rut, "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se eliminó el cliente con rut: " + rut, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteCLienteActionPerformed

    private void txtBusquedaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaClienteKeyTyped
        //metodo para solo ingresar numeros
        
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBusquedaClienteKeyTyped



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCliente;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDeleteCLiente;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreador;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtBusquedaCliente;
    // End of variables declaration//GEN-END:variables
}
