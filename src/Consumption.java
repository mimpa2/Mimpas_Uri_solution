import java.util.Scanner;
public class Consumption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		double y = sc.nextDouble();
		
		double avg = x / y;
	
		System.out.printf("%.3f  Km/1\n" , avg);
		
		
				
	}

}
