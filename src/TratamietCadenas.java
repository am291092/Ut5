import java.util.Scanner;

public class TratamietCadenas {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String cadena = concatenarStrings();
		System.out.println();
		System.out.println(contar(cadena));

	}

	private static int contar(String cadena) {
		int cuenta = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.toUpperCase().substring(i, i + 1).equals("A")) {

				cuenta++;
			}

		}

		return cuenta;
	}

	public static String concatenarStrings() {

		String resultado = "";

		System.out.println("Cual es el 1 String");
		String cadena1 = sc.next();

		System.out.println("Cual es el 2 String");
		String cadena2 = sc.next();

		resultado = cadena1 + cadena2;

		return resultado;

	}

}
