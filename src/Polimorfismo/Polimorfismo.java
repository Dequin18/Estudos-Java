package Polimorfismo;


class Filme {
	private String nome;
	private int nota;
	private String sinopse;
	
	public Filme(String nome, int nota, String sinopse) {
		this.nome = nome;
		this.nota = nota;
		this.sinopse = sinopse;
	}
	public String getNome() {
		return this.nome;
	}
	public String getSinopse() {
		return this.sinopse;
	}
	public int getNota() {
		return this.nota;
	}
	
	
	void mostrar() {
		System.out.println(nome);
		System.out.println(nota);
		System.out.println(sinopse);
	}
}

class Seriado extends Filme {
private String Seriado;
	
	public Seriado(String nome, int nota, String sinopse, String Seriado) {
		super(nome, nota, sinopse);
		this.Seriado = Seriado;
	}
	public String getSeriado() {
		return this.Seriado;
	}
	
}





public class Polimorfismo {

	public static void main(String[] args) {
	Filme F1 = new Seriado("Guerra infinita", 5, "Guerra entre vingadores e thanos", "é um seriado");
	
   F1.mostrar();
   

	}

}