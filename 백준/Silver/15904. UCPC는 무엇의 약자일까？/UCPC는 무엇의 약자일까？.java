import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		char[] arr;
		StringBuilder s = new StringBuilder();
		while (st.hasMoreElements()) {
			arr = st.nextToken().toCharArray();
			
			for (int i = 0; i < arr.length; i++) {
				if (Character.isUpperCase(arr[i])) {
					s.append(arr[i]);
				}
			}
		}
		
		char[] ucpc = {'U', 'C', 'P', 'C'};
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ucpc[index]) {
				index++;
			}
			
			if (index == 4) {
				sb.append("I love UCPC");
				break;
			}
		}
		
		if (sb.length() == 0) {
			sb.append("I hate UCPC");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
