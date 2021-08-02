package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner(System.in);
		int A, B, C;
		double R,S, D;
		
		System.out.println("Digite o primeiro número: ");
		A= entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		B= entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		C= entrada.nextInt();
		
		R=(A+B)*(A+B);
		S= (B+C)* (B+C);
		
		D=(R+S)/2;
		
		System.out.println("Seu resultado é: " +D);
		
		entrada.close();
		
	}

}
