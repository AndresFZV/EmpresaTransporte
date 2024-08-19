package co.edu.uniquindio.empresatransporte.model;

import java.util.ArrayList;
import java.util.List;

public abstract class VehiculoPrincipal {

    // Atributos del vehículo principal
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private String numeroChasis;
    private Asociado propietarioAsociado;
    private List<Asociado> listaPropietariosAsociados = new ArrayList<>();

    // Constructor con todos sus atributos
    public VehiculoPrincipal(String placa, String modelo, String marca, String color, String numeroChasis) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    // Constructor vacío
    public VehiculoPrincipal() {
    }

    // Getters y Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public Asociado getPropietarioAsociado() {
        return propietarioAsociado;
    }

    public void setPropietarioAsociado(Asociado propietarioAsociado) {
        this.propietarioAsociado = propietarioAsociado;
    }

    public List<Asociado> getListaPropietariosAsociados() {
        return listaPropietariosAsociados;
    }

    public void setListaPropietariosAsociados(List<Asociado> listaPropietariosAsociados) {
        this.listaPropietariosAsociados = listaPropietariosAsociados;
    }

    // Método toString
    @Override
    public String toString() {
        return "VehiculoPrincipal{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", numeroChasis='" + numeroChasis + '\'' +
                ", propietarioAsociado=" + propietarioAsociado +
                ", listaPropietariosAsociados=" + listaPropietariosAsociados +
                '}';
    }
}
