import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		int[] locations = new int[n];
		int[] times = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			locations[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			times[i] = Integer.parseInt(st.nextToken());
		}
		
		// 일단 최대 거리까지 이동
		int count = (locations[n - 1] < times[n - 1] ? times[n - 1] : locations[n - 1]);;
		
		// 최대 거리에서 부터 돌아 오면서 전부 확인
		for (int i = n - 2; i >= 0; i--) {
			count += locations[i + 1] - locations[i];
			
			if (count < times[i]) {
				count = times[i];
			}
		}
		
		// 마지막에서 돌아오는 시간.
		count += locations[0];
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}