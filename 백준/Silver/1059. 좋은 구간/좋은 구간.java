import java.io.*;
import java.util.*;

public class Main {
	
	static List<Integer> list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		list = new LinkedList<>();
		while (t-- > 0) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int n = Integer.parseInt(br.readLine()), count = 0;
		Collections.sort(list);
		
		if (check(n)) {
			int min = 0, max = 0, index = 0;
			
			list.add(n);
			Collections.sort(list);
			
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == n) {
					index = i;
					break;
				}
			}
			
			min = index != 0 ? list.get(index - 1) + 1 : 1;
			max = list.get(index + 1) - 1;
			
			for (int i = min ; i < max; i++) {
				for (int j = i + 1; j <= max; j++) {
					if (check2(i, j, n)) {
						count++;
					}
				}
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean check(int n) {
		boolean bo = true;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == n) {
				bo = false;
				break;
			} else if (list.get(i) > n) {
				break;
			}
		}
		
		return bo;
	}
	
	private static boolean check2(int start, int end, int n) {
		return start <= n && n <= end;
	}
}