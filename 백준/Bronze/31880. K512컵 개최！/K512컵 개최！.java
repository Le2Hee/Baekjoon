import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 더해지는 주문서 개수
		int m = Integer.parseInt(st.nextToken()); // 곱해지는 주문서 개수
		
		long now = 0;
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreElements()) {
			now += Integer.parseInt(st.nextToken());
		}
		
		int num = 0;
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreElements()) {
			num = Integer.parseInt(st.nextToken());
			
			if (num != 0) { // 0일 때는 가장 먼저 0을 곱하고 계산을 하기 때문에 0은 제외한다.
				now *= num;
			}
		}
		
		bw.write(Long.toString(now));
		bw.flush();
		bw.close();
		br.close();
	}
}
