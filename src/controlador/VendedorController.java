package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Vehiculo;
import modelo.Vendedor;

/**
 *
 * @author Administrador
 */
public class VendedorController {
    
    
    //metodo para agregar vendedor
    public boolean agregarVendedor(Vendedor nVendedor) {
        try {
            //establecer la conexión
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion();
            //preparo la query 
            String query = "INSERT INTO vendedor (rut_vendedor, dig_ver_vendedor, nombre_vendedor, "
                    + "telefono_vendedor, email_vendedor, direccion_vendedor) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar los parametros
            stmt.setString(1, nVendedor.getRutVendedor());
            stmt.setString(2, nVendedor.getDigVer());
            stmt.setString(3, nVendedor.getNombreVendedor());
            stmt.setString(4, nVendedor.getFonoVendedor());
            stmt.setString(5, nVendedor.getMailVendedor());
            stmt.setString(6, nVendedor.getDireccionVendedor());
            //ejecutar la query
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error SQL al agregar vendedor: " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error al agregar vendedor: " + ex.getMessage());
            return false;
        }
    }

    //buscar vendedor por rut
    public Vendedor buscarVendedor(String rutVendedor) {

        Vendedor datosVendedor = new Vendedor();
        try {
            //establecer la conexión a travéz de la clase conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion(); //obtener metodo obtenerConexion a través de la instancia coneX
            //preparar query para la BD
            String query = "SELECT rut_vendedor, dig_ver_vendedor, nombre_vendedor, telefono_vendedor, "
                    + "email_vendedor, direccion_vendedor "
                    + "FROM carmona.vendedor WHERE rut_vendedor=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar los parametros
            stmt.setString(1, rutVendedor);
            //ejecutar la query
            ResultSet rs = stmt.executeQuery();
            //convierto en rs un vendedor
            if (rs.next()) {
                datosVendedor.setRutVendedor(rutVendedor);
                datosVendedor.setDigVer(rs.getString("dig_ver_vendedor"));
                datosVendedor.setNombreVendedor(rs.getString("nombre_vendedor"));
                datosVendedor.setFonoVendedor(rs.getString("telefono_vendedor"));
                datosVendedor.setMailVendedor(rs.getString("email_vendedor"));
                datosVendedor.setDireccionVendedor(rs.getString("direccion_vendedor"));
            }
            stmt.close();
            cnx.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error SQL al buscar un vendedor: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error al buscar un vendedor: " + ex.getMessage());
        }
        return datosVendedor;
    }

    //buscar vendedor por dv para hacer comprobación de rut y no se duplique
    public Vendedor buscarDvVendedor(String Dv) {

        Vendedor datosVendedor = new Vendedor();
        try {
            //establecer la conexión a travéz de la clase conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion(); 
            //preparar query para la BD
            String query = "SELECT dig_ver_vendedor "
                    + "FROM vendedor WHERE dig_ver_vendedor=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar los parametros
            stmt.setString(1, Dv);
            //ejecutar la query
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                datosVendedor.setDigVer(rs.getString("dig_ver_vendedor"));
            }
            stmt.close();
            cnx.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error SQL al buscar una patente: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error al buscar una patente: " + ex.getMessage());
        }
        return datosVendedor;
    }

    //metodo para llenar combo box de vendedores en seccion de arriendo
    public ArrayList<Vendedor> buscarVendedores() {

        ArrayList<Vendedor> listaVendedores = new ArrayList<>();
        try {
            //establecer la conexión a travéz de la clase conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion(); //obtener metodo obtenerConexion a través de la instancia coneX
            //preparar query para la BD
            String query = "SELECT * from vendedor";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ejecutar la query
            ResultSet rs = stmt.executeQuery();
            //convierto en rs un cliente
            while (rs.next()) {
                Vendedor v = new Vendedor();
                v.setRutVendedor(rs.getString("rut_vendedor"));
                listaVendedores.add(v);
            }
            stmt.close();
            cnx.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error SQL al buscar un cliente: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error al buscar un cliente: " + ex.getMessage());
        }
        return listaVendedores;
    }

    //metodo para llenar jtable vendedores con todos los datos de su tabla correspondiente
    public ArrayList<Vendedor> llenarTableVendedores() {

        ArrayList<Vendedor> listaVendedores = new ArrayList<>();
        try {
            //establecer la conexión a travéz de la clase conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion(); //obtener metodo obtenerConexion a través de la instancia coneX
            //preparar query para la BD
            String query = "SELECT rut_vendedor, dig_ver_vendedor, nombre_vendedor, telefono_vendedor, "
                    + "email_vendedor, direccion_vendedor "
                    + "FROM carmona.vendedor";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ejecutar la query
            ResultSet rs = stmt.executeQuery();
            //convierto en rs un cliente
            while (rs.next()) {
                Vendedor v = new Vendedor();
                v.setRutVendedor(rs.getString("rut_vendedor"));
                v.setDigVer(rs.getString("dig_ver_vendedor"));
                v.setNombreVendedor(rs.getString("nombre_vendedor"));
                v.setFonoVendedor(rs.getString("telefono_vendedor"));
                v.setMailVendedor(rs.getString("email_vendedor"));
                v.setDireccionVendedor(rs.getString("direccion_vendedor"));                                
                listaVendedores.add(v);
            }
            stmt.close();
            cnx.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error SQL al buscar un cliente: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error al buscar un cliente: " + ex.getMessage());
        }
        return listaVendedores;
    }

    //eliminar vendedor
    public boolean eliminarVendedor(String rutVendedor) {
        try {
            //establecer la conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion();
            //preparo la query que ejectuaré en la BD
            String query = "DELETE FROM vendedor WHERE rut_vendedor=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar los parametros
            stmt.setString(1, rutVendedor);
            //ejecutar la query
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error SQL al eliminar vendedor: " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error al eliminar vendedor: " + ex.getMessage());
            return false;
        }
    }

    //metodo para actualizar vendedor
    public boolean actualizarVendedor(Vendedor nVendedor) {
        try {

            //establecer la conexion
            Conexion conex = new Conexion();
            Connection cnx = conex.obtenerConexion();
            //preparar query
            String query = "UPDATE vendedor SET nombre_vendedor=?, "
                    + "telefono_vendedor=?, email_vendedor=?, direccion_vendedor=? "
                    + " WHERE rut_vendedor=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar rlos parametros
            stmt.setString(1, nVendedor.getNombreVendedor());
            stmt.setString(2, nVendedor.getFonoVendedor());
            stmt.setString(3, nVendedor.getMailVendedor());
            stmt.setString(4, nVendedor.getDireccionVendedor());
            stmt.setString(5, nVendedor.getRutVendedor());
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
