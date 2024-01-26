import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		
		int aindex = 0;
		int bindex = 0;
		
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					aindex = j;
					bindex = i;
					break;
				}
			}
			
			if (aindex != 0) {
				break;
			}
		}
		
		String[][] map = new String[b.length()][a.length()];
		
		int ai = 0;
		int bi = 0;
		
		for (int i = 0; i < b.length(); i++) {
			for (int j = 0; j < a.length(); j++) {
				if (i == aindex && j == bindex) {
					map[i][j] = String.valueOf(a.charAt(ai++));
					bi++;
				} else if (i == aindex) {
					map[i][j] = String.valueOf(a.charAt(ai++));
				} else if (j == bindex) {
					map[i][j] = String.valueOf(b.charAt(bi++));
				} else {
					map[i][j] = ".";
				}
				sb.append(map[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}