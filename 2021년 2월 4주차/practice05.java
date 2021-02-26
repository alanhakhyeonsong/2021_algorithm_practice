// BOJ 1065번: 한수
import java.util.*;
public class practice05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(arithmetic_seq(N));
	}
	public static int arithmetic_seq(int num) {
		int count = 0;
		if(num < 100) {
			return num;
		} else {
			count = 99;
			if(num == 1000) num = 999;
			for(int i = 100; i <= num; i++) {
				int a = i / 100;
				int b = (i % 100) / 10;
				int c = (i % 100) % 10;
				if((a - b) == (b - c))
					count++;
			}
		}
		return count;
	}
}
