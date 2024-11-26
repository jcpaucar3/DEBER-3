package com.mycomany.practpersonahijo;
import java.time.LocalDate;

public class Hijo extends Persona {

    // Constructor inicializa valores vacíos para heredarlos de Persona
    public Hijo() {
        super("", "", 0.0, 0.0, null);
    }

    // Setters
    public void setNombre(String nombre) {
        super.nombre = nombre;
    }

    public void setApellido(String apellido) {
        super.apellido = apellido;
    }

    public void setAltura(double altura) {
        super.altura = altura;
    }

    public void setPeso(double peso) {
        super.peso = peso;
    }
    
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        super.fechaNacimiento = fechaNacimiento;
    }
}