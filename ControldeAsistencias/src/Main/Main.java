package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] estudiantes = new String[5];
        String[] asistencia = new String[5];

        int presentes = 0;
        int ausentes = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i] = sc.nextLine();

            System.out.print("¿El estudiante " + estudiantes[i] + " está presente? (s/n): ");
            asistencia[i] = sc.nextLine();

            if (asistencia[i].equalsIgnoreCase("s")) {
                presentes++;
            } else if (asistencia[i].equalsIgnoreCase("n")) {
                ausentes++;
            } else {
                System.out.println("Entrada no válida. Se considerará como ausente.");
                ausentes++;
                asistencia[i] = "n";
            }
        }

        System.out.println("================================");
        System.out.println("Resumen de Asistencias");
        System.out.println("================================");

        for (int i = 0; i < estudiantes.length; i++) {
            if (asistencia[i].equalsIgnoreCase("s")) {
                System.out.println(estudiantes[i] + ": Presente");
            } else {
                System.out.println(estudiantes[i] + ": Ausente");
            }
        }

        System.out.println("Total de presentes: " + presentes);
        System.out.println("Total de ausentes: " + ausentes);

        sc.close();
    }
}