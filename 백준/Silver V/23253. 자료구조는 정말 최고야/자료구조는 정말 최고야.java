import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 교과서 수
		int m = Integer.parseInt(st.nextToken()); // 더미 수
		boolean bo = true;
		
		for (int i = 0; i < m; i++) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			int sub = Integer.parseInt(st.nextToken());
			while (st.hasMoreElements()) {
				int num = Integer.parseInt(st.nextToken());
				if (sub < num) {
					bo = false;
				} else {
					sub = num;
				}
			}
		}
		
		bw.write(bo ? "Yes" : "No");
        bw.flush();
        bw.close();
        br.close();
	}
}