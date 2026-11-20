import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;



class Produto { 
	private String nome;
	private int codigo; 
	private double preco; 
	private String descricao; 
	private char frete; 
	
	public void produto(String nome, int codigo, double preco, String descricao, char frete) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
		this.frete = frete;
		
	}
	public String getNome() {
		return this.nome;
	}
	public int getCodigo() { 
		return codigo; 
		}
	public double getPreco() { 
		return preco; 
		} 
	public String getDescricao() { 
		return descricao; 
		} 
	public double getFrete() { 
		return frete; 
		} 
	
	public void Inserir() {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a regiao");
		frete = ler.next().charAt(0);
	
		descricao = ler.nextLine();
	//	System.out.println("Digite o km");
		//frete = ler.nextInt();
		
	}
	
	public void exibir() {
		System.out.println("O valor do frete é de: " + frete);
		calcularFrete((char) frete);

		System.out.println("Descriçao do produto: " + descricao);
	}
	
	//public double calcularFrete2() { 
		
		//return this.frete = frete * 1.5; 
		//} 
	
	public void calcularFrete(char regiao) { 
		switch (regiao) { 
		case 'I': System.out.println("Região para Entrega: Interior"); 
		this.frete = 100; 
		break; 
		
		case 'M': 
		System.out.println("Região para Entrega: Metropolitana");
		this.frete = 0; 
		break; 
		
		case 'L': System.out.println("Região para Entrega: Litoral"); 
		this.frete = 20; 
		break;
		
		default: System.out.println("Por favor informe: (I) nterior,(M)etropolitana ou (L)itoral");
		break; }
		}
	}


class livro extends Produto {
	private int preco;
	private String nome;
	
	

	

	public livro(int preco, String nome) {
		this.preco = preco;
		this.nome = nome;
	}
	@Override
	public String getNome() {
		return this.nome;
	}
	public int preco() {
		return this.preco;
	}
	
}

class carinho{
	
	List<Produto> listaprod = new ArrayList();
	
	public void adi(Produto prod) {
		listaprod.add(prod);
	
		
	}
	
	
	public void ExibirCAr() {
		
		for(Produto a : listaprod) {
		System.out.println(a.getNome());
		
		}
	}

	
	
	
}

public class Polimorfismo {
	
	public static void main(String[] args) {
		Produto livro = new livro(50, "CUlpa das estrelas");
		Produto livro2 = new livro(30, "Odyssey");
		carinho MeuCarrinho = new carinho();
		livro2.Inserir();
	
		
	livro2.exibir();
	 MeuCarrinho.adi(livro);
	 MeuCarrinho.adi(livro2);
	 MeuCarrinho.ExibirCAr();
	
		
	}
	
}

// ------------- Q,2-----------






