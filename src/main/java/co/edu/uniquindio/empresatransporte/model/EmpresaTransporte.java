package co.edu.uniquindio.empresatransporte.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {

    // Declaramos los atributos de la empresa y sus listas
    private String nombre;
    private List<VehiculoTransporte> listaVehiculoTransporte = new ArrayList<>();
    private List<VehiculoCarga> listaVehiculoCarga = new ArrayList<>();
    private List<Asociado> listaAsociados = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();

    // Constructor con todos sus atributos
    public EmpresaTransporte(String nombre, List<VehiculoTransporte> listaVehiculoTransporte,
                             List<VehiculoCarga> listaVehiculoCarga, List<Asociado> listaAsociados,
                             List<Usuario> listaUsuarios) {
        this.nombre = nombre;
        this.listaVehiculoTransporte = listaVehiculoTransporte;
        this.listaVehiculoCarga = listaVehiculoCarga;
        this.listaAsociados = listaAsociados;
        this.listaUsuarios = listaUsuarios;
    }

    // Constructor vacío
    public EmpresaTransporte(){

    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<VehiculoTransporte> getListaVehiculoTransporte() {
        return listaVehiculoTransporte;
    }

    public void setListaVehiculoTransporte(List<VehiculoTransporte> listaVehiculoTransporte) {
        this.listaVehiculoTransporte = listaVehiculoTransporte;
    }

    public List<VehiculoCarga> getListaVehiculoCarga() {
        return listaVehiculoCarga;
    }

    public void setListaVehiculoCarga(List<VehiculoCarga> listaCarga) {
        this.listaVehiculoCarga = listaCarga;
    }

    public List<Asociado> getListaAsociados() {
        return listaAsociados;
    }

    public void setListaAsociados(List<Asociado> listaAsociados) {
        this.listaAsociados = listaAsociados;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }


}
