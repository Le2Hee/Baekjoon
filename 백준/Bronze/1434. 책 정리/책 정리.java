import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int box = 0;
		int book = 0;
		
		st = new StringTokenizer(br.readLine());
		while (n-- > 0) {
			box += Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		while (m-- > 0) {
			book += Integer.parseInt(st.nextToken());
		}
		
		int sum = box - book;
		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}