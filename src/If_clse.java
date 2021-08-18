import java.util.Scanner;
public class If_clse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		
		
		if ( n%2 != 0) {
			
			System.out.println(" Weird");
		}
			
			else if ( n>=2 && n<=5) {
				System.out.println(" Not Weird \n");
			}
					
			else if ( n>=6 && n<=20) {
				System.out.println(" Weird \n");
			}	
		
		System.out.println("Not weird");
		
	}

}
