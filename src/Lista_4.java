import java.util.Scanner;
public class Lista_4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
// -------------- Q.1 -----------------

		int kwh;
double R$;

	System.out.println("Digite quantos kWh");
 kwh = ler.nextInt();
 if (kwh > 100) {
	 double result = kwh * 0.8;
	 System.out.println("O consumo foi alto: R$" + result);
 } else {
	 double result = kwh * 0.6;
	 System.out.println("O consumo foi baixo: R$" + result); 
 }
	
//-------------- Q.2 -----------------
 float Celsius;
 float Fahrenheit;
 
 System.out.println("Digite quantos graus esta");
 Celsius = ler.nextFloat();

 Fahrenheit = (Celsius*9/5)+32;
 
 if (Fahrenheit < 18) {
	 System.out.println("Esta frio");
 } else if (Fahrenheit > 18 && Fahrenheit < 30) { 
	 System.out.println("Esta agradavel");
 } else {
	 System.out.println("Esta quente");
 }
 
	//-------------- Q.3 -----------------	
double dia1;
double km1;
double valor;
System.out.println("Digite quantos dias você alocou o carro");
dia1 = ler.nextInt();
dia1 = dia1 * 90;
System.out.println("Você rodou quantos km com o carro?");
km1 = ler.nextInt();
km1 = km1 * 0.25;

valor = dia1 + km1;
if(valor > 1000) {
	System.out.println("Voce recebeu um desconto de 10%, valor final: R$" + valor );
	valor = valor * 0.90;
} else {
	System.out.println("Voce nao recebeu o desconto de 10%, valor ficou: R$" + valor);
}

		
//-------------- Q.4 -----------------
int mes;
System.out.println("Digite o mes");
mes = ler.nextInt();

switch (mes) {
case 1: 
	System.out.println("Janeiro");
	System.out.println("Trimestre 1");
	break;
case 2: 
	System.out.println("Fevereiro");
	System.out.println("Trimestre 1");
	break;
case 3: 
	System.out.println("Março");
	System.out.println("Trimestre 1");
	break;
case 4: 
	System.out.println("Abril");
	System.out.println("Trimestre 2");
	break;
case 5: 
	System.out.println("Maio");
	System.out.println("Trimestre 2");
	break;
case 6: 
	System.out.println("Junho");
	System.out.println("Trimestre 2");
	break;
case 7: 
	System.out.println("Julho");
	System.out.println("Trimestre 3");
	break;
case 8: 
	System.out.println("Agosto");
	System.out.println("Trimestre 3");
	break;
case 9: 
	System.out.println("Setembro");
	System.out.println("Trimestre 3");
	break;
case 10: 
	System.out.println("Outubro");
	System.out.println("Trimestre 4");
	break;
case 11: 
	System.out.println("Novembro");
	System.out.println("Trimestre 4");
	break;
case 12: 
	System.out.println("Dezembro");
	System.out.println("Trimestre 4");
	break;
}

//-------------- Q.5 -----------------
double salario;
double salarioantigo;

System.out.println("Digite o seu salario");
salarioantigo = ler.nextDouble();

if (salarioantigo < 2000) {
	salario = salarioantigo * 1.12;
} else {
	
	salario = salarioantigo * 1.07;
	
	
}
double aumento = salario - salarioantigo;
System.out.println("O salario atual é: R$" + salario);
System.out.println("O salario antigo é: R$" + salarioantigo);
System.out.println("O aumento foi de: R$" + aumento);
 

//-------------- Q.6 -----------------
int ladoa;
int ladob;
int ladoc;
System.out.println("Digite o lado A do triangulo");
ladoa = ler.nextInt();
System.out.println("Digite o lado B do triangulo");
ladob = ler.nextInt();
System.out.println("Digite o lado C do triangulo");
ladoc = ler.nextInt();

boolean equilatero = ladoa == ladob && ladob == ladoc;
boolean isosceles = ladoa == ladob || ladob == ladoc || ladoc == ladob;
boolean escaleno = ladoc != ladob && ladob != ladoa && ladoc != ladoa;

