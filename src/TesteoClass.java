import javax.swing.*;
import java.util.Scanner;

public class TesteoClass {

    public static double Suma(double a, double b){
        double res = a + b;

        return res;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa el Primer Numero: ");
        double uno =teclado.nextDouble();
        System.out.print("Ingresa el Segundo Numero: ");
        double dos = teclado.nextDouble();

        double res = Suma(uno, dos);
        System.out.println(res);
//        int n1; int n2; int sum;
//
//        //Consola
//        Scanner entrada = new Scanner(System.in);
//        System.out.print("Ingresa el primer numero: ");
//        n1 = entrada.nextInt();
//        System.out.print("Ingresa el segundo numero: ");
//        n2=entrada.nextInt();
//        sum = n1 + n2;
//        System.out.println("El primer numero es: " + n1 + "\nEl segundo numero es: " + n2 + "\n" + "Resultado: " + sum);
//
//
//        //Ventana Emergente
//        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero: "));
//        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero: "));
//        sum = n1 + n2;
//        JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + sum);



    }
}
