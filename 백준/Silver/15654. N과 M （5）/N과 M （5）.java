import java.io.*;
import java.util.*;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	static int n, m;
	static boolean[] visit;
	static int[] arr, numbers;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		numbers = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(numbers);
		arr = new int[m];
		visit = new boolean[n];
		back(0);
		System.out.println(sb);
	}
	
	private static void back(int depth) {
		if (m == depth) {
			for (int num : arr) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = numbers[i];
				back(depth + 1);
				visit[i]  = false;
			}
		}
	}
}