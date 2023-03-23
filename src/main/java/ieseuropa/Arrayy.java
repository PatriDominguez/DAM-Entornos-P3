package main.java.ieseuropa;

import java.util.Arrays;

public class Arrayy {
	private static void menorMayor(Integer[] numerosArray) {
		Arrays.sort(numerosArray); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numerosArray = { 5, 7, 3, 20, 12, 22 };
		menorMayor(numerosArray);
		System.out.println(Arrays.toString(numerosArray));
	}

}
