package Testes;

import java.util.Scanner;

public class ConversãoU$toR$ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Converter Real pra Dollar");
		System.out.print("Digite o valor do Dollar: ");
		Double vd = sc.nextDouble();
		System.out.println("Digite quanto deseja converter(em real): ");
        Double vqvc = sc.nextDouble();
        
        sc.close();
        
        //conversão
        
        Double  conv = vd * vqvc;
        System.out.println("Valor convertido: " + conv);
	}

}
