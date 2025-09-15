package org.example;

public class Caja<T> {
    private T objeto;

    public void almacenar(T objeto) {
        this.objeto = objeto;
    }

    public T obtener() {
        return objeto;
    }
}
