package ATIVIDADE1;

import java.util.Scanner;

public class VerificaçãoDeMaioridade {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int idade = 0;

        System.out.println("Informe sua idade");
        idade = sc.nextInt();

        if(idade < 18){
            System.out.println("Menor de idade");
        } else if (idade >= 60) {
            System.out.println("Idoso");
        }else{
            System.out.println("Adulto");
        }
    }

}