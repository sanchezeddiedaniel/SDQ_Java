import java.util.Scanner;

public class TablaMultiplicacion
{
public static void tablaDeMultiplicacion(int numero, int num){

    for(int i = 1; i <= num; ++i)
    {
        System.out.println(numero +" * " + i + " = " + numero * i);
    }

}
public static void entradatablaDeMultiplicacion(){
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese el numero para crear la tabla: ");
    int n = teclado.nextInt();
    System.out.print("Ingrese el numero limite de la tabla: ");
    int n2 = teclado.nextInt();
    tablaDeMultiplicacion(n, n2);

}

    public static void main(String[] args) {
        entradatablaDeMultiplicacion();

    }
}
