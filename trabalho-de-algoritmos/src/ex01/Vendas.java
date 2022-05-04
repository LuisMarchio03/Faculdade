package ex01;

import java.util.Scanner;

public class Vendas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[] nomes;
		nomes = new String[3];
		int[] TV = new int[3];
		int maior = 0;
		int menor = 99999;
		double comissao = 0;
		double soma = 0, media;

		for (int i = 0; i < 3; i++) {
			System.out.println("Infome o nome do " + (i + 1) + "° vendendor: ");
			nomes[i] = new Scanner(System.in).nextLine();

			System.out.println("Digite os valores totais do " + (i + 1) + "° vendendor: ");
			TV[i] = new Scanner(System.in).nextInt();
			soma = soma + TV[i];

		}

		for (int i = 0; i < 3; i++) {
			if (TV[i] > 5000) {
				comissao = TV[i] * 0.10;
			}
			if (TV[i] >= 3000 && TV[i] <= 5000) {
				comissao = TV[i] * 0.07;
			} else if (TV[i] < 3000) {
				comissao = TV[i] * 0.05;
			}

			System.out.printf("\nO valor da comissão de cada um será de: %.2f ", TV[i] + comissao);

		}

		media = soma / 3;
		System.out.printf("\nA média dos valores totais é: %.2f \n", media);

		for (int i = 0; i < 3; i++) {
			if (TV[i] > maior) {
				maior = TV[i];

			} else if (TV[i] < menor) {
				menor = TV[i];

			}

		}

		System.out.println("A maior comissão é: " + maior);
		System.out.println("A menor comissão é: " + menor);

	}

}
