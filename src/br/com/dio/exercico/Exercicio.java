package br.com.dio.exercico;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        nomesMes();
        diasSemana();
        valor();

    }

    public static void nomesMes() {
        int mes = 0;

        Scanner scan = new Scanner(System.in);
        String escmes = "";

        System.out.println("Escolha qual o mes: ");

        mes = scan.nextInt();

        if (mes == 1) {
            escmes = "Janeiro";
        } else if (mes == 2) {
            escmes = "Fevereiro";
        } else if (mes == 3) {
            escmes = "Março";
        } else if (mes == 4) {
            escmes = "Abril";
        } else if (mes == 5) {
            escmes = "Maio";
        } else if (mes == 6) {
            escmes = "Junho";
        } else if (mes == 7) {
            escmes = "Julho";
        } else if (mes == 8) {
            escmes = "Agosto";
        } else if (mes == 9) {
            escmes = "Setembro";
        } else if (mes == 10) {
            escmes = "Outubro";
        } else if (mes == 11) {
            escmes = "Novenbro";
        } else if (mes == 12) {
            escmes = "Dezembro";
        }

        System.out.println("O mes escolhido é: " + escmes);

        if ((mes == 1) || (mes == 7) || (mes == 12)) {
            escmes = "Mes de Férias";
            System.out.println(escmes);
        } else {
            escmes = "Periodo sem ferias";
            System.out.println(escmes);
        }
    }

    public static void diasSemana() {
        // Dias da semana
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva por estenço o dia da semana ? ");
        String semana = String.valueOf(entrada.next());

        switch (semana) {
            case "Domingo":
                System.out.println(1);
                break;
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            default:
                System.out.println("Valor indefinido");
        }
    }

    public static void valor(){
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um valor de 1 a 5: ");
        int valor = ent.nextInt();
        switch(valor) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
        }

    }
}
