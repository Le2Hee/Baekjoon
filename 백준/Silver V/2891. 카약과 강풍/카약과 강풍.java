import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 팀의 수 
		int s = Integer.parseInt(st.nextToken()); // 손상된 팀의 수
		int r = Integer.parseInt(st.nextToken()); // 여분 카약이 있는 팀의 수
		
		boolean[] damage = new boolean[11];
		st = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < s; i++) {
			damage[Integer.parseInt(st.nextToken())] = true;
		}
		
		boolean[] spare = new boolean[11];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < r; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (damage[num]) {
				damage[num] = false;
			} else {
				spare[num] = true;
			}
		}
		
		int count = 0;
		for (int i = 1; i < 11; i++) {
			if (damage[i]) {
				if (spare[i - 1]) {
					spare[i - 1] = false;
				} else if (i != 10 && spare[i + 1]) {
					spare[i + 1] = false;
				} else {
					count++;
				}
			}
		}
		
		bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        br.close();
	}
}