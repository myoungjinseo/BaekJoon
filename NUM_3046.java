import java.util.Scanner;

public class NUM_3046 {			//백준에서는 class Main

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int R1 = sc.nextInt();
		int S =sc.nextInt();
		int R2 = 0;
		R2 = 2*S -R1;		//S= (R1+R2)/2를 R1의 식으로 정리
		System.out.println(R2);
	}

}