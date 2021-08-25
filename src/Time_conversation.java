	import java.util.Scanner;
public class Time_conversation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int time = sc.nextInt();
int hour = time / 3600;
int minute = (time % 3600) / 60 ;
int second = (time % 3600) % 60 ;

System.out.printf("%d:%d:%d\n", hour,minute,second);
	}

}
