

import java.util.Scanner;
public class Selec_t {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	
	
	//int sum_ab = a + b ;
	//int sum_cd =  c + d;
	
	
	 if  (( b > c &&  d > a) && ((c + d )> (a + b)) && 
			(c&&d % 2 > 0)  && (a%2 == 0 )) {
		
		System.out.println("Valores aceitos");
		
	}
	 else {
		 System.out.println("Valores nao aceitos");
	 }
}
}

