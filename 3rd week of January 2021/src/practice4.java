// BOJ 2750번: 수 정렬하기
import java.util.*;

public class practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(a);
		for(var i : a) {
			System.out.println(i);
		}
	}
}
