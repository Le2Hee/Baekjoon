import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 분해해야되는 비트
		
		// 3일 때는 예외처리
		if (n == 3) {
			sb.append(1).append("\n").append(3);
		} else {
			// 3비트의 개수
			int threeCount = n % 3 == 1 ? n / 3 - 1 : n / 3;
			
			// 2비트의 개수
			int twoCount = (n - 3 * threeCount) / 2;
			
			// 총 합을 출력
			sb.append(threeCount + twoCount).append("\n");
			
			// 첫 공백때문에 첫 번째 값은 미리 입력
			if (threeCount > 0) {
				threeCount--;
				sb.append("3");
			} else {
				twoCount--;
				sb.append("2");
			}
			
			// 3비트의 개수만큼 3을 입력
			while (threeCount-- > 0) {
				sb.append(" 3");
			}
			
			// 2비트의 개수만큼 2를 입력
			while (twoCount-- > 0) {
				sb.append(" 2");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}