package LivroDeAlgoritimos;

import java.util.Scanner;

public class Exercicioe {

	public static void main(String[] args) {
		 // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita que o usuário insira o valor original do bem
        System.out.print("Digite o valor do bem (em R$): ");
        double valor = scanner.nextDouble();
        
        // Solicita que o usuário insira a taxa de juros mensal (em %)
        System.out.print("Digite a taxa de juros mensal (em %): ");
        double taxa = scanner.nextDouble();
        
        // Solicita que o usuário insira o tempo de atraso (em meses)
        System.out.print("Digite o tempo de atraso (em meses): ");
        int tempo = scanner.nextInt();
        
        // Calcula o valor da prestação em atraso
        double prestacao = valor + (valor * (taxa / 100) * tempo);
        
        // Exibe o resultado
        System.out.println("\nValor da prestação com atraso: R$ " + prestacao);
        
        // Fecha o scanner
        scanner.close();

	}

}
