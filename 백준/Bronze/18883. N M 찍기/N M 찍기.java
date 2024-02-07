import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int count = 1;
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (j == w - 1) {
					sb.append(count++);
				} else {
					sb.append(count++).append(" ");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}