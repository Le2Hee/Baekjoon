import java.io.*;
import java.util.*;

public class Main {
	
	public static class Kayak {
		int num, index, rank;
		
		public Kayak (int n, int i) {
			num = n;
			index = i;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		char[] line;
		List<Kayak> list = new LinkedList<>();
		
		for (int i = 0; i < h; i++) {
			line = br.readLine().toCharArray();
			for (int j = w - 1; j >= 0; j--) {
				if (Character.isDigit(line[j])) {
					list.add(new Kayak(line[j] - '0', j));
					break;
				}
			}
		}
		
		Collections.sort(list, (o1, o2) -> o2.index - o1.index);
		int rank = 1;
		list.get(0).rank = rank;
		
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i - 1).index == list.get(i).index) {
				list.get(i).rank = rank;
			} else {
				rank++;
				list.get(i).rank = rank;
			}
		}
		
		Collections.sort(list, (o1, o2) -> o1.num - o2.num);
		
		for (Kayak k : list) {
			sb.append(k.rank).append("\n");
		}
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}
