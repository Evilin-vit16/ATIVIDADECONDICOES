package ATIVIDADE5;

import java.util.Scanner;

public class VerificacaoDiasSemana {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7 para representar o dia da semana: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Erro: número inválido! Digite um valor entre 1 e 7.");
                break;
        }

    }
}
