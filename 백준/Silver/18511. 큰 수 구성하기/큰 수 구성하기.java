import java.io.*;
import java.util.*;

public class Main {
	
	static int[] arr;
	static int n, k, max = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 최대 수
		k = Integer.parseInt(st.nextToken()); // 원소의 개수
		
		arr = new int[k];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 오름차순 정렬
		Arrays.sort(arr);
		function(0);
		
		bw.write(Integer.toString(max));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void function(int num) {
		if (num > n) { // 값이 더 커지면 멈춘다.
			return;
		}
		
		if (max < num) { // 현재 max값 보다 num이 더 크면 max값을 변경
			max = num;
		}
		
		// 모든 수를 다시 재귀
		for (int i = k - 1; i >= 0; i--) {
			function(num * 10 + arr[i]);
		}
	}
}