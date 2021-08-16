import java.util.Scanner;

public class NUM_5543 {		//백준에서는 class Main

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int burger1 = sc.nextInt();		//상덕버거
		int burger2	= sc.nextInt();		//중덕버거 	
		int burger3	= sc.nextInt();		//하덕버거
		int coke = sc.nextInt();
		int soda = sc.nextInt();
		//S = 결제해야 할 금액
		int S = Math.min(burger3,Math.min(burger1, burger2))+Math.min(soda, coke)-50;
		System.out.println(S);
	}

}
