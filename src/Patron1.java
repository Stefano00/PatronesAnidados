import java.util.Scanner;

public class Patron1 {
	public  void patron1() {
		int i,j;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cantidad de repeticiones del patrón");
		n= sc.nextInt();
		if(n==1) {
			System.out.printf("*");
		}
		else {
			    for(i=0;i<n;i++) {         //inicio
			    	System.out.printf("*");
				}
				System.out.printf("\n");										
				for(j=0; j<n-2;j++) {         // parte media
					System.out.printf("*"); // primero de la fila
					for(i=0;i<n-2;i++) {
						System.out.printf(" ");
					}
					System.out.printf("*"); //último de la fila
					System.out.printf("\n");
				}
				for(i=0;i<n;i++) { 				//fin
					System.out.printf("*");
				}
				System.out.printf("\n");		
		}
		sc.close();
	}
}