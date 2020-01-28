import java.util.Scanner;
public class Patron3 {
	public  void patron3() {
		int i,j=0;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cantidad de repeticiones del patrón");
		n= sc.nextInt();
		if(n==1) {
			System.out.printf("x");
		}
		else if(n>1) {		    		   		    	
			for(j=0;j<n;j++) {				
				for(i=0;i<n;i++) {
					if(i==j) {
						System.out.printf("x"); 
			    	}
			    	else if (i==n-1-j) {
			    		System.out.printf("x");		    				
			    	}
			    	else if(i!=j || i!=n-j){
			    		System.out.printf(" ");
			    	}			    					    								
				}	
			    System.out.println("");																									
			}		
		}
		sc.close();							
	}		
}


