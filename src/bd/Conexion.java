
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection obtenerConexion() {
        Connection connection = null;
        String url,user,password;
        url="jdbc:mysql://localhost:3306/carmona"; //cambiar usuario
        user="root";
        password="Singforabsolution123"; //cambiar clave
        try {
            connection = DriverManager.getConnection(url,user ,password );
            System.out.println("Conexión exitosa");
        } catch (SQLException ex) {
            System.out.println("Error conexión SQL: "+ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Error conexión: "+ex.getMessage());
        }
        return connection;
    }
}
