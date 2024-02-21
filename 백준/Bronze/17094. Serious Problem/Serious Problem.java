import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int len = Integer.parseInt(br.readLine());
		char[] str = br.readLine().toCharArray();
		int c2 = 0;
		int ce = 0;
		
		for (int i = 0; i < len; i++) {
			if (str[i] == '2') {
				c2++;
			} else {
				ce++;
			}
		}
		
		bw.write(c2 == ce ? "yee" : c2 > ce ? "2" : "e");
		bw.flush();
		bw.close();
		br.close();
	}
}
