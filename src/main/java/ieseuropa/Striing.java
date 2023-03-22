package main.java.ieseuropa;

public class Striing {
	
	
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
