package Abstração;

public class AbstractTeste {

	public static void main(String[] args) {
  produto garrafa = new Garrafas("Squesh", "Azul");
  garrafa.setPreco(50);
  garrafa.mostrarDados();

	}

}

abstract class produto{
private String Nome;
private int Preco;
private String cor;

public produto(String nome, String cor) {
	this.Nome = nome;
	this.cor = cor;
	
}
	public void setPreco(int i) {
		this.Preco = i;
	}
	public int getPreco() {
		return this.Preco;
	}
	public String getNome() {
		return this.Nome;
	}
	public String getCor() {
		return this.cor;
	}

public abstract void mostrarDados();
}


class Garrafas extends produto{

	public Garrafas(String nome, String cor) {
		super(nome, cor);
	}

	@Override
	public void mostrarDados() {
		System.out.println(getNome());
		System.out.println(getCor());
		System.out.println(getPreco());
	}
}
