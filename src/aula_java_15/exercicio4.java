package aula_java_15;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua letra: ");
		String letra = scan.next();
		
		switch(letra) {
		case "a": System.out.println("� vogal"); break;
		case "A": System.out.println("� vogal"); break;
		case "e": System.out.println("� vogal"); break;
		case "E": System.out.println("� vogal"); break;
		case "i": System.out.println("� vogal"); break;
		case "I": System.out.println("� vogal"); break;
		case "o": System.out.println("� vogal"); break;
		case "O": System.out.println("� vogal"); break;
		case "u": System.out.println("� vogal"); break;
		case "U": System.out.println("� vogal"); break;
		default: System.out.println("� consoante");
		}

	}

}
