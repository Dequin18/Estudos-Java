import java.util.Scanner;


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
	
}


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
}

public class Composicao_e_agreg {
	public static void main(String[] args) {
		Atleta atleta1 = new Atleta(); 
		atleta1.inserirdados(); 
		time time = new time(); 
		time.setCodigoTime(55);
time.setNomeTime("Time X"); 
time.setAtleta(atleta1); 
System.out.println("O time é " + time.getNomeTime()); 
System.out.println("O nome do atleta é: " + time.getAtleta().getName()); 
System.out.println("Repito, o nome do atleta é: " + atleta1.getName() + time.getAtleta().getCod());
	}
}

