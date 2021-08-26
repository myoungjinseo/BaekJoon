import java.util.Scanner;

public class NUM_2752 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [3];
		int temp;
		for (int k=0; k<3; k++) {
			int n =sc.nextInt();
			arr [k] = n;
		}
		
		//거품 정렬이용
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =temp;
					
				}
			
			}
		}
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
	}

}
