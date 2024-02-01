import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); // 피로도
		int b = Integer.parseInt(st.nextToken()); // 일 처리
		int c = Integer.parseInt(st.nextToken()); // 케어
		int d = Integer.parseInt(st.nextToken()); // 번아웃
		int count = 0;
		int fa = 0;
		
		for (int i = 0; i < 24; i++) {
			if (fa + a > d) {
				fa -= c;
				if (fa < 0) {
					fa = 0;
				}
			} else {
				count += b;
				fa += a;
			}
		}
		
		System.out.println(count);
	}
}