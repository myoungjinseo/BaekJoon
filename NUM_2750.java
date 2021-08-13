import java.util.Scanner;

public class NUM_2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp;
		int NUM = sc.nextInt();
		int [] arr = new int [NUM];
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int L=0; L<arr.length;L++) {
		for(int j=0; j<arr.length-L-1;j++) {
			if(arr[j]>arr[j+1]) {
				temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1] = temp;
			}
		}}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
		
	}

}
