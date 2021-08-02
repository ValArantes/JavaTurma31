package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner(System.in);
		
		int horas, minutos, segundos;
		
		System.out.println("Escreva quantos segundos de duração teve o evento: ");
		segundos= entrada.nextInt();
		
		
		horas= segundos/3600;
		minutos= (segundos% 3600)/60;
		segundos= (segundos%3600)%60;
		
		
		System.out.println("Seu evento teve duração de: " + horas + " horas " + minutos + " Minutos "+ segundos + " Segundos");
		
		
		entrada.close();
		
	}

}
