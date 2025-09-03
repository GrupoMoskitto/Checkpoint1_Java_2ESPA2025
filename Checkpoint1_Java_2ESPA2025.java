import java.util.Scanner;
import java.lang.Math;

public class Checkpoint1_010925 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //exercicio6();
        //exercicio7();
        //exercicio8();
        //exercicio9();
        exercicio10();
    }

    public static void exercicio6() {
        // Exercício 6: Crie uma função que receba um número inteiro e mostre a tabuada desse número até 10.
        System.out.println("Digite um número inteiro para calcular sua tabuada: ");
        int fator1 = input.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(fator1 + " x " + (i+1) + " = " + (fator1*(i+1)));
        }
    }

    public static void exercicio7() {
        // Exercício 7: Crie uma função que receba dois números e retorne o maior deles.
        System.out.println("Insira dois números para serem comparados: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println("O número 1 (" + num1 + ") é maior do que o número 2 (" + num2 + ").");
        } else if (num2 > num1) {
            System.out.println("O número 2 (" + num2 + ") é maior do que o número 1 (" + num1 + ").");
        } else {
            System.out.println("O número 1 (" + num1 + ") é igual ao número 2 (" + num2 + ").");
        }
    }

    public static void exercicio8() {
        // Exercício 8:	Escreva um programa que leia a altura e o peso de uma pessoa e calcule seu IMC. Mostre também a classificação conforme a tabela:
        //• Abaixo de 18,5 → Abaixo do peso
        //•	18,5 até 24,9 → Peso normal
        //•	25 até 29,9 → Sobrepeso
        //•	30 ou mais → Obesidade
        // imc = peso (kg) / altura (m) ** 2

        System.out.println("Digite seu peso: ");
        double peso = input.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso. IMC = " + Math.round(imc * 100) / 100.0d);
        } else if (18.5 < imc && imc < 24.9) {
            System.out.println("Você está na faixa do peso normal. IMC = " + Math.round(imc * 100) / 100.0d);
        } else if (25 < imc && imc < 29.9) {
            System.out.println("Você está na faixa do sobrepeso. IMC = " + Math.round(imc * 100) / 100.0d);
        } else if (imc > 30) {
            System.out.println("Você está obeso. IMC = " + Math.round(imc * 100) / 100.0d);
        }
    }

    public static void exercicio9() {
        // Exercício 9: Crie uma função que receba três números e retorne a média aritmética.
        int[] lista = new int[3];
        int soma = 0;

        System.out.println("Insira três números para retornar a média aritmética deles: ");
        for (int i = 0; i < 3; i++) {
            lista[i] = input.nextInt();
            soma += lista[i];
        }

        double media = (double) soma / lista.length;
        System.out.println("A média aritmética dos números é " + Math.round(media * 100) / 100.0d);
    }

    public static void exercicio10() {
        // Exercício 10: Escreva um programa que leia o preço de um produto e a forma de pagamento, mostrando o valor final a pagar, conforme a tabela:
        //•	À vista (desconto de 10%)
        //•	Parcelado em 2x (sem juros)
        //•	Parcelado em 4x (juros de 8%)

        System.out.println("Insira o preço do produto: ");
        double valorProduto = input.nextDouble();
        System.out.println("Indique a forma de pagamento (1 - à vista (10% de desconto), 2 - Parcelado em 2x sem juros, 3 - Parcelado em 4x com 8% de juros)");
        int formaPagamento = input.nextInt();
        switch (formaPagamento) {
            case 1 -> System.out.println("O valor final é de R$" + (valorProduto / 10) * 9);
            case 2 -> System.out.println("O valor final é de R$" + valorProduto / 2 + " ao mês por dois meses (sem juros).");
            case 3 -> System.out.println("O valor final é de R$" + (valorProduto + (valorProduto * 0.08)) / 4 + " ao mês por 4 meses com 8% de juros ao todo.");
            default -> System.out.println("Opção não reconhecida.");
        }
    }

}
