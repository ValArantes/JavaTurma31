package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner(System.in);

		double A, B, C, media;
		
		System.out.println("Digite a primeira nota: ");
		A= entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		B= entrada.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		C= entrada.nextDouble();
		
		A= A*2;
		B=B*3;
		C=C*5;
		media=(A+B+C)/10;
		
		System.out.println("Sua média é de: " + media);
		
		entrada.close();
		
		
	}

}
