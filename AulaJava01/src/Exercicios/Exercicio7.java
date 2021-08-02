package Exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		int A, B, C, D, E, F;
		double X,Y;
		
		System.out.println("Digite o primeiro número: ");
		A= entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		B= entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		C= entrada.nextInt();
		
		System.out.println("Digite o quarto número: ");
		D= entrada.nextInt();
		
		System.out.println("Digite o quinto número: ");
		E= entrada.nextInt();
		
		System.out.println("Digite o sexto número: ");
		F= entrada.nextInt();
		
		X=(C*E)-(B*F)/(A*E)-(B*D);
		Y=(A*F)-(C*D)/(A*E)-(B*D);
		
		
		System.out.println("O resultado de X é : "+X);
		System.out.println("O resultado de Y é : "+Y);
		
		entrada.close();
		
	}

}
