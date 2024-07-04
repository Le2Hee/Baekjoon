import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 작업의 개수
		
		Integer[][] arr = new Integer[n][2];
		int day, time;
		
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			day = Integer.parseInt(st.nextToken()); // 작업 기간
			time = Integer.parseInt(st.nextToken()); // 작업 시간
			
			arr[i][0] = day;
			arr[i][1] = time;
		}
		
		// 빨리 끝내야 되는 일부터 정렬.
		Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);
		
		int over = 0;
		int work = 0; 
		int now = 0;
		
		for (int i = 0; i < n; i++) {
			day = arr[i][0];
			work += day - now - holiday(now + 1, day);
			now = day;
			work -= arr[i][1];
			
			if (work < 0) {
				over += Math.abs(work);
				work = 0;
			}
			
			if (over > now) {
				over = -1;
				break;
			}
		}
		
		bw.write(Integer.toString(over));
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 토, 일을 제외
	private static int holiday(int start, int end) {
		int count = 0;
		
		for (int i = start; i <= end; i++) {
			if (i % 7 == 6 || i % 7 == 0) {
				count++;
			}
		}
		
		return count;
	}
}