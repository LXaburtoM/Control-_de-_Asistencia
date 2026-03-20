package Main;
//Se desarrollará un sistema para controlar la asistencia de estudiantes mediante clases.
//El sistema recorrerá una lista de estudiantes usando estructuras repetitivas.
//Se contabilizarán presentes y ausentes durante el proceso.
//Finalmente, se mostrará un resumen de la asistencia general.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = sc.nextInt();
        sc.nextLine();

        while (numEstudiantes == 3)
            System.out.print("Ingrese los nombres de los estudiantes: ");
        String[] estudiantes = new String[numEstudiantes];
        for (int i = 0; i < numEstudiantes; i++) {
            estudiantes[i] = sc.nextLine();


            
        }






    }
}
