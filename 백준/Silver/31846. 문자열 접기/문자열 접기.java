import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 문자열의 길이
		char[] arr = br.readLine().toCharArray(); // 문자열
		int t = Integer.parseInt(br.readLine()); // 테이스 케이스 개수
		
		char[] sub; // l에서 r까지 문자열을 저장할 배열
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			sub = new char[r - l + 1];
			for (int i = l - 1; i < r; i++) { // 부분 문자열 저장
				sub[i + 1 - l] = arr[i];
			}
			
			sb.append(function(sub)).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 반을 접었을 때 나올 수 있는 최대값을 구하는 함수
	private static int function(char[] arr) {
		char[] one, two; // one: 접히니 않는 부분, two: 접힌 부분
		int count = 0, subCount;
		
		for (int i = 0; i < arr.length; i++) {
			subCount = 0;
			one = new char[i + 1];
			two = new char[arr.length - one.length];
			
			for (int j = 0; j < arr.length; j++) {
				if (j <= i) { 
					one[j] = arr[j];
				} else { // 접히는 부분이기 때문에 뒤에서 부터 저장한다.
					two[two.length - j + i] = arr[j];
				}
			}
			
			// 접힌 뒷 부분을 비교하기 때문에 마지막 인덱스 끼리 비교한다.
			for (int j = 0; j < (one.length > two.length ? two.length : one.length); j++) {
				if (one[one.length - 1 - j] == two[two.length - 1 - j]) {
					subCount++;
				}
			}
			
			count = Math.max(count, subCount);
		}
		
		return count;
	}
}
