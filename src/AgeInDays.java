import java.util.Scanner;

public class AgeInDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int age = sc.nextInt();
int year = age / 365;
int month = (age % 365) / 30 ;
int days = (age % 365) % 30 ;

System.out.println(year + " ano(s)");
System.out.println(month+ " mes(es)");
System.out.println(days + " dia(s)");


	}

}
