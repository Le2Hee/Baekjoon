import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); // 결정의 모양
		int b = Integer.parseInt(st.nextToken()); // 온도
		
		long count = 1;
		long add = 0;
		
		if (a == 3) {
			add = 2;
			
			while (b-- > 0) {
				count += add;
				add++;
			}
		} else {
			add = a - 1;
			
			while (b-- > 0) {
				count += add;
				add += a - 2;
			}
		}
		
		bw.write(Long.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}