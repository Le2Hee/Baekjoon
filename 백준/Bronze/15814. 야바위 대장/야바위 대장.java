import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		char[] arr = br.readLine().toCharArray();
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int idxa = Integer.parseInt(st.nextToken());
			int idxb = Integer.parseInt(st.nextToken());
			
			char c = arr[idxa];
			arr[idxa] = arr[idxb];
			arr[idxb] = c;
		}
		
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
