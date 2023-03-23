package main.java.ieseuropa;

public class Arrayy {
	
	
	public static void media(int[] numeros) {

		int mayor = 0;
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
			suma += numeros[i];
		}
		System.out.println("La media es " + suma / numeros.length);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = { 1, 8, 8, 14, 32 };
		
		media(numeros);
	}

}
