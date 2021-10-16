package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		String[] nomes = new String[4];
		String[] sexo = new String[4];
		int[] idades = new int[4];
		String[] idades2 = new String[4];
		String[] cidades = new String[4];
		int idadeMaisNova = 100;
		int idadeMaisVelha = 0;
		int idadeMaisNovo = 100;
		int idadeMaisVelho = 0;
		String nomeMaisNova = "Fulana";
		String nomeMaisNovo = "Fulano";
		String nomeMaisVelha = "Fulana";
		String nomeMaisVelho = "Fulano";

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {

			System.out.print("Digite o nome: ");
			nomes[i] = scan.next();

			System.out.print("Digite a cidade: ");
			cidades[i] = scan.next();

			System.out.print("Digite a idade: ");
			idades[i] = scan.nextInt();

			if (idades[i] >= 18) {
				idades2[i] = "Maior de idade";
			} else if (idades[i] < 18) {
				idades2[i] = "Menor de idade";
			}

			System.out.print("Digite o sexo M/F: ");
			sexo[i] = scan.next();

			if (sexo[i].equalsIgnoreCase("F")) {
				sexo[i] = "Feminino";
			}

			else if (sexo[i].equalsIgnoreCase("M")) {
				sexo[i] = "Masculino";

			}
			
			System.out.println();
			System.out.println("-------------------------------------------------------");
			System.out.println();

		}
		
		for (int j = 0; j < 4; j++) {
			if(sexo[j].equals("Feminino")) {
				if (idades[j] > idadeMaisVelha) {
					idadeMaisVelha = idades[j];
					nomeMaisVelha = nomes[j];

				}
				if (idades[j] < idadeMaisNova) {
					idadeMaisNova = idades[j];
					nomeMaisNova = nomes[j];

				}
			}
		}
		
		for (int j = 0; j < 4; j++) {
			if(sexo[j].equals("Masculino")) {
				if (idades[j] > idadeMaisVelho) {
					idadeMaisVelho = idades[j];
					nomeMaisVelho = nomes[j];
				}
				if (idades[j] < idadeMaisNovo) {
					idadeMaisNovo = idades[j];
					nomeMaisNovo = nomes[j];
				}
			}
		}


		for (int i = 0; i < 4; i++) {
			System.out
					.println(nomes[i] + ", " + sexo[i] + ", " + cidades[i] + ", " + idades[i] + " anos, " + idades2[i]);

		}
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.println();

		System.out.println("A MULHER MAIS NOVA É: " + nomeMaisNova + " com " + idadeMaisNova + " anos");
		System.out.println("A MULHER MAIS VELHA É: " + nomeMaisVelha + " com " + idadeMaisVelha + " anos");
		System.out.println();
		System.out.println("O HOMEM MAIS NOVO É: " + nomeMaisNovo + " com " + idadeMaisNovo + " anos");
		System.out.println("O HOMEM MAIS VELHO É: " + nomeMaisVelho + " com " + idadeMaisVelho + " anos");
		
		scan.close();
	}

}


