import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 삼각형의 크기
		
		List<Integer>[] list = new LinkedList[n + 1];
		
		// 꼭대기 층을 먼저 넣어 준다.
		list[0] = new LinkedList<>();
		list[0].add(0);
		list[1] = new LinkedList<>();
		list[1].add(Integer.parseInt(br.readLine()));
		
		int num;
		StringTokenizer st;
		for (int i = 2; i <= n; i++) {
			list[i] = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < i; j++) {
				num = Integer.parseInt(st.nextToken());
				
				if (j == 0) {
					list[i].add(list[i - 1].get(0) + num);
				} else if (j == i - 1) {
					list[i].add(list[i - 1].get(list[i - 1].size() - 1) + num);
				} else {
					list[i].add(Math.max(list[i - 1].get(j - 1), list[i - 1].get(j)) + num);
				}
			}
		}
		
		int max = 0;
		for (int i = 0; i < list[n].size(); i++) {
			max = Math.max(max, list[n].get(i));
		}
		
		bw.write(Integer.toString(max));
		bw.flush();
		bw.close();
		br.close();
	}
}