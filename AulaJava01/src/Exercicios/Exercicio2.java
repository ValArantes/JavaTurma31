package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner(System.in);
		
		int anos, meses, dias;
		
		System.out.println("Digite quantos dias de vida voc? tem: ");
		dias= entrada.nextInt();
		
		anos= dias/365;
		meses= (dias % 365)/30;
		dias= (dias%365)%30;
		
		System.out.println("Sua idade ? de: "+ anos + " anos " + meses + " meses " + dias + " Dias");
		
		entrada.close();
		
	}

}
