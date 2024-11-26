package com.mycomany.practpersonahijo;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practpersonahijo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto de la clase Hijo
        Hijo hijo = new Hijo();

        // Pedir al usuario que ingrese los valores
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        hijo.setNombre(nombre);

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        hijo.setApellido(apellido);

        System.out.print("Ingrese la altura (en metros): ");
        double altura = scanner.nextDouble();
        hijo.setAltura(altura);

        System.out.print("Ingrese el peso (en kg): ");
        double peso = scanner.nextDouble();
        hijo.setPeso(peso);
                
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese la fecha de nacimiento (formato yyyy-MM-dd): ");
        String fechaNacimientoInput = scanner.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        hijo.setFechaNacimiento(fechaNacimiento);

        // Mostrar la información ingresada usando los getters
        System.out.println("\nInformacion del Hijo:");
        System.out.println("Nombre: "+hijo.getNombre());
        System.out.println("Apellido: "+hijo.getApellido());
        System.out.println("Altura: "+hijo.getAltura()+"m");
        System.out.println("Peso: "+hijo.getPeso()+"kg");
        System.out.println("Fecha de nacimiento: "+hijo.getFechaNacimiento());

        int diasparacum = hijo.CalcularDias();
        System.out.println("Dias para cumpleaños: "+diasparacum);
                
        scanner.close(); // Cerrar el Scanner
    }
}
