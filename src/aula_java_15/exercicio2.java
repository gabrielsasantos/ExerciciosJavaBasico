package aula_java_15;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double valor = scan.nextDouble();
		
		if (valor > 0 ) {
			System.out.println("O valor � positivo. ");
			
		} else {
			System.out.println("O valor � negativo");
		}
	}

}
