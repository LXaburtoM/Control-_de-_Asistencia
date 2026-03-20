package Main;
import java.util.Scanner;

//Se desarrollará un sistema para controlar la asistencia de estudiantes mediante clases.
//El sistema recorrerá una lista de estudiantes usando estructuras repetitivas.
//Se contabilizarán presentes y ausentes durante el proceso.
//Finalmente, se mostrará un resumen de la asistencia general.

public class Asistencia {
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  int cantidad;
  int presentes = 0;
  int ausentes = 0;

  System.out.println("Ingrese la cantidad de estudiantes:");
  cantidad = sc.nextInt();

  for(int i = 1; i <= cantidad; i++){

   System.out.println("Estudiante #" + i);
   System.out.println("Ingrese 1 si esta presente, 0 si esta ausente:");
   int estado = sc.nextInt();

   if(estado == 1){
    presentes++;
   }else{
    ausentes++;
   }
  }

  System.out.println("\n--- RESUMEN ---");
  System.out.println("Presentes: " + presentes);
  System.out.println("Ausentes: " + ausentes);
 }
}
