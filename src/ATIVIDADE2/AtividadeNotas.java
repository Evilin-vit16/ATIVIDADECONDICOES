package ATIVIDADE2;

import java.util.Scanner;

public class AtividadeNotas {
    public static void main(String[] args){

        double nota = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a sua nota: ");
        nota = sc.nextDouble();

        if(nota >= 0 && nota <= 10){
            if(nota >= 9){
                System.out.println("Nota Exelente");
            }else if (nota >= 7){
                System.out.println("Nota Boa");
            }else if (nota >= 5 ){
                System.out.println("Satisfatória");
            }else{
                System.out.println("Nota ruim");
            }
        }else{
            System.out.println("Nota invalida");
        }

    }
}
