package ex05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Quantidade de funcionarios: ");
		int n = sc.nextInt();
		Funcionario[] vect = new Funcionario[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Informe o c�digo do funcionario: ");
			int cod = sc.nextInt();
			System.out.println("Número de horas trabalhadas no mês: ");
			double numeroHorasMes = sc.nextDouble();
			System.out.println("Turno de Trabalho (M - Matutino, V - Vespertino ou N - Noturno): ");
			char turno = sc.next().charAt(0);
			turno = Character.toUpperCase(turno);
			System.out.println("Categoria (O - Oper�rio ou G - Gerente): ");
			char categoria = sc.next().charAt(0);
			categoria = Character.toUpperCase(categoria);
			System.out.println();
			System.out.print("Funcionario " + (i + 1) + " registrado!");
			System.out.println();

			vect[i] = new Funcionario(cod, numeroHorasMes, turno, categoria);
		}

		for (int i = 0; i < vect.length; i++) {
			System.out.println((i + 1) + " => " + vect[i]);
		}

		sc.close();

	}

}
