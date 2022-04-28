import java.util.Scanner;

public class hipotenusa {
    public static void main(String[] args) {
        //Definir Variables
        double a, b, c;
        //Datos de Entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el lado a:");
        a=lt.nextDouble();
        System.out.println("Ingrese el lado b:");
        b=lt.nextDouble();
        //Proceso
        c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        //Datos de Salida
        System.out.println("La hipotenusa: "+c);

        

    }
}
