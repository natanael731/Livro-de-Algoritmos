package LivroDeAlgoritimos;

import java.util.Scanner;

public class Exerciciog {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        // Leitura dos valores inteiros
		        System.out.print("Digite o valor de A: ");
		        int A = scanner.nextInt();
		        System.out.print("Digite o valor de B: ");
		        int B = scanner.nextInt();
		        System.out.print("Digite o valor de C: ");
		        int C = scanner.nextInt();
		        System.out.print("Digite o valor de D: ");
		        int D = scanner.nextInt();

		        // Adições
		        System.out.println("\nResultados das adições:");
		        System.out.println("A + B = " + (A + B));
		        System.out.println("A + C = " + (A + C));
		        System.out.println("A + D = " + (A + D));
		        System.out.println("B + C = " + (B + C));
		        System.out.println("B + D = " + (B + D));
		        System.out.println("C + D = " + (C + D));

		        // Multiplicações
		        System.out.println("\nResultados das multiplicações:");
		        System.out.println("A * B = " + (A * B));
		        System.out.println("A * C = " + (A * C));
		        System.out.println("A * D = " + (A * D));
		        System.out.println("B * C = " + (B * C));
		        System.out.println("B * D = " + (B * D));
		        System.out.println("C * D = " + (C * D));

		        scanner.close();
		    }
		


	}


