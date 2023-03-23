package main.java.ieseuropa;

import java.util.Arrays;

public class Arrayy {
	private static void menorMayor(int[] numeros) {
		Arrays.sort(numeros); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = { 1, 8, 8, 14, 32 };
		menorMayor(numeros);
		System.out.println(Arrays.toString(numeros));
	}

}
