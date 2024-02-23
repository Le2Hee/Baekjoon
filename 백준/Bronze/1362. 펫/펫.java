import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = "";
		int count = 0;
		
		StringTokenizer st;
		while (!(s = br.readLine()).equals("0 0")) {
			count++;
			sb.append(count).append(" ");
			boolean check = true;
			
			st = new StringTokenizer(s);
			int reasonable = Integer.parseInt(st.nextToken());
			int actual = Integer.parseInt(st.nextToken());
			
			while (!(s = br.readLine()).equals("# 0")) {
				st = new StringTokenizer(s);
				String key = st.nextToken();
				int n = Integer.parseInt(st.nextToken());
				
				switch (key) {
				case "F":
					actual += n;
					break;
				case "E":
					actual -= n;
					break;
				}
				
				if (actual <= 0) {
					sb.append("RIP\n");
					check = false;
				}
			}
			
			if (check) {
				if (reasonable / 2 < actual && actual < reasonable * 2) {
					sb.append(":-)\n");
				} else {
					sb.append(":-(\n");
				}
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}