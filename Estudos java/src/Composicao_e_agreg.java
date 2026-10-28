import java.util.Scanner;
// Na agregaçao a classe parte é totalmente independente da classe todo
// Enquanto na classe composicao elas sao dependentes

class Atleta{
	private String name;
	private int idade;
	private  int codigo;
	public void SetName(String name) {
		this.name = name;
	}
	public void SetAge(int idade) {
		this.idade = idade;
	}
	public void SetCod(int cod) {
		this.codigo = cod;
	}
	public String getName() {
		return this.name;
	}
	public int getCod() {
		return this.codigo;
	}
	public int getIdade() {
		return this.idade;
	}
	
	public void inserirdados() {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome do Atleta");
		name = ler.nextLine();
		System.out.println("Digite a idade do atleta");
		idade = ler.nextInt();
		System.out.println("Digite o codigo do Atleta");
		codigo = ler.nextInt();
	}
	
} // Classe Atleta


class time{
	private int codigoTime; 
	private String nomeTime; 
	private Atleta atleta; 
	public int getCodigoTime() { 
		return codigoTime; 
		} 
	public void setCodigoTime(int codigoTime) { 
		this.codigoTime = codigoTime; 
		} 
	public String getNomeTime() {
			return nomeTime; 
			} 
	public void setNomeTime(String nomeTime) { 
		this.nomeTime = nomeTime; 
		} 
	public Atleta getAtleta() {
		return atleta; 
		} 
	
	public void setAtleta(Atleta atleta) { 
		this.atleta = atleta; 
		}
} // Classe time


class TesteProduto{
	private String desc;
	private TesteDataFabric Data;
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String setDesc() {
		return this.desc;
	}
	
	public void prod() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a descri");
		desc = ler.nextLine();
	}
	
	public void setData(TesteDataFabric d) {
		this.Data = d;
	}
	public TesteDataFabric getData() {
		return this.Data;
	}
	
	public void det() {
		System.out.println(desc);
		getData().da();
	}
	
	
	
}

class TesteDataFabric {
	private int dia;
	private int mes;
	private int ano;
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return this.ano;
	}
	public int getmes() {
		return this.mes;
	}
	public int getDia() {
		return this.dia;
	}
	
	public void data() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o ano");
		ano = ler.nextInt();
		System.out.println("Digite o mes");
		mes = ler.nextInt();
		System.out.println("Digite o dia");
		dia = ler.nextInt();
	}
	
	public void da() {
		System.out.println(dia + "/" + mes + "/" + ano);
		
	}
	
	
	
	
}


public class Composicao_e_agreg {
	public static void main(String[] args) {
		Atleta atleta1 = new Atleta(); 
		atleta1.inserirdados(); 
		time time = new time(); 
		time.setCodigoTime(55);
		TesteDataFabric date = new TesteDataFabric();
		date.data();
		date.da();
		TesteProduto prod1 = new TesteProduto();
		prod1.prod();
		prod1.setData(date);
		prod1.det();
time.setNomeTime("Time X"); 
time.setAtleta(atleta1); 
System.out.println("O time é " + time.getNomeTime()); 
System.out.println("O nome do atleta é: " + time.getAtleta().getName()); 
System.out.println("Repito, o nome do atleta é: " + atleta1.getName() + time.getAtleta().getCod());
	}
}




