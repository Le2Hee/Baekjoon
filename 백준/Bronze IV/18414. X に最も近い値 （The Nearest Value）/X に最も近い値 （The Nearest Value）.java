import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		int min = Integer.MAX_VALUE;
		int num = 0;
		
		for (int i = l; i <= r; i++) {
			if (min > Math.abs(x - i)) {
				min = Math.abs(x - i);
				num = i;
			}
		}
		
		bw.write(Integer.toString(num));
        bw.flush();
        bw.close();
        br.close();
	}
}