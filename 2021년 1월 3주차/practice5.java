// BOJ 1110번: 더하기 사이클
import java.util.*;
public class practice5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp = N;
		int count = 0;
		sc.close();
		while(true) {
			N = (((N / 10) + (N % 10)) % 10) + ((N % 10) * 10);
			count++;
			if(temp == N)
				break;
		}
		System.out.println(count);
	}
}
