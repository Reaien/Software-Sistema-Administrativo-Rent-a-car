
package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import modelo.Arriendo;

/**
 *
 * @author Administrador
 */
public class ArriendoController {
   
    public boolean agregarArriendo(Arriendo nArriendo)
    {//metodo para agregar arriendo
        Date date1;
        Date date2;
        try{
            //establecer la conexión
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion();  
            date1 = nArriendo.getFechaInicioArriendo();
            date2 = nArriendo.getFechaFinArriendo();
            //preparar query
            String query = "INSERT INTO arriendo (id_arriendo, fecha_inicio_arriendo, fecha_fin_arriendo, "
                    + "valor_arriendo, observacion_arriendo, rut_cliente, rut_vendedor, patente) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt=cnx.prepareStatement(query);
            //ingresar los parametros
            stmt.setString(1, nArriendo.getIdArriendo());
            stmt.setDate(2, new java.sql.Date(date1.getTime()));
            stmt.setDate(3, new java.sql.Date(date2.getTime()));
            stmt.setInt(4, nArriendo.getValorArriendo());
            stmt.setString(5, nArriendo.getObservacionArriendo());
            stmt.setString(6, nArriendo.getRutCliente());
            stmt.setString(7, nArriendo.getRutVendedor());
            stmt.setString(8, nArriendo.getPatente());
            //ejecutar la query
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;            
        }catch(SQLException ex){
            System.out.println("Error SQL al agregar contrato de arriendo: "+ex.getMessage());
            return false;
        }catch(Exception ex){
            System.out.println("Error al agregar contrato de arriendo: "+ex.getMessage());
            return false;
        }
    }    
    
    
    //buscar arriendo para verificar patente existente y que no esté en arriendo actualmente
    
    public Arriendo buscarPatente(String nPatente)
    {
    
        Arriendo datosArriendo = new Arriendo();
        try{                 
            //establecer la conexión a travéz de la clase conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion(); //obtener metodo obtenerConexion a través de la instancia coneX
            //preparar query para la BD
            String query = "SELECT patente "            //se agrega la fecha para que la validación contemple arriendos nuevos en mismo vehiculo
                    + "FROM arriendo WHERE patente=? and fecha_fin_arriendo > sysdate()";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar los parametros
            stmt.setString(1, nPatente);
            //ejecutar query
            ResultSet rs=stmt.executeQuery();
            if (rs.next()) {
                datosArriendo.setPatente(rs.getString("patente"));
            }
            stmt.close();
            cnx.close();
            rs.close();            
        }catch(SQLException ex){
            System.out.println("Error SQL al buscar una patente: "+ex.getMessage());
        }catch(Exception ex){
            System.out.println("Error al buscar una patente: "+ex.getMessage());
        }
        return datosArriendo;
    }    
    
   
    //buscar arriendo por n arriendo
    
    public Arriendo buscarArriendo(String nArriendo)
    {
    
        Arriendo datosArriendo = new Arriendo();
        try{                 
            //establecer la conexión a travéz de la clase conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion(); //obtener metodo obtenerConexion a través de la instancia coneX
            //preparar query para la BD
            String query = "SELECT id_arriendo, fecha_inicio_arriendo, fecha_fin_arriendo, "
                    + "valor_arriendo, observacion_arriendo, rut_cliente, rut_vendedor, patente "
                    + "FROM arriendo WHERE id_arriendo=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar los parametros
            stmt.setString(1, nArriendo);
            //ejecutar la query
            ResultSet rs=stmt.executeQuery();
            if (rs.next()) {
                datosArriendo.setRutVendedor(nArriendo);
                datosArriendo.setFechaInicioArriendo(rs.getDate("fecha_inicio_arriendo"));
                datosArriendo.setFechaFinArriendo(rs.getDate("fecha_fin_arriendo"));
                datosArriendo.setValorArriendo(rs.getInt("valor_arriendo"));
                datosArriendo.setObservacionArriendo(rs.getString("observacion_arriendo"));
                datosArriendo.setRutCliente(rs.getString("rut_cliente"));
                datosArriendo.setRutVendedor(rs.getString("rut_vendedor"));
                datosArriendo.setPatente(rs.getString("patente"));
            }
            stmt.close();
            cnx.close();
            rs.close();            
        }catch(SQLException ex){
            System.out.println("Error SQL al buscar un vendedor: "+ex.getMessage());
        }catch(Exception ex){
            System.out.println("Error al buscar un vendedor: "+ex.getMessage());
        }
        return datosArriendo;
    }


