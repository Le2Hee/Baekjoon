import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		// +를 기준으로 문자열을 나눠줍니다.
		StringTokenizer st = new StringTokenizer(br.readLine(), "+");
		int len = st.countTokens();
		
		if (len != 2) {
			sb.append("No Money");
		} else {
			Set<String> set = new HashSet<>();
			String str = "";
			
			for (int i = 0; i < len; i++) {
				str = st.nextToken();
				set.add(str);
			}
			
			if (set.size() != 1 || str.charAt(0) == '0') {
				sb.append("No Money");
			} else {
				for (char c : str.toCharArray()) {
					if (!Character.isDigit(c)) {
						sb.append("No Money");
						break;
					}
				}
			}
		}
		
		if (sb.length() == 0) {
			sb.append("CUTE");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
