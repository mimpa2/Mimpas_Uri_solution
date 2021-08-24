import java.util.Scanner;
public class Find_Digit_of_a_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int count = 1; //loop counting 
		int modResult = 0;
		
		while (a >= 10) {
			
			modResult = a % 10;
			count++; // 
			a = a/10;
			 System.out.println(modResult);
			
		}
	
		 System.out.println(a);
		System.out.println("total num of digit : " +count); 
		 
	}
	

}
