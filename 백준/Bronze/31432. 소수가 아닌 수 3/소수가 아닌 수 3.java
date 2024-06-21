import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 정수의 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Queue<Integer> qu = new LinkedList<>();
		
		while (st.hasMoreElements()) {
			qu.add(Integer.parseInt(st.nextToken()));
		}
		
		int num = qu.poll();
		
		sb.append("YES\n");
		if (num == 0) {
			sb.append(0);
		} else {
			sb.append(num).append(num).append(num);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}