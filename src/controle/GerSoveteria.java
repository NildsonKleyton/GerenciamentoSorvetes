package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidade.Sorvete;

public class GerSoveteria {

	//cria uma variável global
	static List<Sorvete> listaSorvete = new ArrayList<Sorvete>();
	static Scanner scan = new Scanner(System.in);
	static boolean res=true;
	static Sorvete sv = new Sorvete();
	public static void main(String[] args) {
		String op ;
		int cod=-1 ;
		String sabor = null , tipo = null;
		double valor, qtd;
		do {
			op = menu();
						
			switch (op) {
			case "1"://inserir
				//recebe valores nos atributos
				//sabor
				System.out.print("Sabor do Sorvete: ");
				sabor = scan.nextLine();
				//tipo
				System.out.print("\nTipo do Sorvete:\n1 - Fruta\n2 - Essência\nOpção: ");
				op = scan.nextLine();
				if(op == "1") {
					tipo ="Fruta";
				}
				if(op=="2") {
					tipo="Essência";
				}
				//quantidade
				System.out.println("\nQuantos Litros: ");
				qtd = scan.nextDouble();
				//valor
				System.out.print("\nValor do Sorvete\nEx: 1,20 ou 1:\nR$");
				valor = scan.nextDouble();
				cod++;
				
				//cria e obj sorvete 

				sv.setCod(cod);
				sv.setSabor(sabor);
				sv.setTipo(tipo);
				sv.setQuantidade(qtd);
				sv.setValor(valor);
				
				//add na lista
				listaSorvete.add(sv);
				
				op="1";//ao sair do case retorna ao menu
				break;
			case "2"://remover 
				lista();
				System.out.print("Escolha um Sorvete para remover.\nInformando o ID: ");
				cod = scan.nextInt();
				listaSorvete.remove(cod);
				
				op="1";//ao sair do case retorna ao menu
				break;			
			case "3"://listar
				lista();
				op="1";//ao sair do case retorna ao menu
				break;
			case "0":
				System.out.println("Sistema Finalizado.");
				op="0";//ao sair do case retorna ao menu
				break;
			default:
				System.out.println("\n******Opção invalida.******\n\n");
				op="1";//ao sair do case retorna ao menu
				break;
			}
	
		} while (op=="1");
	}
	/**
	 * @author Nildson Kleyton (MucuZulo)
	 * @return 
	 * Menu onde retorna a opção escolhida.
	 * <br>1 - Inserir sorvete
	 * <br>2 - Remover sorvete
	 * <br>3 - Listar todos os sorvetes
	 * <br>0 - Sair
	 */
	public static String menu() {
		String op ;
		do {
			System.out.println("==============================");
			System.out.println("        Funcionalidades\n");
			System.out.println("1 - Inserir sorvete");
			System.out.println("2 - Remover sorvete");
			System.out.println("3 - Listar todos os sorvetes");
			System.out.println("0 - Sair");
			System.out.println("==============================");
			System.out.print("Escolha um Opção: ");
			op = scan.nextLine();
			if (op=="1" ||op=="2" ||op=="3" ||op=="0" ) {
				res=true;
			}else {
				res=false;
			}
		} while(res);
			
		return op;
	}
	
	/**
	 * @author Nildson Kleyton(McuZulo)
	 * @return Retorna uma lista se não estiver vazia.
	 */
	public static void lista() {
		System.out.println("\n");
		System.out.println("Lista de Sorvetes");
		for (Sorvete svt : listaSorvete) {
			System.out.println(svt.toString());
		}
	}

}