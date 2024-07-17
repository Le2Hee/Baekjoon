import java.io.*;
import java.util.*;

public class Main {
	
	private static class Seaweed {
		int p, m;
		
		public Seaweed(int p, int m) {
			this.p = p;
			this.m = m;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 생물의 수
		int m = Integer.parseInt(st.nextToken()); // 실험의 수
		
		List<Seaweed> list = new LinkedList<>();
		for (int i = 0; i <= n; i++) {
			list.add(new Seaweed(-1, -1));
		}
		
		int num, ot;
		String pm;
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			pm = st.nextToken();
			ot = Integer.parseInt(st.nextToken());
			
			switch (pm) {
			case "P":
				list.get(num).p = ot;
				break;
			case "M":
				list.get(num).m = ot;
				break;
			}
		}
		
		int min = 0;
		int max = 0;
		
		for (int i = 1; i <= n; i++) {
			if (list.get(i).p == 1 && list.get(i).m == 0) {
				min++;
			}
			
			if ((list.get(i).p == 1 || list.get(i).p == -1) && (list.get(i).m == -1 || list.get(i).m == 0)) {
				max++;
			}
		}
		
		sb.append(min).append(" ").append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}