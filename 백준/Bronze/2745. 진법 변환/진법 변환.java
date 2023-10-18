import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		
		int squ = 1; // 자릿 수
		int result = 0; // 결과
		
		for (int i = str.length() - 1; i >= 0; i--) { // 오른쪽이 첫번째이기 때문에 내려간다.
			char c = str.charAt(i);
			
			if ('A' <= c && c <= 'Z') {
				result += (c - 'A' + 10) * squ;
			} else {
				result += (c - '0') * squ;
			}
			squ *= B;
		}
		
		System.out.println(result);
	}
}