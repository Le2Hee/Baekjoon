import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		char ellis = br.readLine().charAt(0);
		int count = 0;
		
		while (st.hasMoreElements()) {
			char c = st.nextToken().charAt(0);
			
			if (c == ellis) {
				count++;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}