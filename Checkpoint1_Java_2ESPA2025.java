import java.util.Scanner;
import java.lang.Math;

public class Checkpoint1_010925 {
    static Scanner input = new Scanner(System.in);

    public static class ExerciciosJava1 {
        public static void main (String[] args) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o valor em metros: ");
            double valor = leitor.nextDouble();
            double centimetro = valor*100;
            double milimetro = valor*1000;
            System.out.println("O valor em centímetro é: " + centimetro + " cm");
            System.out.println("O valor em milímetro é: " + milimetro + " mm");
        }
    }

    public static class ExerciciosJava2 {
        public static void main (String[] args) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite a sua idade: ");
            int idade = leitor.nextInt();


            if(idade < 16){
                System.out.println("Você ainda não pode votar!");
            } else {
                System.out.println("Você já pode votar!");
            }
        }
    }

    public static class ExerciciosJava3 {
        public static void main (String[] args) {
            Scanner leitor1 = new Scanner(System.in);
            System.out.println("Digite o primeiro número: ");
            int num1 = leitor1.nextInt();


            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Digite o segundo número número: ");
            int num2 = leitor2.nextInt();


            if(num1 > num2){
                int intervalo = num1 - num2;


                for(int i = 0; i < (intervalo - 1);  i++){
                    System.out.println((num2 = num2 + 1));
                }
            }
            else if(num1 == num2) {
                System.out.println("Não há nenhum número inteiro entre " + num1 + " e " + num2);
            }
            else {
                int intervalo = num2 - num1;


                for(int i = 0; i < (intervalo - 1);  i++){
                    System.out.println((num1 = num1 + 1));
                }
            }
        }
    }

    public static class ExerciciosJava4 {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite um número inteiro: ");
            int num = leitor.nextInt();
            long fatorial = 1;


            for (int i = 1; i <= num; i++){
                fatorial = fatorial * i;
            }


            System.out.println(fatorial);
        }
    }

    public static class ExerciciosJava5 {
        public static void main (String[] args) {


            int contadorPar = 0;
            int contadorImpar = 0;


            for(int i = 0; i < 10; i++){
                Scanner leitor = new Scanner(System.in);
                System.out.println("Digite um número: ");
                int num = leitor.nextInt();


                if(num % 2 == 0) {
                    System.out.println("Par");
                    contadorPar++;
                } else {
                    System.out.println("Ímpar");
                    contadorImpar++;
                }
            }


            System.out.println("Há " + contadorPar + " Números pares e " + contadorImpar + " Números Ímpares");


        }
    }

    public static class exercicio6 {
        public static void main(String[] args) {
            // Exercício 6: Crie uma função que receba um número inteiro e mostre a tabuada desse número até 10.
            System.out.println("Digite um número inteiro para calcular sua tabuada: ");
            int fator1 = input.nextInt();
            for (int i = 0; i < 10; i++) {
                System.out.println(fator1 + " x " + (i+1) + " = " + (fator1*(i+1)));
            }
        }
    }

    public static class exercicio7 {
        public static void main(String[] args) {
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
    }

    public static class exercicio8 {
        public static void main(String[] args) {
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
    }

    public static class exercicio9 {
        public static void main(String[] args) {
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
    }

    public static class exercicio10 {
        public static void main(String[] args) {
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
}
