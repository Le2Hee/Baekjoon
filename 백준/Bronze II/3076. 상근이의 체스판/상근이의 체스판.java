import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		StringBuilder up = new StringBuilder();
		StringBuilder down = new StringBuilder();
		StringBuilder wh = new StringBuilder();
		StringBuilder bl = new StringBuilder();
		
		for (int i = 0; i < b * 2; i++) {
			if (i < b) {
				bl.append("X");
			} else {
				wh.append(".");
			}
		}
		
		for (int i = 1; i <= w; i++) {
			if (i % 2 == 1) {
				up.append(bl.toString());
				down.append(wh.toString());
			} else {
				up.append(wh.toString());
				down.append(bl.toString());
			}
		}
		
		String upLine = up.toString();
		String downLine = down.toString();
		
		for (int i = 1; i < c; i++) {
			up.append("\n").append(upLine);
			down.append("\n").append(downLine);
		}
		
		for (int i = 1; i <= h; i++) {
			if (i % 2 == 1) {
				sb.append(up.toString());
			} else {
				sb.append(down.toString());
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}