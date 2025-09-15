package ActividadesColecciones.Actividad4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Curso> cursos = new HashMap<>();

        Curso c1 = new Curso("Química Avanzada", "Martin Gomez");
        Curso c2 = new Curso("Física Clásica", "Florencia Mitran");
        Curso c3 = new Curso("Álgebra Lineal", "Tomas Retoño");
        Curso c4 = new Curso("Biología Molecular", "Ana Pérez");
        Curso c5 = new Curso("Historia Contemporánea", "Luis Fernández");

        cursos.put("Química Avanzada", c1);
        cursos.put("Álgebra Lineal", c3);
        cursos.put("Física Clásica", c2);
        cursos.put("Biología Molecular", c4);
        cursos.put("Historia Contemporánea", c5);

        for (Map.Entry<String, Curso> entry : cursos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
