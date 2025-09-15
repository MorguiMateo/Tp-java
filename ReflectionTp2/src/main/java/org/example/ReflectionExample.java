package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public void ejecutarReflexion() {
        try {
            // 1. Obtén e imprime sus constructores
            Constructor<?>[] constructores = Persona.class.getDeclaredConstructors();
            System.out.println("Constructores de la clase Persona:");
            for (Constructor<?> constructor : constructores) {
                System.out.println(constructor);
            }

            // 2. Instancia un objeto utilizando reflection
            Constructor<Persona> constructor = Persona.class.getDeclaredConstructor(String.class, int.class);
            Persona persona = constructor.newInstance("Juan", 30);

            // 3. Modifica el valor de nombre en tiempo de ejecución
            Field campoNombre = Persona.class.getDeclaredField("nombre");
            campoNombre.setAccessible(true);
            campoNombre.set(persona, "Carlos");

            // 4. Invoca un método que muestre la información de la persona
            Method metodoMostrar = Persona.class.getDeclaredMethod("mostrarInformacion");
            metodoMostrar.invoke(persona);

            // 5. Modifica el encapsulamiento de Saludar() hacia private usando reflection
            Method metodoSaludar = Persona.class.getDeclaredMethod("Saludar");
            metodoSaludar.setAccessible(true);
            String saludo = (String) metodoSaludar.invoke(persona);
            System.out.println(saludo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
