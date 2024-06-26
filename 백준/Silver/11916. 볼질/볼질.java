import java.io.*;
import java.util.*;

public class Main {
	
	static boolean one, two, thr;
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 던진 공의 수
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int ball = 0;
		one = false; // 1루 여부
		two = false; // 2루 여부
		thr = false; // 3루 여부
		int num;
		
		while (n-- > 0) {
			num = Integer.parseInt(st.nextToken());
			
			if (num == 1) { // 볼
				ball++;
				
				if (ball == 4) {
					run(0);
					ball = 0;
				}
			} else if (num == 2) { // 몸에 맞는 공
				run(0);
				ball = 0;
			} else { // 폭투
				run(1);
				ball++;
				
				if (ball == 4) {
					run(0);
					ball = 0;
				}
			}
		}
		
		bw.write(Long.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 볼넷, 데드볼 : 0, 폭투 : 1
	// 진루를 할 때 실행하는 함수.
	private static void run(int ca) {
		if (ca == 0) {
			if (one) {
				if (two) {
					if (thr) {
						count++;
					} else {
						thr = true;
					}
				} else {
					two = true;
				}
			} else {
				one = true;
			}
		} else {
			if (thr) {
				count++;
				thr = false;
			}
			
			if (two) {
				thr = true;
				two = false;
			}
			
			if (one) {
				two = true;
				one = false;
			}
		}
	}
}