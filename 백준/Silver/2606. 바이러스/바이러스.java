import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 컴퓨터 수
		int m = Integer.parseInt(br.readLine()); // 컴퓨터 쌍의 수
		StringBuilder[] sb = new StringBuilder[n + 1];
		
		for (int i = 0; i <= n; i++) {
			sb[i] = new StringBuilder();
		}
		
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String startStr = st.nextToken();
			String endstr = st.nextToken();
			int start = Integer.parseInt(startStr);
			int end = Integer.parseInt(endstr);
			sb[start].append(endstr).append(" ");
			sb[end].append(startStr).append(" ");
		}
		
		HashSet<Integer> set = new HashSet<>();
		StringTokenizer st = new StringTokenizer(sb[1].toString());
		while (st.hasMoreElements()) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		int setsize = set.size();
		int subsize = -1;
		
		while (setsize != subsize) {
			setsize = set.size();
			List<Integer> list = new ArrayList<Integer>(set);
			
			for (int i = 0; i < list.size(); i++) {
				st = new StringTokenizer(sb[list.get(i)].toString());
				while (st.hasMoreElements()) {
					int num = Integer.parseInt(st.nextToken());
					if (num != 1) {
						set.add(num);
					}
				}
			}
			
			subsize = set.size();
		}
		
		System.out.println(setsize);
	}
}