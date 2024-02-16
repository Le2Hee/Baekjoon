import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " :");
		int sh = Integer.parseInt(st.nextToken());
		int sm = Integer.parseInt(st.nextToken());
		int ss = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " :");
		int eh = Integer.parseInt(st.nextToken());
		int em = Integer.parseInt(st.nextToken());
		int es = Integer.parseInt(st.nextToken());
		
		ss += (sm * 60) + (sh * 60 * 60);
		es += (em * 60) + (eh * 60 * 60);
		int s = es - ss;
		
		if (s < 0) {
			s += 86400;
		}
		
		bw.write(Integer.toString(s));
        bw.flush();
        bw.close();
        br.close();
	}
}