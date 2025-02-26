package Testes;

import java.util.Scanner;

public class QuadradoDaDiferença {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//entrada
		
		System.out.println("Quadrado da diferença");
		System.out.print("Digite o primeiro número(inteiro): ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número(inteiro):");
        int n2 = sc.nextInt();
        
        //processamento
        
        int QdD = (n1 - n2) * (n1 - n2);
        System.out.println("Resultado da diefrença ^2: " + QdD);
	}

}
