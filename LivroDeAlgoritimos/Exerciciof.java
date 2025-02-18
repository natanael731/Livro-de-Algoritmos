package LivroDeAlgoritimos;

import java.util.Scanner;

public class Exerciciof {

	public static void main(String[] args) {
		        // Criação de um objeto Scanner para ler os valores do usuário
		        Scanner scanner = new Scanner(System.in);

		        // Ler os valores de A e B
		        System.out.print("Digite o valor de A: ");
		        int A = scanner.nextInt();
		        System.out.print("Digite o valor de B: ");
		        int B = scanner.nextInt();

		        // Realizar a troca dos valores
		        int temp = A;
		        A = B;
		        B = temp;

		        // Exibir os valores após a troca
		        System.out.println("Após a troca:");
		        System.out.println("A = " + A);
		        System.out.println("B = " + B);

		        // Fechar o scanner
		        scanner.close();
		    }
		


	}


