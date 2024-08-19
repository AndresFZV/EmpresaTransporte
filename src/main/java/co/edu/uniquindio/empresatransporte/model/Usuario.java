package co.edu.uniquindio.empresatransporte.model;

public class Usuario {

    // Atributos del Usuario
    private String nombre;
    private int edad;
    private double peso;
    private VehiculoPrincipal vehiculoAsociado;

    // Constructor con todos sus atributos
    public Usuario(String nombre, int edad, double peso, VehiculoPrincipal vehiculoAsociado) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vehiculoAsociado = vehiculoAsociado;
    }

    // Constructor vacío
    public Usuario(){

    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public VehiculoPrincipal getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    public void setVehiculoAsociado(VehiculoPrincipal vehiculoAsociado) {
        this.vehiculoAsociado = vehiculoAsociado;
    }

    // Método toString
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vehiculoAsociado=" + vehiculoAsociado +
                '}';
    }
}
