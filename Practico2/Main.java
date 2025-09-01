package Practico2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> estudiantesCurso1 = new ArrayList<>();
        estudiantesCurso1.add(new Estudiante("Juan", 20, "Ingeniería en Sistemas"));
        estudiantesCurso1.add(new Estudiante("María", 22, "Diseño Gráfico"));

        List<Estudiante> estudiantesCurso2 = new ArrayList<>();
        estudiantesCurso2.add(new Estudiante("Pedro", 21, "Medicina"));
        estudiantesCurso2.add(new Estudiante("Ana", 23, "Arquitectura"));

        Curso curso1 = new Curso("Estructuras de Datos", "Prof. Carlos Ruiz", estudiantesCurso1);
        Curso curso2 = new Curso("Desarrollo de Software", "Prof. Laura Gómez", estudiantesCurso2);

        System.out.println(curso1);
        System.out.println(curso2);
    }
}
