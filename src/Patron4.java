import java.util.Scanner;
public class Patron4 {
	public  void patron4() {
		int i,j=0;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cantidad de repeticiones del patrón");
		n= sc.nextInt();
		if(n==1) {
			System.out.printf("*");
		}
		else if(n>1) {						
					for(j=0;j<n-1;j++) {
						System.out.printf("*"); 
					}				
					System.out.println(""); 			
			    	for(j=0;j<n-2;j++) {
			    		System.out.printf(" ");
			    		for(i=0;i<n-2;i++) {
			    			System.out.printf("*"); 			    						    					    								
						}	
			    		System.out.println("");																											
					}
			    	System.out.printf(" "); 
			    	for(j=0;j<n-1;j++) {
						System.out.printf("*"); 
					}		    																
				}	
		sc.close();
	}	
}


