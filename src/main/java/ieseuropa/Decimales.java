package main.java.ieseuropa;

public class Decimales {
	private static int quitarDecimales(float num) {
		return (int) num;
	}

	public static void main(String[] args) {
		float num2 = 3.956f;
		System.out.println(quitarDecimales(num2));	
	}

}
