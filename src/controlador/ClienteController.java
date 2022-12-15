package controlador;

import java.util.Date;
import bd.Conexion;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Cliente;

public class ClienteController {

    public boolean agregarCliente(Cliente nCliente) {//metodo para agregar cliente
        Date date;
        try {
            //establecer la conexión
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion();
            date = nCliente.getFechaNacimiento();
            //preparo la query que ejecutaré en la BD
            String query = "INSERT INTO cliente (rut_cliente, digito_ver_cliente, nombre_cliente, "
                    + "fecha_nacimiento, direccion_cliente, mail_cliente, telefono_cliente) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar los parametros
            stmt.setString(1, nCliente.getRutCliente());
            stmt.setString(2, nCliente.getDigVer());
            stmt.setString(3, nCliente.getNombreCliente());
            stmt.setDate(4, new java.sql.Date(date.getTime()));
            stmt.setString(5, nCliente.getDireccionCliente());
            stmt.setString(6, nCliente.getMailCliente());
            stmt.setString(7, nCliente.getFonoCliente());
            //ejecutar la query
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error SQL al agregar cliente: " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error al agregar cliente: " + ex.getMessage());
            return false;
        }
    }

    //buscar cliente por rut
    public Cliente buscarCliente(String rutCliente) {

        Cliente datosCliente = new Cliente();
        try {
            //establecer la conexión a travéz de la clase conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion(); 
            //preparar query 
            String query = "SELECT rut_cliente, digito_ver_cliente,nombre_cliente, fecha_nacimiento, direccion_cliente, "
                    + "mail_cliente, telefono_cliente "
                    + "FROM carmona.cliente WHERE rut_cliente=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar los parametros
            stmt.setString(1, rutCliente);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                datosCliente.setRutCliente(rutCliente);
                datosCliente.setDigVer(rs.getString("digito_ver_cliente"));
                datosCliente.setNombreCliente(rs.getString("nombre_cliente"));
                datosCliente.setFechaNacimiento(rs.getDate("fecha_nacimiento"));//me muero si no funciona
                datosCliente.setDireccionCliente(rs.getString("direccion_cliente"));
                datosCliente.setMailCliente(rs.getString("mail_cliente"));
                datosCliente.setFonoCliente(rs.getString("telefono_cliente"));
            }
            stmt.close();
            cnx.close();
            rs.close();

        } catch (SQLException ex) {
            System.out.println("Error SQL al buscar un cliente: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error al buscar un cliente: " + ex.getMessage());
        }
        return datosCliente;
    }

    //buscar por digito verificador de cliente para verificar rut duplicado en creacion
    public Cliente buscarDv(String Dv) {

        Cliente datosCliente = new Cliente();
        try {
            //establecer la conexión a travéz de la clase conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion(); //obtener metodo obtenerConexion a través de la instancia coneX
            //preparar query para la BD
            String query = "SELECT digito_ver_cliente "
                    + "FROM cliente WHERE digito_ver_cliente=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar los parametros
            stmt.setString(1, Dv);
            //ejecutar la query
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                datosCliente.setDigVer(rs.getString("digito_ver_cliente"));
            }
            stmt.close();
            cnx.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error SQL al buscar un dv: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error al buscar un dv: " + ex.getMessage());
        }
        return datosCliente;
    }

    //metodo para llenar combo box en seccion arriendo arriendo 
    public ArrayList<Cliente> buscarClientes() {

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        try {
            //establecer la conexión a travéz de la clase conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion(); //obtener metodo obtenerConexion a través de la instancia coneX
            //preparar query para la BD
            String query = "SELECT * from cliente";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ejecutar la query
            ResultSet rs = stmt.executeQuery();
            //convierto en rs un cliente
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setRutCliente(rs.getString("rut_cliente"));
                listaClientes.add(cliente);
            }
            stmt.close();
            cnx.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error SQL al buscar un cliente: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error al buscar un cliente: " + ex.getMessage());
        }
        return listaClientes;
    }

    //metodo para llenar jtable clientes con todos los datos de su tabla correspondiente
    public ArrayList<Cliente> llenarTableClientes() {

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        try {
            //establecer la conexión a travéz de la clase conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion(); //obtener metodo obtenerConexion a través de la instancia coneX
            //preparar query para la BD
            String query = "SELECT rut_cliente, digito_ver_cliente,nombre_cliente, fecha_nacimiento, direccion_cliente, "
                    + "mail_cliente, telefono_cliente "
                    + "FROM carmona.cliente";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ejecutar la query
            ResultSet rs = stmt.executeQuery();
            //convierto en rs un cliente
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setRutCliente(rs.getString("rut_cliente"));
                cliente.setDigVer(rs.getString("digito_ver_cliente"));
                cliente.setNombreCliente(rs.getString("nombre_cliente"));
                cliente.setFechaNacimiento(rs.getDate("fecha_nacimiento"));//me muero si no funciona
                cliente.setDireccionCliente(rs.getString("direccion_cliente"));
                cliente.setMailCliente(rs.getString("mail_cliente"));
                cliente.setFonoCliente(rs.getString("telefono_cliente"));               
                listaClientes.add(cliente);
            }
            stmt.close();
            cnx.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error SQL al buscar un cliente: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error al buscar un cliente: " + ex.getMessage());
        }
        return listaClientes;
    }

    //eliminar cliente
    public boolean eliminarCliente(String rutCliente) {
        try {
            //establecer la conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion();
            //preparo la query que ejectuaré en la BD
            String query = "DELETE FROM cliente WHERE rut_cliente=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar los parametros
            stmt.setString(1, rutCliente);
            //ejecutar la query
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error SQL al eliminar cliente: " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error al eliminar cliente: " + ex.getMessage());
            return false;
        }
    }

    
    //actualizar a un cliente
    public boolean actualizarCliente(Cliente nCliente) {
        Date date;
        date = nCliente.getFechaNacimiento();
        try {

            //establecer la conexion
            Conexion conex = new Conexion();
            Connection cnx = conex.obtenerConexion();
            //preparar query
            String query = "UPDATE cliente SET nombre_cliente=?, fecha_nacimiento=?, "
                    + "direccion_cliente=?, mail_cliente=?, telefono_cliente=? "
                    + " WHERE rut_cliente=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar rlos parametros
            stmt.setString(1, nCliente.getNombreCliente());
            stmt.setDate(2, new java.sql.Date(date.getTime()));
            stmt.setString(3, nCliente.getDireccionCliente());
            stmt.setString(4, nCliente.getMailCliente());
            stmt.setString(5, nCliente.getFonoCliente());
            stmt.setString(6, nCliente.getRutCliente());
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error SQL al actualizar cliente: " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error al actualizar cliente: " + ex.getMessage());
            return false;
        }
    }

}
