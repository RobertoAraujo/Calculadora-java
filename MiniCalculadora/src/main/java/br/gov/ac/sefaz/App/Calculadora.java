package br.gov.ac.sefaz.App;

import java.util.Scanner;

import br.gov.ac.sefaz.classes.Divisao;
import br.gov.ac.sefaz.classes.Multiplicacao;
import br.gov.ac.sefaz.classes.Soma;
import br.gov.ac.sefaz.classes.Subtracao;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// aqui faz lup
 		while(true) {

			System.out.println(" [ Seja Bem! vindo a nossa Calculadora ! ] ");
			System.out.println(" [ 1 - Soma ] ");
			System.out.println(" [ 2 - Subtração ] ");
			System.out.println(" [ 3 - Multiplicação ] ");
			System.out.println(" [ 4 - Divisão ] ");
			System.out.println(" [ 5 - sair ] ");
			
			System.out.println(" Ecolha sua opção : ");
			int opcao = entrada.nextInt();
			
				
			switch (opcao) {

			case 1:
				Soma soma = new Soma();
				System.out.println("Bem Vindo a Soma !!!");

				System.out.println("entre com numero 1");
				soma.setNumero1(entrada.nextInt());
				System.out.println("entre com numero 2");
				soma.setNumero2(entrada.nextInt());

				int resultadosoma = soma.getNumero1() + soma.getNumero2();
				System.out.println("O resultado da soma é :" + resultadosoma);

				continue;

			case 2:
				Subtracao sub = new Subtracao();
				System.out.println("Bem Vindo a Subtração !!!");

				System.out.println("entre com numero 1");
				sub.setNumero1(entrada.nextInt());
				System.out.println("entre com numero 2");
				sub.setNumero2(entrada.nextInt());

				int resultadosub = sub.getNumero1() - sub.getNumero2();
				System.out.println("O Resultado da Subtração é :" + resultadosub);
				
				continue;

			case 3:

				Multiplicacao mult = new Multiplicacao();
				System.out.println("Bem Vindo a Multiplicação !!!");

				System.out.println("entre com numero 1");
				mult.setNumero1(entrada.nextInt());
				System.out.println("entre com numero 2");
				mult.setNumero2(entrada.nextInt());

				int resultadomult = mult.getNumero1() * mult.getNumero2();
				System.out.println("O Resultado da Subtração é :" + resultadomult);
				
				continue;

			case 4:
				Divisao div = new Divisao();
				System.out.println("Bem Vindo a Divisão !!!");

				System.out.println("entre com numero 1");
				div.setNumero1(entrada.nextInt());
				System.out.println("entre com numero 2");
				div.setNumero2(entrada.nextInt());

				int resultadodiv = div.getNumero1() / div.getNumero2();
				System.out.println("O Resultado da Subtração é :" + resultadodiv);
				
				continue;

			case 5:
				System.out.println("Opa Você saiu do programa!");
				break;

			default:
				System.out.println("Opa vc digitou um opção invalida!");
				break;
			}

			entrada.close();
			System.out.println("Saio mesmo");
		}
 		
	}
}
