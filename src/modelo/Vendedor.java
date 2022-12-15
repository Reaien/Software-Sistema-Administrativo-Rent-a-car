/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Vendedor {
    private String rutVendedor;
    private String digVer;
    private String nombreVendedor;
    private String direccionVendedor;
    private String mailVendedor;
    private String fonoVendedor;   

    public Vendedor() {
    }

    public Vendedor(String rutVendedor, String digVer, String nombreVendedor, String direccionVendedor, String mailVendedor, String fonoVendedor) {
        this.rutVendedor = rutVendedor;
        this.digVer = digVer;
        this.nombreVendedor = nombreVendedor;
        this.direccionVendedor = direccionVendedor;
        this.mailVendedor = mailVendedor;
        this.fonoVendedor = fonoVendedor;
    }

    public String getRutVendedor() {
        return rutVendedor;
    }

    public void setRutVendedor(String rutVendedor) {
        this.rutVendedor = rutVendedor;
    }

    public String getDigVer() {
        return digVer;
    }

    public void setDigVer(String digVer) {
        this.digVer = digVer;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getDireccionVendedor() {
        return direccionVendedor;
    }

    public void setDireccionVendedor(String direccionVendedor) {
        this.direccionVendedor = direccionVendedor;
    }

    public String getMailVendedor() {
        return mailVendedor;
    }

    public void setMailVendedor(String mailVendedor) {
        this.mailVendedor = mailVendedor;
    }

    public String getFonoVendedor() {
        return fonoVendedor;
    }

    public void setFonoVendedor(String fonoVendedor) {
        this.fonoVendedor = fonoVendedor;
    }
    
    
    
}
