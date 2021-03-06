// BOJ 2577번: 숫자의 개수
/*
// 풀이 1
import java.util.*;
 
public class practice7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mul = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		String str = Integer.toString(mul);
		sc.close();
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) - '0' == i)
					count++;
			}
			System.out.println(count);
		}
	}
}
*/
// 풀이 2
import java.io.*;
public class practice7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int mul = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		while(mul != 0) {
			arr[mul%10]++;
			mul/=10;
		}
		
		for(int result : arr) {
			System.out.println(result);
		}
	}
}