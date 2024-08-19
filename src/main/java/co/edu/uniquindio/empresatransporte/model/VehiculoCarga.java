package co.edu.uniquindio.empresatransporte.model;

public class VehiculoCarga extends VehiculoPrincipal{

    // Atributos del vehículo de carga
    private double capacidadCarga;
    private int numeroEjes;

    // Constructor con todos sus atributos y herencia
    public VehiculoCarga(String placa, String modelo, String marca, String color, String numeroChasis, double capacidadCarga, int numeroEjes) {
        super(placa, modelo, marca, color, numeroChasis);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    // Constructor vacío
    public VehiculoCarga(){

    }

    // Getters y Setters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    // Método toString
    @Override
    public String toString() {
        return "VehiculoCarga{" +
                "capacidadCarga=" + capacidadCarga +
                ", numeroEjes=" + numeroEjes +
                '}';
    }
}
