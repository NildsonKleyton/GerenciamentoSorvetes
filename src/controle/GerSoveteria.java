package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidade.Sorvete;

public class GerSoveteria {

	static List<Sorvete> listaSorvete = new ArrayList<Sorvete>();// cria uma variável global

	public static void main(String[] args) {
		int op = 0, cod = -1;
		String sabor, tipo = null;
		double valor;

		Scanner scan = new Scanner(System.in);
		Scanner scantx = new Scanner(System.in);
		do {
			menu();
			op = scan.nextInt();

			switch (op) {
			case 1:// inserir
					// recebe valores nos atributos
				System.out.print("Sabor do Sorvete: ");
				sabor = scantx.nextLine();

				System.out.print("\nTipo do Sorvete:\n1 - Fruta\n2 - Essência\nOpção: ");
				op = scan.nextInt();
				if (op == 1) {
					tipo = "Fruta";
				}
				if (op == 2) {
					tipo = "Essência";
				}

				System.out.print("\nValor do Sorvete Ex.: 1,20 ou 1:\nR$");
				valor = scan.nextDouble();
				cod++;
				// cria e obj sorvete
				Sorvete sv = new Sorvete();
				sv.setCod(cod);
				sv.setSabor(sabor);
				sv.setTipo(tipo);
				sv.setValor(valor);

				// add na lista
				listaSorvete.add(sv);

				op = 1;// ao sair do case retorna ao menu
				break;
			case 2:// remover
				lista();
				System.out.print("\nEscolha um Sorvete para remover.\nInformando o ID: ");
				for (Sorvete svt : listaSorvete) {
					cod = scan.nextInt();
					if (svt.getCod() == cod) {
						listaSorvete.remove(svt);
						System.out.println("removido");
						break;
					}else{
						System.out.println("não existe");
					}
				}
				op = 1;// ao sair do case retorna ao menu
				break;
			case 3:// listar
				lista();
				System.out.println("\n");
				op = 1;// ao sair do case retorna ao menu
				break;
			case 0:
				System.out.println("Sistema Finalizado.");
				op = 0;// ao sair do case retorna ao menu
				break;
			default:
				System.out.println("Opção invalida.");
				op = 1;// ao sair do case retorna ao menu
				break;
			}

		} while (op == 1);
	}

	public static void menu() {

		System.out.println("==============================");
		System.out.println("        Funcionalidades\n");
		System.out.println("1 - Inserir sorvete");
		System.out.println("2 - Remover sorvete");
		System.out.println("3 - Listar todos os sorvetes");
		System.out.println("0 - Sair");
		System.out.println("==============================");
		System.out.print("Escolha um Opção: ");
	}

	public static void lista() {
		System.out.println("\n");
		System.out.println("Lista de Sorvetes");
		for (Sorvete svt : listaSorvete) {
			System.out.println(svt.toString());
		}
	}

}