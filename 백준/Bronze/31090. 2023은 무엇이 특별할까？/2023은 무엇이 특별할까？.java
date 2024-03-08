import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int a = n + 1;
			int b = n % 100;
			
			if (a % b == 0) {
				sb.append("Good\n");
			} else {
				sb.append("Bye\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
