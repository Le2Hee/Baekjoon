import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		StringBuilder[] map = new StringBuilder[h * 2];
		StringBuilder s;
		
		for (int i = 0; i < h; i++) {
			map[i] = new StringBuilder();
			s = new StringBuilder(br.readLine());
			map[i].append(s).append(s.reverse());
		}
		
		int index = h - 1;
		for (int i = h; i < h * 2; i++) {
			map[i] = new StringBuilder();
			map[i].append(map[index--]);
		}
		
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()) - 1;
		int b = Integer.parseInt(st.nextToken()) - 1;
		
		if (map[a].charAt(b) == '#') {
			map[a].replace(b, b + 1, ".");
		} else {
			map[a].replace(b, b + 1, "#");
		}
		
		for (StringBuilder m : map) {
			sb.append(m).append("\n");
		}
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}