package Testes;

import java.util.Scanner;

public class SomaDoQuadradoDeABC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Soma Dos Quadrados De A,B,C");
		System.out.print("Digite o valor de A ( número inteiro): ");
		int A = sc.nextInt();
		System.out.print("Digite o valor de B ( número inteiro): ");
		int B = sc.nextInt();
		System.out.print("Digite o valor de C ( número inteiro): ");
		int C = sc.nextInt();
		
		sc.close();
		
		//processamento
		
		int result = (A * A) + (B * B) + (C * C);
		System.out.println("Resultado: " + result);
		

	}

}
