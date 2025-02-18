package LivroDeAlgoritimos;

import java.util.Scanner;

public class Exerciciod {

	public static void main(String[] args) {
		// Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita que o usuário insira o tempo gasto na viagem (em horas)
        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = scanner.nextDouble();
        
        // Solicita que o usuário insira a velocidade média (em km/h)
        System.out.print("Digite a velocidade média da viagem (em km/h): ");
        double velocidade = scanner.nextDouble();
        
        // Calcula a distância percorrida
        double distancia = tempo * velocidade;
        
        // Calcula a quantidade de litros de combustível utilizados
        double litrosUsados = distancia / 12;
        
        // Exibe os resultados
        System.out.println("\nResultados da Viagem:");
        System.out.println("Velocidade média: " + velocidade + " km/h");
        System.out.println("Tempo gasto na viagem: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Quantidade de litros de combustível usados: " + litrosUsados + " litros");
        
        // Fecha o scanner
        scanner.close();

	}

}
