import java.util.Scanner;

public class TratamietCadenas {
	
	Scanner sc= new Scanner(System.in);
	
	public String concatenarStrings() {
		String resultado="";
		
		System.out.println("Cual es el 1 String");
		String cadena1=sc.next();
		
		
		System.out.println("Cual es el 2 String");
		String cadena2=sc.next();
		
		
		resultado=cadena1+cadena2;
		
		
		return resultado;
		
	}
	

}
