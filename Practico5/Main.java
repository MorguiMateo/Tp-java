package Practico5;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Producto> listaProductos = new HashSet<>();

        Producto producto1 = new Producto("001", "Laptop", 1200.00);
        Producto producto2 = new Producto("002", "Mouse", 25.00);
        Producto producto3 = new Producto("001", "Laptop", 1200.00);

        agregarProducto(listaProductos, producto1);
        agregarProducto(listaProductos, producto2);
        agregarProducto(listaProductos, producto3);

        System.out.println("Lista de Productos en HashSet:");
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }

    public static void agregarProducto(Set<Producto> lista, Producto producto) {
        if (lista.add(producto)) {
            System.out.println("Producto añadido: " + producto);
        } else {
            System.out.println("El producto con código " + producto.getCodigo() + " ya existe y no se añadirá.");
        }
    }
}

