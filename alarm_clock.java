import java.util.Scanner;

public class alarm_clock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();		//시간
		int M = sc.nextInt();		//분
		

		if(M>=45) {		//45분 이상인 경우
			M -= 45;		//45분
			System.out.println(H);
			System.out.println(M);
		}
		else {		//45분 미만인 경우
			if(H>0) {		//0시 이상인 경우
				M += 15;		//60-45=15 => 분에 15분을 더 해준다
				H -= 1;			//분에서 60분을 빌려서 -1시간이 된다
				System.out.println(H);
				System.out.println(M);
			}
			else {			//0시인 경우
				H = 23;		//24-1 =23
				M +=15;		//60-45=15 => 분에 15분을 더 해준다
				System.out.println(H);
				System.out.println(M);
			}
		}
	}

}
