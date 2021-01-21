// BOJ 4344번: 평균은 넘겠지
import java.io.*;
import java.util.*;
public class practice05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score[];
		int testcase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i = 0; i < testcase; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			score = new int[N];
			double sum = 0;
			for(int j = 0; j < N; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				sum += score[j];
			}
			double avg = sum / N;
			double count = 0;
			for(int j = 0; j < N; j++) {
				if(score[j] > avg)
					count++;
			}
			System.out.printf("%.3f%%\n", (count/N)*100);
		}
	}
}
