import java.util.Scanner;
public class Patron2 {
	public  void patron2() {
		int i,j;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cantidad de repeticiones del patrón");
		n= sc.nextInt();
		if(n==1) {
			System.out.printf("*");
		}
		else {
			for(i=0;i<n;i++) { 			//inicio
			    System.out.printf("*");
			}
			System.out.printf("\n");
				                       // parte media
			for(j=0;j<n-2;j++) {
				for(i=j;i<n-2;i++) {
					System.out.printf(" "); 																							
				}
				System.out.println("*");																					
			}														
			for(i=0;i<n;i++) { 			//fin
				System.out.printf("*");
			}
			System.out.printf("\n");			
		}
	sc.close();	
	}
}
