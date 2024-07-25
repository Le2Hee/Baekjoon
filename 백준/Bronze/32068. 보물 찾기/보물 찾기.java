import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		
		int l, r, s, ls, rs;
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			l = Integer.parseInt(st.nextToken()); // 왼쪽 보물
			r = Integer.parseInt(st.nextToken()); // 오른쪽 보물
			s = Integer.parseInt(st.nextToken()); // 현재 위치
			
			ls = s - l;
			rs = r - s;
			
			if (ls < rs) {
				sb.append(ls * 2 + 1).append("\n");
			} else {
				sb.append(2 * rs).append("\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}