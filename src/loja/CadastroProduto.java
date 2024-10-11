package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroProduto {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Produto> produtos = new ArrayList<>();
		
		while (true) {
		System.out.println("Digite 1 para adicionar produtos | Digite 2 para exibir os dados dos produtos | Digite 0 pra finalizar o programa.");
		int op = scanner.nextInt();
		
		 if (op == 0) {
			 System.out.println("Sistema finalizado!");
			 break;
		 }
		 
		switch(op) {
		case 1:
			
			System.out.println("Digite a quantidade de produtos deseja cadastrar:");
			int quantia = scanner.nextInt();
			
			for (int i = 1; i <= quantia; i++) {
				Produto produto = new Produto();
			System.out.println("Digite o nome do produto:");
			String nome = scanner.next();
			produto.setNome(nome);
			System.out.println("Digite o preço do produto:");
			double preco = scanner.nextDouble();
			produto.setPreco(preco);
			System.out.println("Digite a quantidade dos produtos que ira colocar em seu estoque:");
			int quantidade = scanner.nextInt();
			System.out.println();
			produto.setQuantidade(quantidade);
			
			produtos.add(produto);
			}
			
			break;	

		
		case 2:
			if (produtos.isEmpty()) {
				System.out.println("Nenhum produto cadastrado :( ");
			}
			else {
				System.out.println();
				System.out.println("Produtos cadastrados:");
				for (Produto p : produtos) {
					System.out.println(p);
				}
				System.out.println();
			}
			break;
			
			default: 
				System.out.println("Opção invalida!");
				break;
				
		}
	  }
   }
}