if (ladoa + ladob > ladoc && ladoa + ladoc > ladob && ladob + ladoc > ladoa ) {
			System.out.println("É possivel formar um triangulo");
		if (equilatero) {
			System.out.println("É um triangulo equilatero");
			
		} else if (escaleno) {
			System.out.println("É um triangulo escaleno");
		} else if (isosceles) {
			System.out.println("É um triangulo isosceles");
		}
} else {
	System.out.println("Nao sao medidas validas");
}

// -------------- Q.7 -----------------
 int idade =0;
 int aux = 0;
 int media;
 int contmaior =0;
 int maiorid = 0;
 
 for (int i1 = 0; i1 < 15; i1++) {
System.out.println("Digite sua idade a " + i1 + " idade" );
idade = ler.nextInt();
aux = idade + aux;

if (idade > 18) {
	contmaior++;
}
if (maiorid < idade) {
	maiorid = idade;
}
 }
 media = aux / 15;
System.out.println("A media das idades é: " + media);
System.out.println("A maior idade é: " + maiorid);
System.out.println("Pessoas com mais de 18: " + contmaior);

	
// -------------- Q.8 -----------------
int numeros = 0;
int soma = 0;
int cont2 = 0;

while (numeros > -1) {
	cont2++;
	System.out.println("Digite um numero: ");
	numeros = ler.nextInt();
	soma = numeros + soma;
	
}
int media4 = soma/ cont2;		

System.out.println("O resultado da soma é: " + soma);
System.out.println("A media da soma é: " + media4);

		
//-------------- Q.9 -----------------
int senha = 0; 
int contador =0;
do {
	contador++;
	System.out.println("Digite a senha");
	senha = ler.nextInt();
}while (!(senha == 1234));
		System.out.println("Senha correta, foram feitas: " + contador + " Tentivas");
		
	
//-------------- Q.10 -----------------
double altura = 0;
double todas = 0;
double maior = 0;
double menor = 5;
double media = 0;
for (int i = 0; i < 10; i++) {
	System.out.println("Digite a altura da pessoa " + i  );
	altura = ler.nextDouble();
	todas = todas + altura;
	
	
	if(maior < altura) {
		maior = altura; 
}
	if(menor > altura) {
		menor = altura;
	}
	
}
double media5 = todas / 10;
	System.out.println("A maior altura é: " + maior);
	System.out.println("A menor altura é: " + menor);
	System.out.println("A media das alturas é: " + media5);

	
//-------------- Q.11 -----------------
	double alt, peso = 0;
	int cont1 = 0;
	for(int i = 0; i < 8; i++) {
		System.out.println("Digite o altura e peso");
alt = ler.nextDouble();
peso = ler.nextDouble();
double imc = peso / (alt * alt);
System.out.println("O IMC é " + imc);
		if(imc > 25) {
			cont1++;
		}
	}
	System.out.println("IMC acima de 25: " + cont1);
	ler.close();	
	
	
//-------------- Q.12 -----------------
		int forma;
		double compra = 0;
		double desconto = 0;
		System.out.println("Digite o valor da compra");
		compra = ler.nextDouble();
		System.out.println("Digite sua forma de pagamente: 1- credito, 2-Pix e 3-Cartao");
		forma = ler.nextInt();
		switch (forma) {
		case 1:
		desconto = compra * 0.92;
			System.out.println("Você recebeu um desconto de: R$ " + desconto);
		break;
		case 2:
			desconto = compra * 0.92;
			System.out.println("Você recebeu um desconto de: R$ " + desconto);
		break;
		
		case 3:
			
			System.out.println("Você não recebeu um desconto, valor total: R$ " + desconto);
		break;
		}

