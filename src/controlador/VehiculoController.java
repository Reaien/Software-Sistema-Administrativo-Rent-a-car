package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Vehiculo;

/**
 *
 * @author Administrador
 */
public class VehiculoController {

    //metodo para agregar vehiculo
    public boolean agregarVehiculo(Vehiculo nVehiculo) {
        try {
            //establecer la conexión
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion();
            //preparo la query 
            String query = "INSERT INTO vehiculo (patente, motor, chasis, "
                    + "marca, modelo, anio_vehiculo, combustible, tipo_vehiculo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar los parametros
            stmt.setString(1, nVehiculo.getPatenteVehiculo());
            stmt.setString(2, nVehiculo.getMotorVehiculo());
            stmt.setString(3, nVehiculo.getChasisVehiculo());
            stmt.setString(4, nVehiculo.getMarcaVehiculo());
            stmt.setString(5, nVehiculo.getModeloVehiculo());
            stmt.setString(6, nVehiculo.getAnioVehiculo());
            stmt.setString(7, nVehiculo.getCombustibleVehiculo());
            stmt.setString(8, nVehiculo.getTipoVehiculo());
            //ejecutar la query
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error SQL al agregar vehiculo: " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error al agregar vehiculo: " + ex.getMessage());
            return false;
        }
    }

    
    //metodo para buscar por patente
    public Vehiculo buscarVehiculo(String patenteVehiculo) {

        Vehiculo datosVehiculo = new Vehiculo();
        try {
            //establecer la conexión a travéz de la clase conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion(); 
            //preparar query para la BD
            String query = "SELECT patente, motor, chasis, "
                    + "marca, modelo, anio_vehiculo, combustible, tipo_vehiculo "
                    + "FROM carmona.vehiculo WHERE patente=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar los parametros
            stmt.setString(1, patenteVehiculo);
            //ejecutar la query
            ResultSet rs = stmt.executeQuery();
            //convierto en rs un vendedor
            if (rs.next()) {
                datosVehiculo.setPatenteVehiculo(patenteVehiculo);
                datosVehiculo.setMotorVehiculo(rs.getString("motor"));
                datosVehiculo.setChasisVehiculo(rs.getString("chasis"));
                datosVehiculo.setMarcaVehiculo(rs.getString("marca"));
                datosVehiculo.setModeloVehiculo(rs.getString("modelo"));
                datosVehiculo.setAnioVehiculo(rs.getString("anio_vehiculo"));
                datosVehiculo.setCombustibleVehiculo(rs.getString("combustible"));
                datosVehiculo.setTipoVehiculo(rs.getString("tipo_vehiculo"));
            }
            stmt.close();
            cnx.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error SQL al buscar vehiculo: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error al buscar vehiculo: " + ex.getMessage());
        }
        return datosVehiculo;
    }

    //metodo para llenar combo box de las patentes de la seccion arriendos
    public ArrayList<Vehiculo> buscarVehiculos() {

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        try {
            //establecer la conexión a travéz de la clase conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion(); 
            //preparar query para la BD
            String query = "SELECT * from vehiculo";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ejecutar la query
            ResultSet rs = stmt.executeQuery();
            //convierto en rs un cliente
            while (rs.next()) {
                Vehiculo vh = new Vehiculo();
                vh.setPatenteVehiculo(rs.getString("patente"));
                listaVehiculos.add(vh);
            }
            stmt.close();
            cnx.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error SQL al buscar un cliente: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error al buscar un cliente: " + ex.getMessage());
        }
        return listaVehiculos;
    }

    //metodo para llenar jtable vehiculos con todos los datos de su tabla correspondiente
    public ArrayList<Vehiculo> llenarTableVehiculos() {

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        try {
            //establecer la conexión a travéz de la clase conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion(); 
            //preparar query para la BD
            String query = "SELECT patente, motor, chasis, "
                    + "marca, modelo, anio_vehiculo, combustible, tipo_vehiculo "
                    + "FROM carmona.vehiculo";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ejecutar la query
            ResultSet rs = stmt.executeQuery();
            //convierto en rs un cliente
            while (rs.next()) {
                Vehiculo vh = new Vehiculo();
                vh.setPatenteVehiculo(rs.getString("patente"));
                vh.setMotorVehiculo(rs.getString("motor"));
                vh.setChasisVehiculo(rs.getString("chasis"));
                vh.setMarcaVehiculo(rs.getString("marca"));
                vh.setModeloVehiculo(rs.getString("modelo"));
                vh.setAnioVehiculo(rs.getString("anio_vehiculo"));
                vh.setCombustibleVehiculo(rs.getString("combustible"));
                vh.setTipoVehiculo(rs.getString("tipo_vehiculo"));                                
                listaVehiculos.add(vh);
            }
            stmt.close();
            cnx.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error SQL al buscar un cliente: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error al buscar un cliente: " + ex.getMessage());
        }
        return listaVehiculos;
    }

    //eliminar vehiculo
    public boolean eliminarVehiculo(String patenteVehiculo) {
        try {
            //establecer la conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion();
            //preparo la query que ejectuaré en la BD
            String query = "DELETE FROM vehiculo WHERE patente=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar los parametros
            stmt.setString(1, patenteVehiculo);
            //ejecutar la query
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error SQL al eliminar vehiculo: " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error al eliminar vehiculo: " + ex.getMessage());
            return false;
        }
    }

    //metodo para actualizar un registro de vehiculo
    public boolean actualizarVehiculo(Vehiculo nVehiculo) {
        try {

            //establecer la conexion
            Conexion conex = new Conexion();
            Connection cnx = conex.obtenerConexion();
            //preparar query
            String query = "UPDATE vehiculo SET motor=?, chasis=?, marca=?, "
                    + "modelo=?, anio_vehiculo=?, combustible=?, tipo_vehiculo=? "
                    + " WHERE patente=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar rlos parametros
            stmt.setString(1, nVehiculo.getMotorVehiculo());
            stmt.setString(2, nVehiculo.getChasisVehiculo());
            stmt.setString(3, nVehiculo.getMarcaVehiculo());
            stmt.setString(4, nVehiculo.getModeloVehiculo());
            stmt.setString(5, nVehiculo.getAnioVehiculo());
            stmt.setString(6, nVehiculo.getCombustibleVehiculo());
            stmt.setString(7, nVehiculo.getTipoVehiculo());
            stmt.setString(8, nVehiculo.getPatenteVehiculo());
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
