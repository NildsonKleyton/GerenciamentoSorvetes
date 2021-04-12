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
		double valor, qtd;

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
					// sabor
				boolean rest = false;
				System.out.print("\n***** Inserir *****");
				do {
					System.out.print("\nSabor do Sorvete: ");

					sabor = scantx.nextLine();
					for (Sorvete svl : listaSorvete) {
						if (svl.getSabor().equalsIgnoreCase(sabor)) {
							System.out.println("Sabor já exixte!");
							rest = true;
							break;
						}else {
							rest = false;
						}
					}
				} while (rest);
				// tipo
				do {
					System.out.print("\nTipo do Sorvete:\n1 - Fruta\n2 - Essência\nOpção: ");
					op = scan.nextInt();
					if (op == 1) {
						tipo = "Fruta";
						rest = false;
					} else if (op == 2) {
						tipo = "Essência";
						rest = false;
					} else {
						rest = true;
					}
				} while (rest);
				// quantidade
				System.out.print("\nLitros de Sorvete: ");
				qtd = scan.nextDouble();
				// valor
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
				if (!listaSorvete.isEmpty()) {
					lista();
					System.out.print("\nEscolha um Sorvete para remover."
							+"\nOu \"0\" para deletar a Lista!!!!"
							+ "+\nInformando o Código: ");
					cod = scan.nextInt();
//					if (cod==0) {
//						listaSorvete.removeAll(listaSorvete);
//					}else {
						//remover 1 ok
						int existe = -1;
						for (Sorvete svl : listaSorvete) {
							if (svl.getCod() == cod) {
								listaSorvete.remove(svl);
								int i =-1;
								existe = i++;
								break;
							}
						}
						if (existe > -1) {
							System.out.println("*****Removido*****\n");
						} else {
							System.out.println("-----Não existe-----\n");
						}
						//remover 2 ok 
//						int existe = -1;
//						for (int i=0; i< listaSorvete.size(); i++) {
//							Sorvete svl = listaSorvete.get(i);
//							if (svl.getCod() == cod) {
//								listaSorvete.remove(svl);
//								existe = i;
//								break;
//							}
//						}
//						if (existe > -1) {
//							System.out.println("*****Removido*****\n");
//						}else {
//							System.out.println("-----Não existe-----\n");
//						}
//					}
				} else {
					System.out.println("\nLista vazia!!!\n");
				}
				op = 1;// ao sair do case retorna ao menu
				break;
			case 3:// listar
				if (!listaSorvete.isEmpty()) {
					lista1();
					System.out.println("\n");
				} else {
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
		System.out.println("********Lista de Sorvetes********\n");
		for (Sorvete svl : listaSorvete) {
			System.out.println(svl.toString());
		}
		System.out.println("\n*******************************");

	}
	public static void lista1() {
		lista();
		double vTotal=0,qLitros=0;
		for (Sorvete svl : listaSorvete) {
			vTotal=vTotal+(svl.getValor()*svl.getQuantidade());
			qLitros=qLitros+svl.getQuantidade();
		}
		System.out.println("Total Litros em estoque: R$"+qLitros);
		System.out.println("\nValor total de estoque: R$"+vTotal);
		System.out.println("*******************************\n");
	}

}