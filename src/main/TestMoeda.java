package main;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class TestMoeda {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa para ler a Cotação do Dólar, e depois um valor em Dólares a ser comprado por uma pessoa
		 * em Reais. Informar quantos Reais a pessoa vai pagar pelos Dólares, considerando ainda que a pessoa terá
		 * que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável
		 * pelos cálculos.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dolar;
		double totalDolares;
		
		
		System.out.println("What is the dollar price?");
		dolar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		totalDolares = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.converterDolarEmReal(totalDolares, dolar));
		
		
		sc.close();
	}

}
