
package modelo;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Cliente {
    private String rutCliente;
    private String digVer;
    private String nombreCliente;
    private Date fechaNacimiento;
    private String direccionCliente;
    private String mailCliente;
    private String fonoCliente;

    public Cliente() {
    }
    
    

    public Cliente(String rutCliente, String digVer, String nombreCliente, Date fechaNacimiento, String direccionCliente, String mailCliente, String fonoCliente) {
        this.rutCliente = rutCliente;
        this.digVer = digVer;
        this.nombreCliente = nombreCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.direccionCliente = direccionCliente;
        this.mailCliente = mailCliente;
        this.fonoCliente = fonoCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDigVer() {
        return digVer;
    }

    public void setDigVer(String digVer) {
        this.digVer = digVer;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getMailCliente() {
        return mailCliente;
    }

    public void setMailCliente(String mailCliente) {
        this.mailCliente = mailCliente;
    }

    public String getFonoCliente() {
        return fonoCliente;
    }

    public void setFonoCliente(String fonoCliente) {
        this.fonoCliente = fonoCliente;
    }
    
    
    
}
