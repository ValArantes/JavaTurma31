package Exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		double Fab, custo;
		
		System.out.println("Digite o valor de fábrica: ");
		Fab= entrada.nextDouble();
		
		custo= Fab+ (Fab*0.28) + (Fab*0.45);
		
		System.out.println("O custo para o consulmidor é de: " +custo);
		
		entrada.close();
	}

}
