package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public void ejecutarReflexion() {
        try {
            Constructor<?>[] constructores = Persona.class.getDeclaredConstructors();
            System.out.println("Constructores de la clase Persona:");
            for (Constructor<?> constructor : constructores) {
                System.out.println(constructor);
            }

            Constructor<Persona> constructor = Persona.class.getDeclaredConstructor(String.class, int.class);
            Persona persona = constructor.newInstance("Juan", 30);

            Field campoNombre = Persona.class.getDeclaredField("nombre");
            campoNombre.setAccessible(true);
            campoNombre.set(persona, "Carlos");

            Method metodoMostrar = Persona.class.getDeclaredMethod("mostrarInformacion");
            metodoMostrar.invoke(persona);

            Method metodoSaludar = Persona.class.getDeclaredMethod("Saludar");
            metodoSaludar.setAccessible(true);
            String saludo = (String) metodoSaludar.invoke(persona);
            System.out.println(saludo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
