import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int l = Integer.parseInt(st.nextToken()); // 시작 번호
		int r = Integer.parseInt(st.nextToken()); // 끝 번호
		int x = Integer.parseInt(st.nextToken()); // or 번호
		
		boolean[] visit = new boolean[1100]; // 최대값은 1023이므로 길이를 1100으로 지정
		
		for (int i = l; i <= r; i++) {
			visit[i | x] = true;
		}
		
		int result = 0;
		for (int i = 0; i < 1100; i++) {
			if (!visit[i]) {
				result = i;
				break;
			}
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
}