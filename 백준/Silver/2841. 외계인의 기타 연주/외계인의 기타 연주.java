import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int count = 0;
		
		List<List<Integer>> list = new LinkedList<>();
		for (int i = 0; i < 7; i++) {
			list.add(new LinkedList<>());
		}
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			if (list.get(l).size() == 0) {
				count++;
				list.get(l).add(num);
			} else {
				boolean bo = false;
				
				while (list.get(l).size() != 0 && list.get(l).get(0) >= num) {
					if (list.get(l).get(0) == num) {
						bo = true;
						break;
					} else {
						count++;
						list.get(l).remove(0);
					}
				}
				
				if (!bo) {
					count++;
					list.get(l).add(num);
				}
			}
			
			Collections.sort(list.get(l), (o1, o2) -> o2 - o1);
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}