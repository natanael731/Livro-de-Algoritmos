package LivroDeAlgoritimos;

import java.util.Scanner;

public class Exercicioh {

	public static void main(String[] args) {
        // Cria o scanner para leitura dos valores
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores do comprimento, largura e altura
        System.out.print("Digite o comprimento da caixa: ");
        double comprimento = scanner.nextDouble();
        System.out.print("Digite a largura da caixa: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite a altura da caixa: ");
        double altura = scanner.nextDouble();

        // Cálculo do volume da caixa
        double volume = comprimento * largura * altura;

        // Exibindo o resultado
        System.out.println("\nO volume da caixa retangular é: " + volume + " unidades cúbicas.");

        // Fechando o scanner
        scanner.close();


	}

}
