import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 고양이의 수
		int k = Integer.parseInt(st.nextToken()); // 한 번에 들 수 있는 무게
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		int count = 0;
		int back = n - 1;
		int one, two;
		
		for (int i = 0; i < n; i++) {
			one = arr[i];
			
			while (true) {
				two = arr[back];
				
				if (back <= i) {
					break;
				}
				
				if (one + two <= k) {
					count++;
					break;
				} else {
					back--;
				}
			}
			back--;
			
			if (count >= n / 2 || i >= back) {
				break;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}