import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 배열의 크기
		StringTokenizer st = new StringTokenizer(br.readLine()); // 수열
		
		// P배열을 저장할 배열
		int[] P = new int[n];
		
		// 수열을 저장하기 위한 배열
		int[] arr = new int[n];
		
		// 정렬과 중복제거를 한번에 하기 위한 treeset
		TreeSet<Integer> set = new TreeSet<>();
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			set.add(arr[i]);
		}
		
		// P배열에 들어갈 순자와 set을 참조하는 순자 변수
		int index = 0, num;
		while (!set.isEmpty()) {
			num = set.pollFirst();
			
			for (int i = 0; i < n; i++) {
				if (arr[i] == num) {
					P[i] = index;
					index++;
				}
			}
		}
		
		for (int p : P) {
			sb.append(p + " ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}