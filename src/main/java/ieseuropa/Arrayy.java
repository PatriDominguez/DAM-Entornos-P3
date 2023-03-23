package main.java.ieseuropa;

public class Arrayy {
	private static void menorMayor(Integer[] numerosArray) {
		Arrays.sort(numerosArray);
	}

	public static void media(Integer[] numeros) {

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
		Integer[] numeros = { 5, 7, 3, 20, 12, 22 };
		System.out.println("Ordenados de menor a mayor: ");
		menorMayor(numeros);
		System.out.println(Arrays.toString(numeros));
		media(numeros);
	}

}
