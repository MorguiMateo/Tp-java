package Practico2;

import Practico1.Persona;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{nombre='" + super.toString() + ", carrera='" + carrera + "'}";
    }
}
