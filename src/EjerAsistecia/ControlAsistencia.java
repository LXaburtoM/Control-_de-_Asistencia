import javax.swing.*;

public class ControlAsistencia {

    public static void main(String[] args) {

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos estudiantes hay?"));

        // 🔹 Arreglos en lugar de otra clase
        String[] nombres = new String[cantidad];
        boolean[] asistencia = new boolean[cantidad];

        int presentes = 0;
        int ausentes = 0;

        // ================================
        // 🔹 FOR: ingresar datos
        // ================================
        for (int i = 0; i < cantidad; i++) {

            nombres[i] = JOptionPane.showInputDialog("Nombre del estudiante " + (i + 1));

            int valor = Integer.parseInt(
                    JOptionPane.showInputDialog("¿Está presente?\n1 = Sí\n0 = No")
            );

            asistencia[i] = (valor == 1);
        }

        // ================================
        // 🔹 WHILE: contar asistencia
        // ================================
        int i = 0;
        while (i < cantidad) {

            if (asistencia[i]) {
                presentes++;
            } else {
                ausentes++;
            }

            i++;
        }

        // ================================
        // 🔹 DO WHILE: mostrar resumen
        // ================================
        int opcion;

        do {
            opcion = JOptionPane.showConfirmDialog(
                    null,
                    "Resumen de asistencia:\n\n" +
                            "Presentes: " + presentes + "\n" +
                            "Ausentes: " + ausentes + "\n\n" +
                            "¿Deseas ver la lista completa?"
            );

            if (opcion == 0) { // Sí
                String texto = "";

                for (int j = 0; j < cantidad; j++) {
                    texto += nombres[j] + " - " +
                            (asistencia[j] ? "Presente" : "Ausente") + "\n";
                }

                JOptionPane.showMessageDialog(null, texto);
            }

        } while (opcion == 0);

    }
}