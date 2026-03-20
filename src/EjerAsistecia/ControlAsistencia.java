package EjerAsistecia;

import javax.swing.*;

public class ControlAsistencia {

    public static void main(String[] args) {

        // 🔹 Pedir la cantidad de estudiantes
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos estudiantes hay?"));

        // 🔹 Crear arreglos para guardar nombres y asistencia
        String[] nombres = new String[cantidad];
        boolean[] asistencia = new boolean[cantidad];

        // 🔹 Contadores
        int presentes = 0;
        int ausentes = 0;

        // ================================
        // 🔹 FOR: ingresar datos
        // ================================
        for (int i = 0; i < cantidad; i++) {

            // Pedir nombre
            nombres[i] = JOptionPane.showInputDialog("Nombre del estudiante " + (i + 1));

            // Pedir asistencia (1 o 0)
            int valor = Integer.parseInt(
                    JOptionPane.showInputDialog("¿Está presente?\n1 = Sí\n0 = No")
            );

            // Convertir a true o false
            asistencia[i] = (valor == 1);
        }

        // ================================
        // 🔹 WHILE: contar asistencia
        // ================================
        int i = 0; // iniciar contador

        while (i < cantidad) {

            // Si está presente
            if (asistencia[i]) {
                presentes++; // sumar a presentes
            } else {
                ausentes++; // sumar a ausentes
            }

            i++; // avanzar al siguiente estudiante
        }

        // ================================
        // 🔹 DO WHILE: mostrar resultados
        // ================================
        int opcion;

        do {
            // Mostrar resumen
            opcion = JOptionPane.showConfirmDialog(
                    null,
                    "Resumen de asistencia:\n\n" +
                            "Presentes: " + presentes + "\n" +
                            "Ausentes: " + ausentes + "\n\n" +
                            "¿Deseas ver la lista completa?"
            );

            // Si el usuario presiona "Sí"
            if (opcion == 0) {

                String texto = "";

                // Recorrer lista para mostrar detalles
                for (int j = 0; j < cantidad; j++) {

                    texto += nombres[j] + " - " +
                            (asistencia[j] ? "Presente" : "Ausente") + "\n";
                }

                // Mostrar lista completa
                JOptionPane.showMessageDialog(null, texto);
            }

        } while (opcion == 0); // repetir si elige "Sí"

    }
}