//-------------- Q.13 -----------------
		int numb = 1;
		int contpar = 0;
		int contimp = 0;
		int somadores = 0;
		for(int i = 0; i < 20; i++) {
			
			System.out.println(numb++);
			somadores = somadores + numb;
		 if(numb % 2 == 0) {
			 contpar++;
		 }
		 if (numb % 2 == 1) {
			 contimp++;
		 }
			
		}
		System.out.println("A soma dos numeros é: " + somadores);
		System.out.println("Numeros impares: " + contimp);
		System.out.println("Numeros pares: " + contpar);
		
		
//-------------- Q.14 ----------------
int Litros = 0;
char combustivel; 
System.out.println("Qual combustivel você deseja? G-Gasolina ou A-Alcool");
combustivel = ler.next().charAt(0);
System.out.println("Quantos litros? ");
Litros = ler.nextInt();

double valor = 0;

switch (combustivel) {
case 'A':
valor = Litros * 4.29;
System.out.println("O valor pago de alcool foi de: " + valor);
	
break;
case 'G':
	valor = Litros * 4.29;
	System.out.println("O valor pago de Gasolina foi de: " + valor);
break;

}


//-------------- Q.15 ----------------
int inteiro= 0;
double resultado;

System.out.println("Digite um numero inteiro de 1 a 10");
inteiro = ler.nextInt();

if(inteiro > 0 && inteiro <= 10)
for (int i = 1; i <= 10; i++) {
	resultado = inteiro * i;
	
	System.out.println("Tabuada do " + inteiro + ": " + resultado);
} else {
	System.out.println("Digite um inteiro valido");
}

//-------------- Q.16 ----------------
double preco = 0;
int quantidade = 0;
double valorT = 0;
double valorMedio = 0;

for (int i = 1; i < 13; i++) {
	System.out.println("Digite o preço do produto ");
	preco = ler.nextDouble();
	System.out.println("Digite quantas unidades do produto você comprou");
	quantidade = ler.nextInt();
	
	preco = preco * quantidade;
	valorT = valorT + preco;	
}
valorMedio = preco / 12;

System.out.println("O faturamento foi de: R$" + valorT);
System.out.println("O valor medio por compra é: R$" + valorMedio);

	
//-------------- Q.17 ----------------
float notas = 0f;
int cont = 0;
int contN = 0;
float soma = 0;
do {	
	cont++;	
	System.out.println("Digite a nota do aluno" + cont);
	notas = ler.nextFloat();
	
soma = notas + soma;	
	
	if (notas > 7) {
		contN++;
	} 
	
	
}
while (notas > 0);
	
float Media = (float) soma / cont;

System.out.println("A media da turma foi de: " + Media);
System.out.println("Notas acima de 7: " + contN);

//-------------- Q.18 ----------------
float fixo = 8f;
float fracao = 3f;
int horas = 0;
float total = 0;

System.out.println("Quantas horas você ficou no estacionamento: ");
horas = ler.nextInt();
total = fixo + (fracao * horas);

if(horas > 5) {
	System.out.println("Você ficou mais de 5h no estacionamentos");
	System.out.println("Você pagou: R$" + total);
} else {
	System.out.println("Você pagou: R$" + total);
}
		
//-------------- Q.19 ----------------
int valorI =0;
int valorF =0;
int soma = 0;

System.out.println("Digite o valor inicial");
valorI = ler.nextInt();
System.out.println("Digite o valor final");
valorF = ler.nextInt();


while (valorI < valorF) {
	valorI++;
if(valorI % 2 ==0 ) {
	System.out.println(valorI);
	soma = soma + valorI;
}
	
}
System.out.println("A soma é de: " + soma);

//-------------- Q.20 ----------------
int producao = 0;
int soma = 0;
int cont6 = 0;
for (int i = 1; i <= 7; i++) {
System.out.println("Digite a producao do dia: " + i);
producao = ler.nextInt();
soma = producao + soma;
if(producao < 100) {
	cont6++;
}
}
float media = soma / 7;
System.out.println("A producao semanal foi de: " + soma);	
System.out.println("A media diaria foi de : " + media);	
System.out.println("Dias q ficaram abaixo de 100: " + cont6);
		
	} // fim do main void

}// fim da class
