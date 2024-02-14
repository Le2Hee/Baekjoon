import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int nh = Integer.parseInt(st.nextToken()) - 2;
		int nw = Integer.parseInt(st.nextToken()) - 2;
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		if (nh >= h && nw >= w) {
			sb.append(1);
		} else {
			sb.append(0);
		}
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}