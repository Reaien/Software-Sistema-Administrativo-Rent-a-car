
package modelo;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Arriendo  {
    private String idArriendo;
    private Date fechaInicioArriendo;
    private Date fechaFinArriendo;
    private int valorArriendo;
    private String observacionArriendo;
    private String rutCliente;
    private String rutVendedor;
    private String patente;

    public Arriendo() {
    }

    public Arriendo(String idArriendo, Date fechaInicioArriendo, Date fechaFinArriendo, int valorArriendo, String observacionArriendo, String rutCliente, String rutVendedor, String patente) {
        this.idArriendo = idArriendo;
        this.fechaInicioArriendo = fechaInicioArriendo;
        this.fechaFinArriendo = fechaFinArriendo;
        this.valorArriendo = valorArriendo;
        this.observacionArriendo = observacionArriendo;
        this.rutCliente = rutCliente;
        this.rutVendedor = rutVendedor;
        this.patente = patente;
    }

    public String getIdArriendo() {
        return idArriendo;
    }

    public void setIdArriendo(String idArriendo) {
        this.idArriendo = idArriendo;
    }

    public Date getFechaInicioArriendo() {
        return fechaInicioArriendo;
    }

    public void setFechaInicioArriendo(Date fechaInicioArriendo) {
        this.fechaInicioArriendo = fechaInicioArriendo;
    }

    public Date getFechaFinArriendo() {
        return fechaFinArriendo;
    }

    public void setFechaFinArriendo(Date fechaFinArriendo) {
        this.fechaFinArriendo = fechaFinArriendo;
    }

    public int getValorArriendo() {
        return valorArriendo;
    }

    public void setValorArriendo(int valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public String getObservacionArriendo() {
        return observacionArriendo;
    }

    public void setObservacionArriendo(String observacionArriendo) {
        this.observacionArriendo = observacionArriendo;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getRutVendedor() {
        return rutVendedor;
    }

    public void setRutVendedor(String rutVendedor) {
        this.rutVendedor = rutVendedor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    
            
}
