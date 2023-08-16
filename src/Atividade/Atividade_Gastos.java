package Atividade;

import java.util.Scanner;

public class Atividade_Gastos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		double mes1;
		double mes2;
		double mes3;
		
		System.out.println("Digite o valor do mês 1: ");
		mes1 = leia.nextDouble();
		
		System.out.println("Digite o valor do mês 2: ");
		mes2 = leia.nextDouble();
		
		System.out.println("Digite o valor do mês 3: ");
		mes3 = leia.nextDouble();
		
		
		double valor_total = mes1 + mes2 + mes3;
		
		System.out.println("O valor total dos meses 1, 2 e 3 é: " + valor_total);
		
		double media_gastos = (mes1 + mes2 + mes3) / 3;
		
		System.out.println("A média total de gastos é: " + media_gastos);
				
		
		
		leia.close();
		
	}

}
