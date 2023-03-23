package main.java.ieseuropa;

public class Striing {

	public static String mayus(String string) {

		return string = string.toUpperCase();

	}

	public static String minus(String string) {

		return string = string.toLowerCase();

	}

	public static int longitud(String string) {

		int size = string.length();

		return size;

	}

	public static String ocurrenciaLetras(String string) {
		String resultado = "";
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			resultado += c;
			resultado += c;
		}
		return resultado;
	}

	public static void main(String[] args) {

		String s1 = "Hola Mundo!";
		String s2 = Striing.mayus(s1);
		System.out.println(s2);

		String s3 = "ESTOY GRITANDO";
		String s4 = Striing.minus(s3);
		System.out.println(s4);

		String s5 = "¡Hola!";
		int size = Striing.longitud(s5);
		System.out.println(size);

		String s6 = "abracadabra";
		String s7 = Striing.ocurrenciaLetras(s6);
		System.out.println(s7);

	}

}
