import java.util.Scanner;

public class NUM_10818 {		//백준 문제 입력시 class 이름을 Main으로 바꾸어준다!!
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int [] arr = new int [A];
        int max =-1000001;        // 모든 경우의 수를 위한 가장 작은 수 대입    
		int min = 1000001;        // 모든 경우의 수를 위한 가장 큰 수 대입
		for (int i = 0; i <arr.length; i++) {
			arr [i] = sc.nextInt();
			
			if(arr [i]<min) {			//최솟값을 위한 식
				min = arr [i];
			}  
            if(arr [i]>max){	// 최댓값을 위한 식
				max = arr [i];	
			}
			
		}

		System.out.println(min+" "+max);
		
	}

}
