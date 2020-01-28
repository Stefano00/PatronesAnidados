import java.util.Scanner;
public class Patrones {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Patron1 patron1 = new Patron1();  // llama a clase Patron1
		Patron2 patron2 = new Patron2();  // llama a clase Patron2
		Patron3 patron3 = new Patron3();  // llama a clase Patron3
		Patron4 patron4 = new Patron4();  // llama a clase Patron4
		System.out.println("Ingrese patrón a mostrar (1, 2, 3 o 4)");
		n=sc.nextInt();
		if(n==1) {
			patron1.patron1();   // se utiliza método patron1 de clase patron1		
		}
		else if(n==2) {
			patron2.patron2();   // se utiliza método patron1 de clase patron2		
		}
		else if(n==3) {
			patron3.patron3();   // se utiliza método patron1 de clase patron3			
		}
		else if(n==4) {
			patron4.patron4();   // se utiliza método patron1 de clase patron4		
		}
		else if (n!=1 || n!=2 || n!=3 || n!=4) {
			System.out.println("Tiene que ingresar valores entre 1 y 4");
		}	
		sc.close();
	}		
}
