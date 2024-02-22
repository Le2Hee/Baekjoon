import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		boolean[] visit = new boolean[26];
		StringTokenizer st;
		List<String> list;
		
		while (t-- > 0) {
			list = new LinkedList<>();
			st = new StringTokenizer(br.readLine(), " ", true);
			
			while (st.hasMoreElements()) {
				list.add(st.nextToken());
			}
			
			boolean check = false;
			int listIndex = -1;
			int strIndex = -1;
			
			for (int i = 0; i < list.size(); i++) {
				int index = list.get(i).charAt(0);
				
				if (Character.isUpperCase(list.get(i).charAt(0))) {
					index -= 'A';
					if (!visit[index]) {
						visit[index] = true;
						check = true;
						listIndex = i;
						strIndex = 0;
						break;
					}
				} else if (Character.isLowerCase(list.get(i).charAt(0))) {
					index -= 'a';
					if (!visit[index]) {
						visit[index] = true;
						check = true;
						listIndex = i;
						strIndex = 0;
						break;
					}
				}
			}
			
			if (!check) {
				for (int i = 0; i < list.size(); i++) {
					for (int j = 1; j < list.get(i).length(); j++) {
						int index = list.get(i).charAt(j);
						
						if (Character.isUpperCase(list.get(i).charAt(j))) {
							index -= 'A';
							if (!visit[index]) {
								visit[index] = true;
								check = true;
								listIndex = i;
								strIndex = j;
								break;
							}
						} else if (Character.isLowerCase(list.get(i).charAt(j))) {
							index -= 'a';
							if (!visit[index]) {
								visit[index] = true;
								check = true;
								listIndex = i;
								strIndex = j;
								break;
							}
						}
					}
					
					if (check) {
						break;
					}
				}
			}
			
			for (int i = 0; i < list.size(); i++) {
				if (i == listIndex) {
					for (int j = 0; j < list.get(i).length(); j++) {
						if (strIndex == j) {
							sb.append("[").append(list.get(i).charAt(j)).append("]");
						} else {
							sb.append(list.get(i).charAt(j));
						}
					}
				} else {
					sb.append(list.get(i));
				}
			}
			
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
