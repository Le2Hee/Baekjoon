import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		StringBuilder res = new StringBuilder(s);
		res.reverse();
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != res.toString().charAt(i)) {
				count++;
			}
		}
		
		bw.write(Integer.toString(count / 2));
		bw.flush();
		bw.close();
		br.close();
	}
}