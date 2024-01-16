import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), "CAMBRIDGE");
		
		while (st.hasMoreElements()) {
			sb.append(st.nextElement());
		}
		
		System.out.println(sb);
	}
}