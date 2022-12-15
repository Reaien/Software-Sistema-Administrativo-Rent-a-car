/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Vehiculo {
    private String patenteVehiculo;
    private String motorVehiculo;
    private String chasisVehiculo;
    private String marcaVehiculo;
    private String modeloVehiculo;
    private String anioVehiculo;
    private String combustibleVehiculo;
    private String tipoVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String patenteVehiculo, String motorVehiculo, String chasisVehiculo, String marcaVehiculo, String modeloVehiculo, String anioVehiculo, String combustibleVehiculo, String tipoVehiculo) {
        this.patenteVehiculo = patenteVehiculo;
        this.motorVehiculo = motorVehiculo;
        this.chasisVehiculo = chasisVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.modeloVehiculo = modeloVehiculo;
        this.anioVehiculo = anioVehiculo;
        this.combustibleVehiculo = combustibleVehiculo;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPatenteVehiculo() {
        return patenteVehiculo;
    }

    public void setPatenteVehiculo(String patenteVehiculo) {
        this.patenteVehiculo = patenteVehiculo;
    }

    public String getMotorVehiculo() {
        return motorVehiculo;
    }

    public void setMotorVehiculo(String motorVehiculo) {
        this.motorVehiculo = motorVehiculo;
    }

    public String getChasisVehiculo() {
        return chasisVehiculo;
    }

    public void setChasisVehiculo(String chasisVehiculo) {
        this.chasisVehiculo = chasisVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public String getAnioVehiculo() {
        return anioVehiculo;
    }

    public void setAnioVehiculo(String anioVehiculo) {
        this.anioVehiculo = anioVehiculo;
    }

    public String getCombustibleVehiculo() {
        return combustibleVehiculo;
    }

    public void setCombustibleVehiculo(String combustibleVehiculo) {
        this.combustibleVehiculo = combustibleVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
    
    
    
}
