package com.mycomany.practpersonahijo;
import java.time.LocalDate;

public class Persona {
    public String nombre;
    public String apellido;
    public double altura;
    public double peso;
    public LocalDate fechaNacimiento;

    // Constructor
    public Persona(String nombre, String apellido, double altura, double peso, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
    
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    // Método para calcular los días restantes para el próximo cumpleaños
    public int CalcularDias() {
        LocalDate hoy = LocalDate.now();
        LocalDate proximoCumple = fechaNacimiento.withYear(hoy.getYear());

        // Si el cumpleaños ya pasó este año, calcular para el próximo año
        if (proximoCumple.isBefore(hoy) || proximoCumple.isEqual(hoy)) {
            proximoCumple = proximoCumple.plusYears(1);
        }

        return (int) java.time.temporal.ChronoUnit.DAYS.between(hoy, proximoCumple);
    }
}