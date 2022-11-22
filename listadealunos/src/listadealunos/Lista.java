package listadealunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		ArrayList<String> listaNomes = new ArrayList<String>();
		
		boolean continuar = true;
		String nome;
		int num;
		Scanner aluno = new Scanner(System.in);
		Scanner escolha = new Scanner(System.in);
		
		System.out.println("Lista de alunos"); //MENU PRINCIPAL
		System.out.println("1 - Adicionar nome");
		System.out.println("2 - Listar nomes");
		num = escolha.nextInt();
		
		
		while(num != 2) {
			
				if(num == 1) {
				System.out.println("Digite o nome do aluno: ");
				nome = aluno.nextLine().intern();		
				listaNomes.add(nome);
				}
			
			System.out.println("Lista de alunos"); //MENU PRINCIPAL
			System.out.println("1 - Adicionar nome");
			System.out.println("2 - Listar nomes");
			num = escolha.nextInt();
			
		}
		
		System.out.println("A lista atual é: " + listaNomes);
	}

	}
