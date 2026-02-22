package calculadora1;

import java.util.Scanner;

public class CalculadoraResta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccione el numero según la operación que desea realizar: ");
        System.out.println("1 - Suma\n 2 - Resta\n 3 - Multiplicación"); 
        int opcion1 = entrada.nextInt();

        System.out.println("Ingrese el primer número: ");
        int num2 = entrada.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num3 = entrada.nextInt();
        //
        resta(9, 5);
       
    }

    public static void resta (int num1, int num2) {
        
        int resultado = num1 - num2;

        System.out.println("El resultado de la resta es: " + resultado);

    }

    public int calcularMultiplicacion (int a, int b) {
        int resultado = a*b;
        return resultado;
    }
}