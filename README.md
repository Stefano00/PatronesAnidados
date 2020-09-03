# Nested patterns 🐧
## Homewrok nested patterns to curse FullStack Java

### The first challenge is make a box in the console with a input number 🐵
For example, if the input is 2, 3, 5 respectively, then in the console will display: 
```
**
**

***
* *
***

*****
*   *
*   *
*   *
*****
```
So, the code to do this is the next:
```public  void patron1() {
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
```

### The second challenge is make a Z in the console with a input number 🐵
For example, if the input is 2, 3, 5 respectively, then in the console will display: 
```
**
**

***
 *
***

*****
   *
  *
 *
*****
```
So, the code to do this is the next:
```
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
```
### The third challenge is make a X in the console with a input number 🐵
For example, if the input is 2, 3, 5 respectively, then in the console will display: 
```
xx
xx

x x
 x 
x x

x   x
 x x 
  x  
 x x 
x   x
```
So, the code to do this is the next:
```
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
```
### The fourth challenge is make a box with final lines in the console with a input number 🐵
For example, if the input is 2, 3, 5 respectively, then in the console will display: 
```
*
 *
 
**
 *
 **
 
****
 ***
 ***
 ***
 ****
```
So, the code to do this is the next:
```
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
```
