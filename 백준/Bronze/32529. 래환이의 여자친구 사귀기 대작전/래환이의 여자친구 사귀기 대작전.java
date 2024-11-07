import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 소개팅까지 남은 날짜
		int m = Integer.parseInt(st.nextToken()); // 목표 감소 체중
		
		int[] arr = new int[n]; // 체중 감소량
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = 0;
		boolean check = false;
		for (int i = n - 1; i >= 0; i--) {
			m -= arr[i];
			count++;
			
			if (m <= 0) {
				check = true;
				break;
			}
		}
		
		int result = 0;
		if (!check) {
			result = -1;
		} else {
			result = n - count + 1;
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
}
