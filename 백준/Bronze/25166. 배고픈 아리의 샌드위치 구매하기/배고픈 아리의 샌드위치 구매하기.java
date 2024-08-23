import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken()); // 샌드위치 가격
		int m = Integer.parseInt(st.nextToken()); // 쿠키가 가지고 있는 금액
		
		if (s < 1024) {
			sb.append("No thanks");
		} else {
			int rest = s - 1023;
			
			if ((rest & m) == rest) {
				sb.append("Thanks");
			} else {
				sb.append("Impossible");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}