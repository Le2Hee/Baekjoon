import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); // 하나의 원에서 왼쪽 위의 수
		int b = Integer.parseInt(st.nextToken()); // 오른쪽 위의 수
		int c = Integer.parseInt(st.nextToken()); // 아래 수
		int result = 0;
		
		if (a == 0) {
			result = (int)Math.pow(c, 2) - b; // c의 제곱 - b
		} else if (b == 0) {
			result = (int)Math.pow(c, 2) - a; // c의 제곱 - a
		} else {
			result = (int)Math.sqrt((a + b)); // a + b 의 제곱근
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
}