import java.io.*;
import java.util.*;

public class Main {
	
	static char[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 문자열 길이
		int t = Integer.parseInt(st.nextToken()); // 쿼리의 개수
		arr = br.readLine().toCharArray(); // 문자열
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			switch (c) {
			case 1:
				sb.append(check(l - 1, r - 1)).append("\n");
				break;
			case 2:
				change(l - 1, r - 1);
				break;
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 알파벳 묶음을 계산하는 함수
	private static int check(int start, int end) {
		int count = 0;
		
		char c = ' ', now;
		for (int i = start; i <= end; i++) {
			now = arr[i];
			
			if (c != now) {
				c = now;
				count++;
			}
		}
		
		return count;
	}
	
	// 알파벳 변경 함수
	private static void change(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (arr[i] == 'Z') {
				arr[i] = 'A';
			} else {
				arr[i]++;
			}
		}
	}
}