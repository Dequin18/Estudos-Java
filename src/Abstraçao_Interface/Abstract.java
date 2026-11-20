package Abstraçao_Interface;

public class Abstract {

	public static void main(String[] args) {
  Garrafas garrafa = new Garrafas("Squesh", "Azul");
  garrafa.setPreco(50);
  garrafa.mostrarDados();
  garrafa.entregar();
  garrafa.receber();

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

interface Frete{
	public void entregar();
	public void receber();
}


class Garrafas extends produto implements Frete{

	public Garrafas(String nome, String cor) {
		super(nome, cor);
	}

	@Override
	public void mostrarDados() {
		System.out.println(getNome());
		System.out.println(getCor());
		System.out.println(getPreco());
	}

	@Override
	public void entregar() {
		System.out.println("Seu pedido foi entregue");
		
	}

	@Override
	public void receber() {
		System.out.println("Forma de pagamento");
		
	}
}
