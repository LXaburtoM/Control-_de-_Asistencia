package Main;
//Se desarrollará un sistema para controlar la asistencia de estudiantes mediante clases.
//El sistema recorrerá una lista de estudiantes usando estructuras repetitivas.
//Se contabilizarán presentes y ausentes durante el proceso.
//Finalmente, se mostrará un resumen de la asistencia general.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] estudiantes = new String[5];
        String [] asistencia = new String[5];
        // ingresamos la cantidad de estudiantes y asistencias maximas que permite el codigo

        int presentes = 0;
        int ausentes = 0;

        for(int i =0; i == 5; i++){
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
            }
        }
        









    }
}
