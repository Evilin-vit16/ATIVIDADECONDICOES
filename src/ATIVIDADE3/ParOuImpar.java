package ATIVIDADE3;


import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args){
        int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("O número " + num + " é Par");
        }else{
            System.out.println("O número " + num + " é Ímpar");
        }
    }
}
