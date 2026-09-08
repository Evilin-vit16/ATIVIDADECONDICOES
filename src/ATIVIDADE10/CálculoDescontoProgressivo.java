package ATIVIDADE10;

import java.util.Scanner;

public class CálculoDescontoProgressivo {    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o valor total da compra: R$");
    double valorCompra = sc.nextDouble();

    double percentualDesconto;

    if (valorCompra > 500) {
        percentualDesconto = 0.20;
    } else if (valorCompra >= 200) {
        percentualDesconto = 0.10;
    } else if (valorCompra >= 100) {
        percentualDesconto = 0.05;
    } else {
        percentualDesconto = 0.0;
    }

    double valorDesconto = valorCompra * percentualDesconto;
    double valorFinal = valorCompra - valorDesconto;

    System.out.println("----- Resumo da Compra -----");
    System.out.println("Valor original: R$ " + valorCompra);
    System.out.println("Percentual de desconto aplicado: " + (percentualDesconto * 100) + "%");
    System.out.println("Valor descontado: R$ " + valorDesconto);
    System.out.println("Valor final da compra: R$ " + valorFinal);
}
}