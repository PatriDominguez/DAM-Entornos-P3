package main.java.ieseuropa;

public class Array {
	private static void menorMayor(int[] numeros) {
		for (int i = 0; i < numeros.length - 1; i++) {
		    for (int j = 0; j < numeros.length - i - 1; j++) {
		        if (numeros[j] > numeros[j + 1]) {
		            int temp = numeros[j];
		            numeros[j] = numeros[j + 1];
		            numeros[j + 1] = temp;
		        }
		    }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		int[] numeros ={2,10, 5, 27, 130, -1, 18, 93};
		menorMayor(numeros);
		for (int i = 0; i < numeros.length; i++) {
		    System.out.print(numeros[i] + " ");
		}
	}

}
