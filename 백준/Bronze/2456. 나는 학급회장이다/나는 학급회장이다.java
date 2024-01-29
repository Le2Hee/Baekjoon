import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		List<int[]> list = new LinkedList<>();
		
		for (int i = 1; i <= 3; i++) {
			int[] member = {i, 0, 0, 0, 0};
			list.add(member);
		}
		
		StringTokenizer st;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			list.get(0)[a]++;
			list.get(1)[b]++;
			list.get(2)[c]++;
		}
		
		int max = 0;
		int[] count = new int[3001];
		
		for (int i = 0; i < 3; i++) {
			list.get(i)[4] = list.get(i)[1] + list.get(i)[2] * 2 + list.get(i)[3] * 3;
			max = Math.max(max, list.get(i)[4]);
			count[list.get(i)[4]]++;
		}
		
		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o2[4] == o1[4]) {
					if (o2[3] == o1[3]) {
						if (o2[2] == o1[2]) {
							return o2[1] - o1[1];
						}
						return o2[2] - o1[2];
					}
					return o2[3] - o1[3];
				}
				return o2[4] - o1[4];
			}
		});
		
		if (count[max] == 1) {
			sb.append(list.get(0)[0]);
		} else if (count[max] == 2) {
			if (list.get(0)[1] == list.get(1)[1] && list.get(0)[2] == list.get(1)[2] && list.get(0)[3] == list.get(1)[3]) {
				sb.append(0);
			} else {
				sb.append(list.get(0)[0]);
			}
		} else {
			if (list.get(0)[1] == list.get(2)[1] && list.get(0)[2] == list.get(2)[2] && list.get(0)[3] == list.get(2)[3]) {
				sb.append(0);
			} else {
				sb.append(list.get(0)[0]);
			}
		}
		
		sb.append(" ").append(max);
		System.out.println(sb);
	}
}