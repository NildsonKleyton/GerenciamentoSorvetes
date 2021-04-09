package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidade.Sorvete;

public class Soveteria {

	public static void main(String[] args) {
		int op = 0;
		List<Sorvete> listaSorvete = new ArrayList<Sorvete>();
		Scanner resp = new Scanner(System.in);
		
		do {
			System.out.println("==============================");
			System.out.println("        Funcionalidades\n");
			System.out.println("1 - Inserir sorvete");
			System.out.println("2 - Remover sorvete");
			System.out.println("3 - Listar todos os sorvetes");
			System.out.println("0 - Sair");
			System.out.println("==============================");
			System.out.println("Escolha um Opção: ");
	
		} while (op==1);
	}
	
}