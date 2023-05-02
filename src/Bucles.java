import java.util.Scanner;

public class Bucles {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Hasta que numero?");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			
			System.out.print(i+", ");
			
			
		}
		
		System.out.println("Pares:");
		for(int i=0;i<num;i++) {
	
	if(i%2==0) {
		System.out.println(i+", ");
	}
			
		

	}

}
}
