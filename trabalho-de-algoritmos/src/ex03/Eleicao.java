package ex03;

import java.util.Scanner;

public class Eleicao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cod, tc1 = 0, tc2 = 0, tc3 = 0, tc4 = 0, vnul = 0, vbran = 0;
		System.out.println("---------------------");
		System.out.println("| JUSTI�A ELEITORAL |");
		System.out.println("---------------------");
		System.out.println("  Tabela de c�digos  ");
		System.out.println("Primeiro candidato: 1");
		System.out.println("Segundo candidato: 2");
		System.out.println("Terceiro candidato: 3");
		System.out.println("Quarto candidato: 4");
		System.out.println("Voto nulo: 5");
		System.out.println("Voto em branco: 6");
		System.out.println(" \n");
		for (int i = 0; i <= 13; i++) {
			System.out.println("Informe o c�digo do voto: ");
			cod = entrada.nextInt();
			switch (cod) {
			case 1:
				tc1 = tc1 + 1;
				break;
			case 2:
				tc2 = tc2 + 1;
				break;
			case 3:
				tc3 = tc3 + 1;
				break;
			case 4:
				tc4 = tc4 + 1;
				break;
			case 5:
				vnul = vnul + 1;
				break;
			case 6:
				vbran = vbran + 1;
				break;
			}
		}
		System.out.println("O total de votos do candidato 1 foi: " + tc1);
		System.out.println("O total de votos do candidato 2 foi: " + tc2);
		System.out.println("O total de votos do candidato 3 foi: " + tc3);
		System.out.println("O total de votos do candidato 4 foi: " + tc4);
		System.out.println("O total de votos nulos foi: " + vnul);
		System.out.println("O total de votos em branco foi: " + vbran);

	}
}