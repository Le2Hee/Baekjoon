import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		
		while (st.hasMoreElements()) {
			String name = st.nextToken();
			sb.append(name.charAt(0));
		}
		
		System.out.println(sb);
    }
}