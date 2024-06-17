import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] l = st.nextToken().toCharArray();
		char[] r = st.nextToken().toCharArray();
		
		int count = 0;
		if (l.length == r.length) {
			for (int i = 0; i < l.length; i++) {
				if (l[i] == '8' && r[i] == '8') {
					count++;
				} else if (l[i] != r[i]) {
					break;
				}
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
