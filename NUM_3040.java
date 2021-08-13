
import java.util.Scanner;

public class NUM_3040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int N1 = 0, N2 = 0;
		int[] arr = new int[9];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];

		}
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (sum - arr[i] - arr[j] == 100 && arr[i] != arr[j]) {					
					N1 =i;
					N2 =j;
					break;}
			}
		
		}
		for(int i=0; i<arr.length; i++) {
			if(i == N1 || i == N2)
					continue;
			System.out.println(arr[i]);
		}
		
		
	}

}
