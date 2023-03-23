package main.java.ieseuropa;

public class Numero {
	
	private static boolean esPrimo(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
	return true;
	}

	
	public static void convertirAHoras(int segundos) {
		int horas = segundos / 3600;
		int minutos = (segundos % 3600) / 60;
		int segundosRestantes = segundos % 60;
		System.out.println(segundos + "segundos son " + horas + " horas, " + minutos + " min, y " + segundosRestantes
				+ " segundos");

	}

	public static int factorial(int n) {
		int resultado = 1;
		for (int i = 1; i <= n; i++) {
			resultado *= i;
		}
		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		
		convertirAHoras(698547);
		System.out.println(factorial(8));
		esPrimo(7);
	}

}
