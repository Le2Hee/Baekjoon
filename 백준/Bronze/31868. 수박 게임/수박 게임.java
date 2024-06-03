import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()) - 1; // 1단계 이후를 계산
		int k = Integer.parseInt(st.nextToken()); // 체리의 개수
		
		// 단계별로 2개씩 소모
		while (n-- > 0) {
			k /= 2;
		}
		
		bw.write(Integer.toString(k));
		bw.flush();
		bw.close();
		br.close();
	}
}