package aula_java_15;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		double nota2 = scan.nextDouble();
		
		
		double media;
		
		media = (nota1+nota2)/2 ;
		
		if (media >9 && media <=10 ) {
			System.out.println("Sua primeira nota foi: " + nota1);
				System.out.println("Sua segunda nota foi: " + nota2);
					System.out.println("Voc� tirou A");
							System.out.println("Voc� foi aprovado.");
				
		}else if (media >7.5 && media <=9) {
			System.out.println("Sua primeira nota foi: " + nota1);
				System.out.println("Sua segunda nota foi: " + nota2);
					System.out.println("Voce tirou B");
						System.out.println("Voc� foi aprovado.");
			
		}else if (media >6 && media <=7.5) {
			System.out.println("Sua primeira nota foi: " + nota1);
				System.out.println("Sua segunda nota foi: " + nota2);
					System.out.println("Voce tirou C");
						System.out.println("Voc� foi aprovado.");
			
		} else if (media >4 && media <=6) {
			System.out.println("Sua primeira nota foi: " + nota1);
				System.out.println("Sua segunda nota foi: " + nota2);
					System.out.println("Voce tirou D");
						System.out.println("Voc� foi reprovado.");
			
		} else if (media >=0 && media <=4) {
			System.out.println("Sua primeira nota foi: " + nota1);
				System.out.println("Sua segunda nota foi: " + nota2);
					System.out.println("Voce tirou F");
						System.out.println("Voc� foi reprovado.");
		}else {
			System.out.println("Nota inv�lida");
		}
		
		

	}

}
