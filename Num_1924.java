import java.util.Scanner;

public class Num_1924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a [] = {0,31,28,31,30,31,30,31,31,30,31,30};
		String b [] = {"MON","TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		int M = sc.nextInt();
		int D = sc.nextInt();
		int sum =0;
		for (int i=0; i<M; i++) {
			sum +=a[i];
		}
		sum += D-1;
		System.out.println(b[sum%7]);
	}

}
