package main.java.ieseuropa;

import java.util.Scanner;

public class Decimales {
	private static float redondarAlza(float num) {
		return (float) Math.round(num);
	}
	private static int quitarDecimales(float num) {
		return (int) num;
	}

	public static void main(String[] args) {
		float num = 3.956f;
		System.out.println(redondarAlza(num));
		System.out.println(quitarDecimales(num));
	}

}
