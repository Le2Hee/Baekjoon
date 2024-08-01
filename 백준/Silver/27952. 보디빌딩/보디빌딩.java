import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 남은 일 수
		int x = Integer.parseInt(st.nextToken()); // 루틴 진행시 빠지는 몸무게
		
		int[] mw = new int[n];
		int[] pw = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			mw[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			pw[i] = Integer.parseInt(st.nextToken());
		}
		
		long ro = 0;
		long now = 0;
		long count = 0;
		boolean check;
		
		for (int i = 0; i < n; i++) {
			now += pw[i];
			if (now < mw[i]) {
				check = ((mw[i] - now) % x) == 0 ? true : false;
				
				if (ro >= (check ? ((mw[i] - now) / x) : ((mw[i] - now) / x) + 1)) {
					ro -= check ? (mw[i] - now) / x : ((mw[i] - now) / x) + 1;
					now += check ? x * ((mw[i] - now) / x) : x * (((mw[i] - now) / x) + 1);
				} else {
					ro = -1;
					break;
				}
			} else {
				count = (now - mw[i]) / x;
				ro += count;
				now -= x * count;
			}
		}
		
		bw.write(Long.toString(ro));
		bw.flush();
		bw.close();
		br.close();
	}
}