    //metodo para llenar la jtable de arrriendo con todos los registros 
    public ArrayList<Arriendo> llenarTableArriendos()
    {
    
        ArrayList<Arriendo> listaArriendos = new ArrayList<>();
        try{                 
            //establecer la conexión a travéz de la clase conexion
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion(); //obtener metodo obtenerConexion a través de la instancia coneX
            //preparar query para la BD
            String query = "SELECT id_arriendo, fecha_inicio_arriendo, fecha_fin_arriendo, "
                    + "valor_arriendo, observacion_arriendo, rut_cliente, rut_vendedor, patente "
                    + "FROM carmona.arriendo";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ejecutar la query
            ResultSet rs=stmt.executeQuery();
            while (rs.next()) {
                Arriendo arr = new Arriendo();
                arr.setIdArriendo(rs.getString("id_arriendo"));
                arr.setFechaInicioArriendo(rs.getDate("fecha_inicio_arriendo"));
                arr.setFechaFinArriendo(rs.getDate("fecha_fin_arriendo"));
                arr.setValorArriendo(rs.getInt("valor_arriendo"));
                arr.setObservacionArriendo(rs.getString("observacion_arriendo"));
                arr.setRutCliente(rs.getString("rut_cliente"));
                arr.setRutVendedor(rs.getString("rut_vendedor"));
                arr.setPatente(rs.getString("patente"));
                listaArriendos.add(arr);
            }
            stmt.close();
            cnx.close();
            rs.close();            
        }catch(SQLException ex){
            System.out.println("Error SQL al buscar un vendedor: "+ex.getMessage());
        }catch(Exception ex){
            System.out.println("Error al buscar un vendedor: "+ex.getMessage());
        }
        return listaArriendos;
    }




    
    //eliminar arriendo
    public boolean eliminarArriendo(String nArriendo)
    {
        try{
            //establecer la conexion
            Conexion coneX=new Conexion();
            Connection cnx=coneX.obtenerConexion();
            //preparo la query que ejectuaré en la BD
            String query = "DELETE FROM arriendo WHERE id_arriendo=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar los parametros
            stmt.setString(1, nArriendo);
            //ejecutar la query
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;            
        }catch(SQLException ex){
            System.out.println("Error SQL al eliminar contrato de arriendo: "+ex.getMessage());
            return false;
        }catch(Exception ex){
            System.out.println("Error al eliminar contrato de arriendo: "+ex.getMessage());
            return false;
        }
    } 
    
    
    //metodo para actualizar arriendo
    public boolean actualizarArriendo(Arriendo nArriendo)
    {   Date date1;
        Date date2;
        date1 = nArriendo.getFechaInicioArriendo();
        date2 = nArriendo.getFechaFinArriendo();
        try{

            //establecer la conexion
            Conexion conex = new Conexion();
            Connection cnx=conex.obtenerConexion();
            //preparar query
            String query = "UPDATE arriendo SET fecha_inicio_arriendo=?, "
                    + "fecha_fin_arriendo=?, valor_arriendo=?, observacion_arriendo=? "
                    + " WHERE id_arriendo=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingresar rlos parametros
            stmt.setDate(1, new java.sql.Date(date1.getTime()));
            stmt.setDate(2, new java.sql.Date(date2.getTime()));
            stmt.setInt(3, nArriendo.getValorArriendo());
            stmt.setString(4, nArriendo.getObservacionArriendo());
            stmt.setString(5, nArriendo.getIdArriendo());
            stmt.executeUpdate();
            stmt.close();
            cnx.close();            
            return true;
        }catch(SQLException ex){
            System.out.println("Error SQL al actualizar contrato de arriendo: "+ex.getMessage());
            return false;
        }catch(Exception ex){
            System.out.println("Error al actualizar contrato de arriendo: "+ex.getMessage());
            return false;
        }
    }    
}
