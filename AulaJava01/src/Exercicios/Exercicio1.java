package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner(System.in);
		
		int ano, mes, dias;
		
		System.out.println("Escreva quantos anos voc� tem: ");
		ano= entrada.nextInt();
		
		System.out.println("Escreva quantos meses voc� tem: ");
		mes= entrada.nextInt();
		
		System.out.println("Escreva quantos dias voc� tem: ");
		dias= entrada.nextInt();
		
		System.out.println("Voc� possui: " + dias + " dias");
		
		entrada.close();
		
	}

}
