import java.util.Scanner;

public class Num_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();	//대문자 입력받기

        int[] cnt = new int[26];	//알파벳 개수만큼 배열
        int max = -1;
        char result = '?';
        
        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i) - 65]++; //cnt[str.charAt(i) - 65] += 0
         
          //a의 아스키코드 int값 = 65
            if (max < cnt[str.charAt(i) - 65]) {	 //처음은 무조건 성립, 두번째부터는 비교대상 		
                max = cnt[str.charAt(i) - 65];		//max 값 변경
                result = str.charAt(i);		//result 값 입력  , 알바펫
            } else if (max == cnt[str.charAt(i) - 65]) {
                result = '?';
            }

        }
        System.out.println(result);

        
        
    }
}