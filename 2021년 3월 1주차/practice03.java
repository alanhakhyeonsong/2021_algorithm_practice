// BOJ 1931번: 회의실 배정
import java.io.*;
import java.util.*;
public class practice03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] meeting = new int[N][2];
		
		for(int i = 0; i < meeting.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			meeting[i][0] = Integer.parseInt(st.nextToken()); // start
			meeting[i][1] = Integer.parseInt(st.nextToken()); // end
		}
		Arrays.sort(meeting, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) return o1[0]-o2[0];
				return o1[1] - o2[1];
			}
		});
		int count = 0;
		int tmp = 0;
		for(int i = 0; i < N; i++) {
			if(tmp <= meeting[i][0]) {
				tmp = meeting[i][1];
				count++;
			}
		}
		System.out.println(count);
	}
}
