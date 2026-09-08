package ATIVIDADE6;

import java.util.Scanner;

public class VerificaçãoAprovaçãoEscolar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a média final do aluno:");
        double media = sc.nextDouble();

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
