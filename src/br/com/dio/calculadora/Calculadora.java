package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextDouble();

        int somar = somar(a,b);
        int subtrair = subtrair(a,b);
        int multiplicar = multiplicar(a,b);
        double dividir = dividir(a,b);

        System.out.println("somar:" + somar);
        System.out.println("subtrair: " + subtrair);
        System.out.println("multiplicação " + multiplicar);
        System.out.println("divisão " + dividir);


    }

    public static int somar(double a, double b) {
        return (int) (a + b);
    }
    public static int subtrair(double a, double b) {
        return (int) (a - b);
    }
    public static int multiplicar(double a, double b) {
        return (int) (a * b);
    }
    public static double dividir(double a, double b) {
        return a / b;
    }

}
