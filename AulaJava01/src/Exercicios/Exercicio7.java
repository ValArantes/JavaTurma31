package Exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		int A, B, C, D, E, F;
		double X,Y;
		
		System.out.println("Digite o primeiro n�mero: ");
		A= entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		B= entrada.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		C= entrada.nextInt();
		
		System.out.println("Digite o quarto n�mero: ");
		D= entrada.nextInt();
		
		System.out.println("Digite o quinto n�mero: ");
		E= entrada.nextInt();
		
		System.out.println("Digite o sexto n�mero: ");
		F= entrada.nextInt();
		
		X=(C*E)-(B*F)/(A*E)-(B*D);
		Y=(A*F)-(C*D)/(A*E)-(B*D);
		
		
		System.out.println("O resultado de X � : "+X);
		System.out.println("O resultado de Y � : "+Y);
		
		entrada.close();
		
	}

}
