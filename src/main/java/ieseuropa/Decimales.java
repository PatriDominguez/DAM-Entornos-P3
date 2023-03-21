package main.java.ieseuropa;

public class Decimales {
	private static float redondarAlza(float num) {
		return (float) Math.round(num);
	}
	private static int quitarDecimales(float num) {
		return (int) num;
	}
	private static float[] equacion(float a, float b, float c) {
		float discriminante = b*b-4*a*c;
		float[] soluciones;
		if(discriminante > 0) {
			soluciones = new float[2];
			soluciones[0] = (float) ((-b + Math.sqrt(discriminante))/(2*a));
			soluciones[1] = (float) ((-b - Math.sqrt(discriminante))/(2*a));
		} else if(discriminante == 0) {
			soluciones = new float[1];
			soluciones[0] = -b / (2*a);
		} else {
			soluciones = new float[2];
			soluciones[0] = (-b) / (2*a);
			soluciones[1] = (float) (Math.sqrt(-discriminante) / (2*a));
		}
		return soluciones;
	}

	public static void main(String[] args) {
		float num1 = 12.5f;
		System.out.println(redondarAlza(num1));
		float num2 = 3.956f;
		System.out.println(quitarDecimales(num2));
		float a = 2, b = 10, c = -8;
		float[] soluciones = equacion(a, b, c);
		for (int i = 0; i < soluciones.length; i++) {
			System.out.println(soluciones[i]);
		}
	}

}
