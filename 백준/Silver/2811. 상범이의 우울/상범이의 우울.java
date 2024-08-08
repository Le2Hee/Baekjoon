import java.io.*;
import java.util.*;

public class Main {
	
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 예측한 날의 수
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		int[] dearr = new int[n];
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if (arr[i] < 0) {
				count++;
			} else {
				dearr[i - count] = count;
				count = 0;
			}
		}
		
		if (count != 0) {
			dearr[n - count] = count;
			count = 0;
		}
		
		int max = 0;
		for (int num : dearr) {
			max = Math.max(max, num);
		}
		
		int maxcount = 0;
		for (int num : dearr) {
			if (num == max) {
				maxcount++;
			}
		}
		
		int result = 0;
		int turn;
		for (int i = 0; i < maxcount; i++) {
			visit = new boolean[n];
			turn = i;
			
			for (int j = 0; j < n; j++) {
				if (max == dearr[j] && turn == 0) {
					turn--;
					check(j, dearr[j], true);
				} else if (max == dearr[j]) {
					turn--;
					check(j, dearr[j], false);
				} else {
					check(j, dearr[j], false);
				}
			}
			
			count = 0;
			for (boolean bo : visit) {
				if (bo) {
					count++;
				}
			}
			
			result = Math.max(result, count);
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void check(int index, int len, boolean check) {
		int checklen = check ? 3 * len : 2 * len;
		
		for (int i = 1; i <= checklen; i++) {
			if (index - i >= 0) {
				visit[index - i] = true;
			}
		}
	}
}