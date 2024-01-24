import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		
		char[] in = {'=', '-', '0', '9', '8', '7', '6', '5', '4', '3', '2', '1', '\\', ']', '[', 'P', 'O', 'I', 'U', 'Y', 'T', 'R', 'E', 'W', '\'', ';', 'L', 'K', 'J', 'H', 'G', 'F', 'D', 'S', '/', '.', ',', 'M', 'N', 'B', 'V', 'C', 'X'};
		char[] out = {'-', '0', '9', '8', '7', '6', '5', '4', '3', '2', '1', '`', ']', '[', 'P', 'O', 'I', 'U', 'Y', 'T', 'R', 'E', 'W', 'Q', ';', 'L', 'K', 'J', 'H', 'G', 'F', 'D', 'S', 'A', '.', ',', 'M', 'N', 'B', 'V', 'C', 'X', 'Z'};
		String str = "";
		StringTokenizer st;
		
		while ((str = br.readLine()) != null) {
			sb = new StringBuilder();
			st = new StringTokenizer(str, " ", true);
			
			while (st.hasMoreElements()) {
				String s = st.nextToken();
				if (!s.equals(" ")) {
					for (int i = 0; i < s.length(); i++) {
						for (int j = 0; j < 43; j++) {
							if (s.charAt(i) == in[j]) {
								sb.append(out[j]);
								break;
							}
						}
					}
				} else {
					sb.append(s);
				}
			}
			
			System.out.println(sb);
		}
	}
}