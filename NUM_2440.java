import java.util.Scanner;

public class NUM_2440 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		String [] arr = new String [A]; 
		String star = "*";
		
		for(int i=0; i<arr.length; i++) {
			arr [i] = star;
			star += "*";
		}
		for(int j=arr.length-1; j>=0;j--) {
			System.out.println(arr[j]);
		}
	}

}
