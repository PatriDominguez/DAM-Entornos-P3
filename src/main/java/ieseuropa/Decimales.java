package main.java.ieseuropa;

public class Decimales {
	private static float redondarAlza(float num) {
		return (float) Math.round(num);
	}
	

	public static void main(String[] args) {
		float num1 = 12.5f;
		System.out.println(redondarAlza(num1));
		
	}

}
