import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine(), result = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", sub = "";
		
		StringBuilder a, b, c;
		for (int i = 0; i < s.length() - 2; i++) {
			a = new StringBuilder();
			a.append(s.substring(0, i + 1)).reverse();
			
			for (int j = i + 1; j < s.length() - 1; j++) {
				b = new StringBuilder();
				c = new StringBuilder();
				
				b.append(s.substring(i + 1, j + 1)).reverse();
				c.append(s.substring(j + 1, s.length())).reverse();
				
				sub = a.toString() + b.toString() + c.toString();
				if (result.compareTo(sub) > 0) {
					result = sub;
				}
			}
		}
		
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
}