import java.util.Scanner;

import javax.swing.SingleSelectionModel;

/**
 * EjerciciosJava
 */
public class EjerciciosJava {
public static void main(String[] args) {
   //2.15
   //Definir Variables 
   double p, r=4, i;
   //Datos de Entrada
   Scanner lt=new Scanner(System.in);
   System.out.println("Ingrese valor de la Intensidad:");
   i=lt.nextDouble();
   //Procesos
   p=r*Math.pow(i, 2);
   //Datos de Salida
   System.out.println("La potencia es:"+p);

   

}
    
}