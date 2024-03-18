import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		int a = n / 100 * 78;
		int b = (n / 100 * 80) + ((n / 100 * 20) / 100 * 78);
		
		sb.append(a).append(" ").append(b);
		bw.write(sb.toString()); 
		bw.flush();
		bw.close();
		br.close();
	}
}
