import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		long n = Long.parseLong(br.readLine()); // 입력 받은 수
		
		// 0은 만들 수 없다.
		if (n == 0) {
			sb.append("NO");
		} else {
			while (n > 0) {
				if (n % 3 == 2) { // 나머지가 2가 되면 NO를 출력
					sb.append("NO");
					break;
				}
				
				n /= 3;
			}
		}
		
		// 만들 수 있다면
		if (sb.length() == 0) {
			sb.append("YES");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}