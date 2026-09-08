package ATIVIDADE11;

import java.util.Scanner;

public class SistemaCálculoSalárioBonificaçãoImpostos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o salário bruto do funcionário: R$");
        double salarioBruto = sc.nextDouble();

        System.out.println("Informe o número de anos que o funcionário trabalhou na empresa:");
        int anosTrabalhados = sc.nextInt();

        // Regras de bonificação
        double percentualBonus;
        if (anosTrabalhados > 10) {
            percentualBonus = 0.10;
        } else if (anosTrabalhados >= 5) {
            percentualBonus = 0.05;
        } else {
            percentualBonus = 0.0;
        }

        // Regras de imposto
        double percentualImposto;
        if (salarioBruto > 5000) {
            percentualImposto = 0.27;
        } else if (salarioBruto >= 3000) {
            percentualImposto = 0.18;
        } else {
            percentualImposto = 0.10;
        }

        double valorBonus = salarioBruto * percentualBonus;
        double valorImposto = salarioBruto * percentualImposto;
        double salarioLiquido = salarioBruto + valorBonus - valorImposto;

        System.out.println("----- Resumo do Salário -----");
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Bônus recebido: R$ " + valorBonus);
        System.out.println("Imposto descontado: R$ " + valorImposto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

    }
}
