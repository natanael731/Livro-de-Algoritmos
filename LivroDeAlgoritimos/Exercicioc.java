package LivroDeAlgoritimos;

import java.util.Scanner;

public class Exercicioc {

	public static void main(String[] args) {
		// Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita que o usuário insira o raio da lata
        System.out.print("Digite o raio da lata (em cm): ");
        double raio = scanner.nextDouble();
        
        // Solicita que o usuário insira a altura da lata
        System.out.print("Digite a altura da lata (em cm): ");
        double altura = scanner.nextDouble();
        
        // Calcula o volume da lata usando a fórmula
        double volume = 3.14159 * Math.pow(raio, 2) * altura;
        
        // Exibe o resultado
        System.out.println("O volume da lata de óleo é: " + volume + " cm³");
        
        // Fecha o scanner
        scanner.close();


	}

}
