package Actividad1;

public class Main {
    public static void main(String[]Args){

        Persona persona = new Persona();
        persona.setNombre("Pedro");
        persona.setEdad(22);

        Persona persona2 = new Persona();

        System.out.println(persona);
        System.out.println(persona2);
    }
}