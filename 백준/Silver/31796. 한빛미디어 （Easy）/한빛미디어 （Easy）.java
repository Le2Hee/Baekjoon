import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 책의 개수.
		StringTokenizer st = new StringTokenizer(br.readLine()); // 책의 가격들.
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 책 가격 기준으로 오름차순 정렬.
		Arrays.sort(arr);
		int page = 1; // 페이지 수.
		int min = arr[0]; // 현재 가장 작은 가격.
		
		for (int i = 1; i < n; i++) {
			
			// 조회하는 책의 가격이 min의 2배보다 크거나 같다면
			if (min * 2 <= arr[i]) { 
				page++; // 페이지 수를 올려주고.
				min = arr[i]; // min 가격 재설정.
			}
		}
		
		bw.write(Integer.toString(page));
		bw.flush();
		bw.close();
		br.close();
	}
}