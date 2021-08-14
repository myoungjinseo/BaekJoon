import java.util.Scanner;

public class NUM_10797 {		//백준 => class Main

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A =sc.nextInt();		//금지된 차량번호
		int sum =0;			//위반 차량 수
		for(int i=0; i<5; i++) {
			int B=sc.nextInt();		//차량 번호
			if(A==B) {
				sum +=1;	
			}
			
		}
		System.out.println(sum);

	}

}
