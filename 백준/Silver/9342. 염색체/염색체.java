import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		
		char[] arr;
		char be, now;
		String str;
		int index;
		boolean check;
		List<Integer> list;
		
		while (t-- > 0) {
			arr = br.readLine().toCharArray();
			
			list = new LinkedList<>();
			str = "";
			be = arr[0];
			str += arr[0];
			list.add(1);
			index = 0;
			
			for (int i = 1; i < arr.length; i++) {
				now = arr[i];
				
				if (be != now) {
					str += arr[i];
					be = now;
					index++;
					list.add(1);
				} else {
					list.set(index, list.get(index) + 1);
				}
			}
			
			str = str.replaceAll("AFC", "!");
			index = APC(str);
			
			if (index == -1) {
				sb.append("Good\n");
				continue;
			}
			
			list.remove(index + 2);
			list.remove(index + 1);
			
			check = index == 0 || index == 1 ? true : false;
			if (!check) {
				sb.append("Good\n");
				continue;
			}
			
			if (index == 1) {
				if (!ABCDEF(str.charAt(0)) || list.get(0) > 1) {
					sb.append("Good\n");
					continue;					
				}
			}
			
			check = index == str.length() - 1 || index == str.length() - 2 ? true : false;
			if (!check) {
				sb.append("Good\n");
				continue;
			}
			
			if (index == str.length() - 2) {
				if (!ABCDEF(str.charAt(str.length() - 1)) || list.get(str.length() - 1) > 1) {
					sb.append("Good\n");
					continue;
				}
			}
			
			sb.append("Infected!\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean ABCDEF(char c) {
		return c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E' || c == 'F';
	}
	
	private static int APC(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '!') {
				return i;
			}
		}
		
		return -1;
	}
}