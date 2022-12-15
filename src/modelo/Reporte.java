/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Reporte {
    private String rutVendedor;
    private int autosArrendados;
    private int valorDiario;
    private int valorMensual;

    public Reporte() {
    }

    public Reporte(String rutVendedor, int autosArrendados, int valorDiario, int valorMensual) {
        this.rutVendedor = rutVendedor;
        this.autosArrendados = autosArrendados;
        this.valorDiario = valorDiario;
        this.valorMensual = valorMensual;
    }

    public String getRutVendedor() {
        return rutVendedor;
    }

    public void setRutVendedor(String rutVendedor) {
        this.rutVendedor = rutVendedor;
    }

    public int getAutosArrendados() {
        return autosArrendados;
    }

    public void setAutosArrendados(int autosArrendados) {
        this.autosArrendados = autosArrendados;
    }

    public int getValorDiario() {
        return valorDiario;
    }

    public void setValorDiario(int valorDiario) {
        this.valorDiario = valorDiario;
    }

    public int getValorMensual() {
        return valorMensual;
    }

    public void setValorMensual(int valorMensual) {
        this.valorMensual = valorMensual;
    }
    
    
    
    
}
