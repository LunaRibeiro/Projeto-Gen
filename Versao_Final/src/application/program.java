package application;

import java.util.Scanner;

import entities.pessoa;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sintomas = 0;

		System.out.println("Voc� est� com sintomas Gripais?\n1 - Sim\n2 - N�o");
		sintomas = sc.nextInt();

		pessoa ps = new pessoa(sintomas);

		switch (sintomas) {

		case 1:
			// Puxa a parte do com sintomas gripais, ou seja, o primeiro if da classe pessoa
			break;

		case 2:
			// puxa a parte do sem sintomas, ou seja, o segundo if da classe pessoa
			break;

		default:
			System.out.println("Essa op��o n�o existe.");
		}
		sc.close();
	}

}
