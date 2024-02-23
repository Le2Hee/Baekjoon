import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = "";
		
		StringTokenizer st;
		int now, move;
		String key;
		while (!(s = br.readLine()).equals("0 W 0")) {
			st = new StringTokenizer(s);
			now = Integer.parseInt(st.nextToken());
			key = st.nextToken();
			move = Integer.parseInt(st.nextToken());
			
			switch (key) {
			case "W":
				now -= move;
				break;
			case "D":
				now += move;
				break;
			}
			
			if (now < -200) {
				sb.append("Not allowed\n");
			} else {
				sb.append(now).append("\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
