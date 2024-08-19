package co.edu.uniquindio.empresatransporte.model;

import java.util.ArrayList;
import java.util.List;

public class VehiculoTransporte extends VehiculoPrincipal {

    // Atributos del vehículo de Transporte
    private int capacidadMaxima;
    private List<Usuario> listaUsuariosAsociados = new ArrayList<>();
    // Constructor con todos sus atributos y herencia
    public VehiculoTransporte(String placa, String modelo, String marca, String color, String numeroChasis, int capacidadMaxima) {
        super(placa, modelo, marca, color, numeroChasis);
        this.capacidadMaxima = capacidadMaxima;
    }

    // Constructor vacío
    public VehiculoTransporte(){

    }

    // Getters y Setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public List<Usuario> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }

    public void setListaUsuariosAsociados(List<Usuario> listaUsuariosAsociados) {
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }

    // Método toString
    @Override
    public String toString() {
        return "VehiculoTransporte{" +
                "capacidadMaxima=" + capacidadMaxima +
                ", listaUsuariosAsociados=" + listaUsuariosAsociados +
                '}';
    }
}
