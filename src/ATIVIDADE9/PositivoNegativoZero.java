package ATIVIDADE9;

import java.util.Scanner;

public class PositivoNegativoZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número:");
        double numero = sc.nextDouble();

        if (numero > 0) {
            System.out.println("O número é Positivo");
        } else if (numero < 0) {
            System.out.println("O número é Negativo");
        } else {
            System.out.println("O número é Zero");
        }

    }
}