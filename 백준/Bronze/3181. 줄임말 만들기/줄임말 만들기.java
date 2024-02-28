import java.io.*;
import java.util.*;

public class Main {
	
	static String[] arr = {"i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String s = st.nextToken();
		sb.append(String.valueOf(s.charAt(0)).toUpperCase());
		
		while (st.hasMoreElements()) {
			s = st.nextToken();
			
			if (check(s)) {
				sb.append(String.valueOf(s.charAt(0)).toUpperCase());
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean check(String s) {
		boolean result = true;
		
		for (int i = 0; i < 10; i++) {
			if (arr[i].equals(s)) {
				result = false;
				break;
			}
		}
		
		return result;
	}
}
