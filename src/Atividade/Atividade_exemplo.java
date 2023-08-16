package Atividade;

import java.util.Scanner;

public class Atividade_exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int renda;
		double horas_trabalhadas;
		
		System.out.println("Digite sua renda por hora: " );
		renda = leia.nextInt();
		
		System.out.println("Informe as horas de trabalho mensal: ");
		horas_trabalhadas = leia.nextDouble();
		
		
		
		System.out.println("Sua renda por hora é: " + renda);
		System.out.println("Sua hora mensal de trabalho é: " + horas_trabalhadas);
		
		double total = renda * horas_trabalhadas;
		
		System.out.println("Seu salário mensal é : " + total);
		
		leia.close();
		
		
	}

}
