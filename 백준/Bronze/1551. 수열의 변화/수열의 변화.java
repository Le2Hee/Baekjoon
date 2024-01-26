import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		List<Integer> list = new LinkedList<>();
		st = new StringTokenizer(br.readLine(), ",");
		
		while (k-- > 0) {
			List<Integer> sub = new LinkedList<>();
			
			while (st.hasMoreElements()) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			for (int i = 1; i < list.size(); i++) {
				sub.add(list.get(i) - list.get(i - 1));
			}
			
			list = new LinkedList<>(sub);
		}
		
		if (list.size() == 0) {
			while (st.hasMoreElements()) {
				list.add(Integer.parseInt(st.nextToken()));
			}
		}
		
		for (int num : list) {
			sb.append(num).append(",");
		}
		
		System.out.println(sb.subSequence(0, sb.length() - 1));
	}
}