package main.java.ieseuropa;

public class CadenaDeTexto {

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
		String s2 = CadenaDeTexto.mayus(s1);
		System.out.println(s2);

		String s3 = "ESTOY GRITANDO";
		String s4 = CadenaDeTexto.minus(s3);
		System.out.println(s4);

		String s5 = "¡Hola!";
		int size = CadenaDeTexto.longitud(s5);
		System.out.println(size);

		String s6 = "abracadabra";
		String s7 = CadenaDeTexto.ocurrenciaLetras(s6);
		System.out.println(s7);

	}

}
