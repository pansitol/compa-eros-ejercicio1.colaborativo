package calculadora1;

import java.util.Scanner;

public class CalculadoraResta {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = entrada.nextDouble();

        double resultado = num1 - num2;

        System.out.println("El resultado de la resta es: " + resultado);

        entrada.close();
    }
}