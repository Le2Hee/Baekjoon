import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = 7;
		
		StringTokenizer st;
		String name;
		int num;
		String str = "";
		int max = 0;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			name = st.nextToken();
			num = Integer.parseInt(st.nextToken());
			
			if (max < num) {
				max = num;
				str = name;
			}
		}
		
		bw.write(str);
		bw.flush();
		bw.close();
		br.close();
	}
}
