// BOJ 3052번: 나머지
import java.io.*;
public class practice8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[42];
		int count = 0;
		for(var a : arr)
			a = 0;
		for(int i = 0; i < 10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42]++;
		}
		for(int i = 0; i < arr.length; i++)
			if(arr[i] != 0)
				count++;
		System.out.println(count);
	}
}