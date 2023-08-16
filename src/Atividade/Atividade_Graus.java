package Atividade;

import java.util.Scanner;

public class Atividade_Graus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		double Fahrenheit;
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		Fahrenheit  = leia.nextDouble();
		
		double Celcius =  5 * (Fahrenheit - 32) / 9;

		
		System.out.println("A temperatura em celcius é: " + Celcius);
		
	
		
		
		leia.close();
		
	}

}
