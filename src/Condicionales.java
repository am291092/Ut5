import java.util.Scanner;

public class Condicionales {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Escribe un nuemro");
		int num=sc.nextInt();
		esPar(num);
		esPositivo(num);

	}

	private static void esPositivo(int num) {
		if(num<0) {
			
		System.out.println("Es negativo");
		}else if(num==0) {
			System.out.println("Es 0");
		}else {
			System.out.println("Es positivo");
		}
		
	}

	private static void esPar(int num) {
		if(num%2==0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		
	}

}
