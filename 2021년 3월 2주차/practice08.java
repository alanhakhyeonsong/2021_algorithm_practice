// BOJ 5622번: 다이얼
import java.io.*;
public class practice08 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String dial = br.readLine();
		int sum = 0;
		for(int i = 0; i < dial.length(); i++) {
			int check = dial.charAt(i)-'A';
			switch(check) {
			case 0: case 1: case 2:
				sum += 3;
				break;
			case 3: case 4: case 5:
				sum += 4;
				break;
			case 6: case 7: case 8:
				sum += 5;
				break;
			case 9: case 10: case 11:
				sum += 6;
				break;
			case 12: case 13: case 14:
				sum += 7;
				break;
			case 15: case 16: case 17: case 18:
				sum += 8;
				break;
			case 19: case 20: case 21:
				sum += 9;
				break;
			case 22: case 23: case 24: case 25:
				sum += 10;
				break;
			}
		}
		System.out.println(sum);
	}
}
