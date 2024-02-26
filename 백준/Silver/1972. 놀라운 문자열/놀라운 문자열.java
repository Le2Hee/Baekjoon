import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = "";
		
		char[] arr;
		HashSet<String> set;
		int len;
		StringBuilder str;
		boolean check;
		
		while (!(s = br.readLine()).equals("*")) {
			check = true;
			arr = s.toCharArray();
			len = arr.length;
			
			for (int i = 0; i <= len - 2; i++) {
				set = new LinkedHashSet<>();
				
				for (int j = 0; j < len - i - 1; j++) {
					str = new StringBuilder();
					str.append(arr[j]).append(arr[j + i + 1]);
					
					set.add(str.toString());
				}
				
				
				if (set.size() != len - 1 - i) {
					check = !check;
					break;
				}
			}
			
			sb.append(s);
			if (check) {
				sb.append(" is surprising.\n");
			} else {
				sb.append(" is NOT surprising.\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}