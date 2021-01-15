// BOJ 2562번: 최댓값
import java.util.*;
public class practice6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 9;
		int arr[] = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int max = arr[0];
		int count = 0;
		for(int i = 1; i < N; i++) {
			if(max < arr[i]) {
				max = arr[i];
				count = i;
			}
		}
		System.out.println(max);
		System.out.println(count+1);
	}
}
