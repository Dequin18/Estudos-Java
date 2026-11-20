
public class Estudos_Override {
private int idade;
private String name;
private int codigo;

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

public void esporte() {
	System.out.println("Sou corredor");
}


public static void main(String[] args) {
	
	Estudos_Override atlet = new Estudos_Override();
	Atletas futebolista = new Atletas();
	
	futebolista.SetName("Andre");
	futebolista.SetAge(15);
	futebolista.SetCod(50);
	futebolista.esporte();
	
	atlet.SetName("John");
	atlet.SetAge(15);
	atlet.SetCod(90);
	atlet.esporte();
	System.out.println(atlet.getCod());
}

}

class Atletas extends Estudos_Override {
	
	public void esporte() {
		System.out.println("Sou futebolista");
	}
	
}

