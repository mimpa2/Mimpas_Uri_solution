
import java.util.Scanner;

public class Formula_Bhaskara {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double A = sc.nextDouble();
	double B = sc.nextDouble();
	double C = sc.nextDouble();
	
	if ((A == 0) || ((B*B) - (4*A*C) < 0)){
		
		System.out.println("Impossivel calcular");
	}
	
	else {
		double R1 = 0;
		double R2 = 0;
		
		
		 R1 = ((-B + Math.sqrt(((B*B) - (4*A*C)))) / (2*A) );
		 R2 = ((-B - Math.sqrt(((B*B) - (4*A*C)))) / (2*A) );
		System.out.printf(" R1 = %.5f\n" , R1);
		System.out.printf(" R2 = %.5f\n" , R2);
	}

	}

}
