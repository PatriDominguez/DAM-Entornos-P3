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

	

	public static void main(java.lang.String[] args) {


		// TODO Auto-generated method stub

	}

}
