import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()); // 수열 A의 길이
		int q = Integer.parseInt(st.nextToken()); // 질문의 개수

		int[] numbers = new int[n];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(numbers);

		int[] accumulated = new int[n]; // 누적 합 배열
		accumulated[0] = numbers[0];
		for (int i = 1; i < n; i++) {
			accumulated[i] = accumulated[i - 1] + numbers[i];
		}
		
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			
			int min = Integer.parseInt(st.nextToken());
			int max = Integer.parseInt(st.nextToken());
			
			if (min > 1) {
				sb.append(accumulated[max - 1] - accumulated[min - 2]).append("\n");
			} else {
				sb.append(accumulated[max - 1]).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}