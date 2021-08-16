import java.util.Scanner;

public class NUM_10886 {		//백준에서는 class Main

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int N = sc.nextInt();
		int N1;
		int sum =0;
		for(int i=0; i<N;i++) {
			N1 = sc.nextInt();
			if(N1 == 1) {
				sum +=1;
			} 
			
		}
		if(sum <= N/2) {
		System.out.println("Junhee is not cute!");
		} else {
			System.out.println("Junhee is cute!");
		}
	}

}
