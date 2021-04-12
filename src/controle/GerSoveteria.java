package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidade.Sorvete;

public class GerSoveteria {

	static List<Sorvete> listaSorvete = new ArrayList<Sorvete>();// cria uma variável global

	public static void main(String[] args) {
		int op, cod = 0;
		String optx, sabor, tipo = null;
		double valor,qtd;

		Scanner scan = new Scanner(System.in);
		Scanner scantx = new Scanner(System.in);
		do {
			System.out.println("==============================");
			System.out.println("        Funcionalidades\n");
			System.out.println("1 - Inserir sorvete");
			System.out.println("2 - Remover sorvete");
			System.out.println("3 - Listar todos os sorvetes");
			System.out.println("0 - Sair");
			System.out.println("==============================");
			System.out.print("Escolha um Opção: ");
			op = scan.nextInt();

			switch (op) {
			case 1:// inserir
				// recebe valores nos atributos
				//sabor
				System.out.print("\n***** Incerir *****\nSabor do Sorvete: ");
				sabor = scantx.nextLine();
				//tipo
				boolean rest;
				do {
					System.out.print("\nTipo do Sorvete:\n1 - Fruta\n2 - Essência\nOpção: ");
					op = scan.nextInt();
					if (op == 1) {
						tipo = "Fruta";
						rest=false;
					}else if (op == 2) {
						tipo = "Essência";
						rest=false;
					}else {
						rest=true;
					}
				}while (rest);
				//quantidade
				System.out.print("\nLitros de Sorvete: ");
				qtd=scan.nextDouble();
				//valor
				System.out.print("\nValor do Sorvete Ex.: 1,20 ou 1:\nR$");
				valor = scan.nextDouble();
				cod++;
				// cria e obj sorvete
				Sorvete sv = new Sorvete();
				sv.setCod(cod);
				sv.setSabor(sabor);
				sv.setTipo(tipo);
				sv.setQuantidade(qtd);
				sv.setValor(valor);

				// add na lista
				listaSorvete.add(sv);
				System.out.println("***** Incerido *****\n");

				op = 1;// ao sair do case retorna ao menu
				break;
			case 2:// remover
				if(!listaSorvete.isEmpty()) {
					lista();
					System.out.print("\nEscolha um Sorvete para remover.\nInformando o Código: ");
					for (Sorvete svt : listaSorvete) {
						cod = scan.nextInt();
						if (svt.getCod() == cod) {
							listaSorvete.remove(svt);
							System.out.println("*****Removido*****\n");
							break;
						}else{
							System.out.println("-----Não existe-----\n");
						}
					}
				}else {
					System.out.println("\nLista vazia!!!\n");
				}
				op = 1;// ao sair do case retorna ao menu
				break;
			case 3:// listar
				if(!listaSorvete.isEmpty()) {
					lista();
					System.out.println("\n");
				}else {
					System.out.println("\nLista vazia!!!\n");
				}
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


	public static void lista() {
		System.out.println("\n");
		System.out.println("Lista de Sorvetes");
		for (Sorvete svt : listaSorvete) {
			System.out.println(svt.toString());
		}
	}

}