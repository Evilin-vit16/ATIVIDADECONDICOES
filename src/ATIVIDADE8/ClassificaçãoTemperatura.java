package ATIVIDADE8;

import java.util.Scanner;

public class ClassificaçãoTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a TEMPERATURA:");
        double temperatura = sc.nextDouble();

        if (temperatura > 30) {
            System.out.println("Quente");
        } else if (temperatura >= 15 && temperatura <= 30) {
            System.out.println("Agradável");
        } else{
            System.out.println("Frio");
        }
    }
}
