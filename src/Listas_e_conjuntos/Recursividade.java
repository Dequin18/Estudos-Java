package Listas_e_conjuntos;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Recursividade {
public static int fibo(int num) {
if(num == 1 || num == 0) {
	return 1;
} else {
	return num * (fibo(num - 1));
}
	
}
	public static void main(String[] args) {
int num = 5;
		System.out.println(fibo(num));
}
}










