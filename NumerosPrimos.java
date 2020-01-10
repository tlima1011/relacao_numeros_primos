package br.com.livros.teste;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int c, i, n, p;

		System.out.println("Informe a quantidade de termos: ");
		// leia(n)
		n = sc.nextInt();
		System.out.println("Relação de números primos");
		for (c = 1; c <= n; c++) {
			p = 0;
			for (i = 1; i <= c; i++) {
				if (c % i == 0) {
					p++;
				}
			}
			if (p == 2) {
				System.out.print(c + " ");
			}
		}
	}
}
