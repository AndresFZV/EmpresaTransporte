package co.edu.uniquindio.empresatransporte.model;

import java.util.ArrayList;
import java.util.List;

public class Asociado {

    // Atributos del Asociado
    private String nombre;
    private String documento;
    private String email;
    private String telefono;
    private int edad;
    private VehiculoPrincipal vehiculoPrincipal;
    private List<VehiculoCarga> listaVehiculosAsociados = new ArrayList<>();

    // Constructor con todos los atributos
    public Asociado(String nombre, String documento, String email, String telefono,int edad, VehiculoPrincipal vehiculoPrincipal) {
        this.nombre = nombre;
        this.documento = documento;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
        this.vehiculoPrincipal = vehiculoPrincipal;
    }

    // Constructor vacío
    public Asociado(){

    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public VehiculoPrincipal getVehiculoPrincipal() {
        return vehiculoPrincipal;
    }

    public void setVehiculoPrincipal(VehiculoPrincipal vehiculoPrincipal) {
        this.vehiculoPrincipal = vehiculoPrincipal;
    }

    public List<VehiculoCarga> getListaVehiculosAsociados() {
        return listaVehiculosAsociados;
    }

    public void setListaVehiculosAsociados(List<VehiculoCarga> listaVehiculosAsociados) {
        this.listaVehiculosAsociados = listaVehiculosAsociados;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método toString
    @Override
    public String toString() {
        return "Asociado{" +
                "nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad='" + edad + '\'' +
                ", vehiculoPrincipal=" + vehiculoPrincipal +
                ", listaVehiculosAsociados=" + listaVehiculosAsociados +
                '}';
    }
}
