import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int now = Math.abs(end - start);
		int apoint = Math.abs(start - a) + Math.abs(end - b);
		int bpoint = Math.abs(start - b) + Math.abs(end - a);
		
		bw.write(Integer.toString(Math.min(now, Math.min(apoint, bpoint))));
		bw.flush();
		bw.close();
		br.close();
	}
}