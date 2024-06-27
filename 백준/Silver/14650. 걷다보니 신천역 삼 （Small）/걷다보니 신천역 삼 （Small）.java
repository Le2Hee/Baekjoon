import java.io.*;
import java.util.*;

public class Main {
	
	static int n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		int count = 0;
		
		int min = (int)Math.pow(10, n - 1); // 만들 수 있는 수의 최솟값
		int max = (int)Math.pow(10, n - 1) * 2 + (n > 1 ? maxVal() : 0); // 만들 수 있는 수의 최댓값
		
		// 조건에 맞는지 체크
		for (int i = min; i <= max; i++) {
			if (i % 3 == 0) {
				if (check(i)) { // 맞다면 count 업
					count++;
				}
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	// max 값을 구하기 위한 함수.
	private static int maxVal() {
		StringBuilder num = new StringBuilder();
		int len = n - 1;
		
		while (len-- > 0) {
			num.append(2);
		}
		
		return Integer.parseInt(num.toString());
	}
	
	// 0, 1, 2를 체크하는 함수.
	private static boolean check(int num) {
		char[] arr = String.valueOf(num).toCharArray();
		
		for (int i = 0; i < n; i++) {
			if (arr[i] == '3' || arr[i] == '4' || arr[i] == '5' || arr[i] == '6' || arr[i] == '7' || arr[i] == '8' || arr[i] == '9') {
				return false;
			}
		}
		
		return true;
	}
}