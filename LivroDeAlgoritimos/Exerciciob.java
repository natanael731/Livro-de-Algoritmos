package LivroDeAlgoritimos;

import java.util.Scanner;

public class Exerciciob {

	public static void main(String[] args) {
		// Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita que o usuário escolha a operação
        System.out.println("Escolha a conversão:");
        System.out.println("1 - De Celsius para Fahrenheit");
        System.out.println("2 - De Fahrenheit para Celsius");
        int opcao = scanner.nextInt();
        
        if (opcao == 1) {
            // Converte de Celsius para Fahrenheit
            System.out.print("Digite a temperatura em graus Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsius * 9 / 5 + 32;
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        } else if (opcao == 2) {
            // Converte de Fahrenheit para Celsius
            System.out.print("Digite a temperatura em graus Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("A temperatura em Celsius é: " + celsius);
        } else {
            System.out.println("Opção inválida.");
        }
        
        // Fecha o scanner
        scanner.close();

	}

}
