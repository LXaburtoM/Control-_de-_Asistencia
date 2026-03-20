package Main;
import java.util.Scanner;

//Se desarrollará un sistema para controlar la asistencia de estudiantes mediante clases.
//El sistema recorrerá una lista de estudiantes usando estructuras repetitivas.
//Se contabilizarán presentes y ausentes durante el proceso.
//Finalmente, se mostrará un resumen de la asistencia general.

public class ControlDeAsistencia {
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  int cantidad;
  int presentes = 0;
  int ausentes = 0;
  int opcion;

  System.out.println("Ingrese la cantidad de estudiantes:");
  cantidad = sc.nextInt();

  int i = 1;

  // usamos while
  while(i <= cantidad){

   System.out.println("Estudiante #" + i);
   System.out.println("Ingrese 1 si esta presente, 0 si esta ausente:");
   int estado = sc.nextInt();

   if(estado == 1){
    presentes++;
   }else{
    ausentes++;
   }

   i++;
  }

  // usamos do while para mostrar menu/repetir
  do{
   System.out.println("\n--- RESUMEN ---");
   System.out.println("Presentes: " + presentes);
   System.out.println("Ausentes: " + ausentes);

   System.out.println("Desea ver el resumen otra vez? (1=si / 0=no)");
   opcion = sc.nextInt();

  }while(opcion == 1);
 }
}
