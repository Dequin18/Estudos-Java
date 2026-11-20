package Listas_e_conjuntos;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;



public class Listas_e_conjuntos {
	private int t = 0;

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();

		numeros.add(10);
		numeros.add(20);
		numeros.add(10);
		numeros.add(30);
		numeros.add(40);
		numeros.add(20);
		numeros.add(50);
		numeros.add(60);
		
		Set<Integer> uni = new TreeSet<>();
		uni.addAll(numeros);
		
		System.out.println("Lista original: " + numeros + " Quantidade de elementos: " + numeros.size());
		System.out.println("Lista original: " + uni + " Quantidade de elementos: " + uni.size());
		

	for(Integer a : uni) {
		System.out.println(a);
	} 
	Iterator<Integer> n = uni.iterator();
	while(n.hasNext()) {
		Integer num = n.next();
		if(num < 30) {
			n.remove();
		}
		System.out.println("Os numeros acima de 30: " + uni );
		
		System.out.println("Conjunto final " + uni);
		System.out.println("Quantiade de elementos: " + uni.size());
		
	}

		
	}
}
	
		
		
		
	


