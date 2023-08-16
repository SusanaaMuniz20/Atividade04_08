package Atividade;

import java.util.Scanner;

public class Atividade_Grau2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		double Celcius;

		System.out.println("Digite a temperatura em Fahrenheit: ");
		Celcius = leia.nextDouble();

		double Fahrenheit = (Celcius * 9 / 5) + 32;

		System.out.println("A temperatura em celcius é: " + Fahrenheit);

		leia.close();

	}

}
