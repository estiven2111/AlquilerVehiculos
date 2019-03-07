/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclerental.vehicle;

/**
 *
 * @author DANIEL
 */
public class Vehiculo {
    
    private String marca;
    private String Modelo;
    private String numeroDePlaca;
    private int capacidad; 
    private int consumo;
    private int kilometraje;
    private String seguros;
    private String consesionario;
    private String estado;
    private String incidentes;
    private String fotografiasDeHallazgoz;
    private String matricula;

    public Vehiculo(String marca, String Modelo, String numeroDePlaca, int capacidad, int consumo, int kilometraje, String seguros, String consesionario, String estado, String incidentes, String fotografiasDeHallazgoz, String matricula) {
        this.marca = marca;
        this.Modelo = Modelo;
        this.numeroDePlaca = numeroDePlaca;
        this.capacidad = capacidad;
        this.consumo = consumo;
        this.kilometraje = kilometraje;
        this.seguros = seguros;
        this.consesionario = consesionario;
        this.estado = estado;
        this.incidentes = incidentes;
        this.fotografiasDeHallazgoz = fotografiasDeHallazgoz;
        this.matricula = matricula;
    }
    
    public Vehiculo(){}
    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getNumeroDePlaca() {
        return numeroDePlaca;
    }

    public void setNumeroDePlaca(String numeroDePlaca) {
        this.numeroDePlaca = numeroDePlaca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getSeguros() {
        return seguros;
    }

    public void setSeguros(String seguros) {
        this.seguros = seguros;
    }

    public String getConsesionario() {
        return consesionario;
    }

    public void setConsesionario(String consesionario) {
        this.consesionario = consesionario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(String incidentes) {
        this.incidentes = incidentes;
    }

    public String getFotografiasDeHallazgoz() {
        return fotografiasDeHallazgoz;
    }

    public void setFotografiasDeHallazgoz(String fotografiasDeHallazgoz) {
        this.fotografiasDeHallazgoz = fotografiasDeHallazgoz;
    }
  
    
    
}
