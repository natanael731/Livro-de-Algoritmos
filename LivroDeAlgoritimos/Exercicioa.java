package LivroDeAlgoritimos;

import java.util.Scanner;

public class Exercicioa {

	public static void main(String[] args) {
		// Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita que o usuário insira a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Converte a temperatura de Celsius para Fahrenheit
        double fahrenheit = celsius * 9 / 5 + 32;
        
        // Exibe o resultado da conversão
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        
        // Fecha o scanner
        scanner.close();

	}

}
