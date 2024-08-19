package co.edu.uniquindio.empresatransporte.services;

import co.edu.uniquindio.empresatransporte.model.*;

import java.util.Scanner;

public class MainTransporte {

    public static void main(String[] args) {
        // Inicializamos la instancia de EmpresaTransporte
        EmpresaTransporte empresaTransporte = inicializarDatos();
        // Creamos el obteto tipo Scanner
        Scanner in = new Scanner(System.in);
        // Variable que controla las opciones del Switch Case
        int opcion;

        // Switch case para hacer un menú por consola
        do {
            System.out.println("\n** Empresa de Transporte UniQuindío **");
            System.out.println("1. Crear un propietario y un vehículo de carga");
            System.out.println("2. Mostrar información propietarios");
            System.out.println("3. Calcular el total de pasajeros transportados en un día");
            System.out.println("4. Obtener a los usuarios mediante su peso");
            System.out.println("5. Obtener a los usuarios que se movilizaron en un vehículo mediante su placa");
            System.out.println("6. Obtener el número de usuarios que son mayores a 40 años");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    asociacion(empresaTransporte, in);
                    break;
                case 2:
                    mostrarInfoPropietarios(empresaTransporte);
                    break;
                case 3:
                    calcularTotalPasajeros(empresaTransporte);
                    break;
                case 4:
                    obtenerUsuariosPeso(empresaTransporte, in);
                    break;
                case 5:
                    mostrarUsuariosPlaca(empresaTransporte, in);
                    break;
                case 6:
                    obtenerPropietariosMayores(empresaTransporte, in);
                    break;
                case 7:
                    System.out.println("Saliendo del menú... Adiós.");
                    break;
                default:
                    System.out.println("La opción no existe, por favor inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 6);
        in.close(); // Cerramos el Scanner al final
    }

    // Método que inicializa los datos de prueba
    private static EmpresaTransporte inicializarDatos() {
        EmpresaTransporte empresaTransporte = new EmpresaTransporte();

        // Creamos los objetos de prueba
        Asociado asociado1 = new Asociado();
        Asociado asociado2 = new Asociado();
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();
        VehiculoCarga vehiculoCarga1 = new VehiculoCarga();
        VehiculoCarga vehiculoCarga2 = new VehiculoCarga();
        VehiculoTransporte vehiculoTransporte1 = new VehiculoTransporte();
        VehiculoTransporte vehiculoTransporte2 = new VehiculoTransporte();

        // Inicialización de los datos de los asociados
        asociado1.setNombre("Andrés");
        asociado1.setDocumento("1012317108");
        asociado1.setEmail("andres@gmail.com");
        asociado1.setTelefono("3145065645");
        asociado1.setEdad(30);

        asociado2.setNombre("John");
        asociado2.setDocumento("57789356");
        asociado2.setEmail("stiven@gmail.com");
        asociado2.setTelefono("3178507726");
        asociado2.setEdad(50);

        // Inicialización de los datos de los usuarios
        usuario1.setNombre("John");
        usuario1.setEdad(19);
        usuario1.setPeso(75);

        usuario2.setNombre("David");
        usuario2.setEdad(50);
        usuario2.setPeso(55);

        // Inicialización de los datos de los vehículos de carga
        vehiculoCarga1.setPlaca("JFE196");
        vehiculoCarga1.setModelo("Camión");
        vehiculoCarga1.setMarca("Ford");
        vehiculoCarga1.setColor("Verde oscuro");
        vehiculoCarga1.setNumeroChasis("1GHBJ25");
        vehiculoCarga1.setCapacidadCarga(500);
        vehiculoCarga1.setNumeroEjes(15);

        vehiculoCarga2.setPlaca("HFK870");
        vehiculoCarga2.setModelo("Camión pequeño");
        vehiculoCarga2.setMarca("Chevrolet");
        vehiculoCarga2.setColor("Azul");
        vehiculoCarga2.setNumeroChasis("3HGS12N");
        vehiculoCarga2.setCapacidadCarga(250);
        vehiculoCarga2.setNumeroEjes(10);

        // Inicialización de los datos de los vehículos de transporte
        vehiculoTransporte1.setPlaca("QPZ532");
        vehiculoTransporte1.setModelo("Bus");
        vehiculoTransporte1.setMarca("Chevrolet");
        vehiculoTransporte1.setColor("Azul");
        vehiculoTransporte1.setCapacidadMaxima(60);

        vehiculoTransporte2.setPlaca("ARB123");
        vehiculoTransporte2.setModelo("Colectivo");
        vehiculoTransporte2.setMarca("Kia");
        vehiculoTransporte2.setColor("Rojo");
        vehiculoTransporte2.setCapacidadMaxima(20);

        // Asociamos vehículos a los asociados y usuarios
        asociado1.setVehiculoPrincipal(vehiculoCarga1);
        asociado1.getListaVehiculosAsociados().add(vehiculoCarga1);
        asociado1.getListaVehiculosAsociados().add(vehiculoCarga2);

        asociado2.setVehiculoPrincipal(vehiculoCarga2);
        asociado2.getListaVehiculosAsociados().add(vehiculoCarga2);

        usuario1.setVehiculoAsociado(vehiculoTransporte1);
        usuario2.setVehiculoAsociado(vehiculoTransporte2);

        // Añadimos los datos a la empresa
        empresaTransporte.getListaAsociados().add(asociado1);
        empresaTransporte.getListaAsociados().add(asociado2);
        empresaTransporte.getListaUsuarios().add(usuario1);
        empresaTransporte.getListaUsuarios().add(usuario2);
        empresaTransporte.getListaVehiculoCarga().add(vehiculoCarga1);
        empresaTransporte.getListaVehiculoCarga().add(vehiculoCarga2);
        empresaTransporte.getListaVehiculoTransporte().add(vehiculoTransporte1);
        empresaTransporte.getListaVehiculoTransporte().add(vehiculoTransporte2);

        return empresaTransporte;
    }

    // 1. Método para crear un propietario y un vehículo de carga
    private static void asociacion(EmpresaTransporte empresaTransporte, Scanner in) {
        in.nextLine();
        System.out.print("Ingrese el nombre del propietario: ");
        String nombre = in.nextLine();
        System.out.print("Ingrese el documento del propietario: ");
        String documento = in.nextLine();
        System.out.print("Ingrese el email del propietario: ");
        String email = in.nextLine();
        System.out.print("Ingrese el teléfono del propietario: ");
        String telefono = in.nextLine();
        System.out.println("Ingrese la edad del propietario: ");
        int edad = in.nextInt();
        in.nextLine();

        // Creación del nuevo propietario
        Asociado nuevoPropietario = new Asociado();
        nuevoPropietario.setNombre(nombre);
        nuevoPropietario.setDocumento(documento);
        nuevoPropietario.setEmail(email);
        nuevoPropietario.setTelefono(telefono);
        nuevoPropietario.setEdad(edad);

        // Captura de datos para el nuevo vehículo de carga
        System.out.print("Ingrese la placa del vehículo de carga: ");
        String placa = in.nextLine();
        System.out.print("Ingrese el modelo del vehículo de carga: ");
        String modelo = in.nextLine();
        System.out.print("Ingrese la marca del vehículo de carga: ");
        String marca = in.nextLine();
        System.out.print("Ingrese el color del vehículo de carga: ");
        String color = in.nextLine();
        System.out.print("Ingrese el número de chasis del vehículo de carga: ");
        String numeroChasis = in.nextLine();
        System.out.print("Ingrese la capacidad de carga del vehículo de carga: ");
        double capacidadCarga = in.nextDouble();
        System.out.print("Ingrese el número de ejes del vehículo de carga: ");
        int numeroEjes = in.nextInt();

        // Creación del nuevo vehículo de carga
        VehiculoCarga nuevoVehiculoCarga = new VehiculoCarga();
        nuevoVehiculoCarga.setPlaca(placa);
        nuevoVehiculoCarga.setModelo(modelo);
        nuevoVehiculoCarga.setMarca(marca);
        nuevoVehiculoCarga.setColor(color);
        nuevoVehiculoCarga.setNumeroChasis(numeroChasis);
        nuevoVehiculoCarga.setCapacidadCarga(capacidadCarga);
        nuevoVehiculoCarga.setNumeroEjes(numeroEjes);

        // Asociar el vehículo al propietario y agregar a la empresa
        nuevoPropietario.setVehiculoPrincipal(nuevoVehiculoCarga);
        nuevoPropietario.getListaVehiculosAsociados().add(nuevoVehiculoCarga);
        empresaTransporte.getListaAsociados().add(nuevoPropietario);
        empresaTransporte.getListaVehiculoCarga().add(nuevoVehiculoCarga);

        System.out.println("Propietario y vehículo de carga creados exitosamente.");
    }

    // 2. Método para mostrar la información de los propietarios
    private static void mostrarInfoPropietarios(EmpresaTransporte empresaTransporte) {
        for (Asociado asociado : empresaTransporte.getListaAsociados()) {
            System.out.println(asociado);
        }
    }

    // 3. Método para calcular el total de pasajeros transportados en un día
    private static void calcularTotalPasajeros(EmpresaTransporte empresaTransporte) {
        int totalPasajeros = 0;
        for (VehiculoTransporte vehiculo : empresaTransporte.getListaVehiculoTransporte()) {
            totalPasajeros += vehiculo.getCapacidadMaxima();
        }
        System.out.println("Total de pasajeros transportados en un día: " + totalPasajeros);
    }

    // 4. Método para obtener usuarios por peso
    private static void obtenerUsuariosPeso(EmpresaTransporte empresaTransporte, Scanner in) {
        System.out.print("Ingrese el peso mínimo: ");
        double pesoMinimo = in.nextDouble();
        usuariosPesoMayor(empresaTransporte, pesoMinimo);
    }

    // Método auxiliar para filtrar usuarios por peso
    private static void usuariosPesoMayor(EmpresaTransporte empresaTransporte, double peso) {
        for (Usuario usuario : empresaTransporte.getListaUsuarios()) {
            if (usuario.getPeso() >= peso) {
                System.out.println("Usuario con peso mayor o igual a " + peso + "kg: " + usuario.getNombre());
            }
        }
    }

    // 5. Método para obtener usuarios según la placa del vehículo
    private static void mostrarUsuariosPlaca(EmpresaTransporte empresaTransporte, Scanner in) {
        System.out.print("Ingrese la placa: ");
        in.nextLine(); //
        String placa = in.nextLine();
        mostrarPasajeros(empresaTransporte, placa);
    }

    // Método auxiliar para mostrar pasajeros asociados a una placa
    private static void mostrarPasajeros(EmpresaTransporte empresaTransporte, String placa) {
        for (Usuario usuario : empresaTransporte.getListaUsuarios()) {
            VehiculoTransporte vehiculoTransporte = (VehiculoTransporte) usuario.getVehiculoAsociado();
            if (vehiculoTransporte != null && vehiculoTransporte.getPlaca().equals(placa)) {
                System.out.println("Usuario asociado a la placa " + placa + ": " + usuario.getNombre());
            }
        }
    }

    // 6. Método para obtener usuarios mayores de 40 años
    private static void obtenerPropietariosMayores(EmpresaTransporte empresaTransporte, Scanner in) {
        System.out.print("Ingrese la edad mínima: ");
        int edadMinima = in.nextInt();
        usuarioEdadMayor(empresaTransporte, edadMinima);
    }

    // Método auxiliar para filtrar usuarios por edad
    private static void usuarioEdadMayor(EmpresaTransporte empresaTransporte, int edad) {
        for (Usuario usuario : empresaTransporte.getListaUsuarios()) {
            if (usuario.getEdad() >= 40) {
                System.out.println("Usuario mayor a 40 años: " + usuario.getNombre());
            }
        }
    }
}
