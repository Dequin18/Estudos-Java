import java.util.Scanner;

public class Construtores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int ano = 0;
		int mes = 0;
		int dia = 0;
		
		System.out.println("Digite o dia");  
		dia = ler.nextInt();
		System.out.println("Digite o mes");
		mes = ler.nextInt();
		System.out.println("Digite o ano");  
		ano = ler.nextInt();
		data Date = new data(dia, mes, ano);
		Date.exibir();
		
	}

}

class data{
	private int dia;
	private int mes;
	private int ano;
	public data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	public void exibir() {
		System.out.println(dia + "/" + mes + "/" + ano);
		
	}
	
	
	
}
