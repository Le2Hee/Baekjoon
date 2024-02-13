import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int count = s.length() + 2;
		StringTokenizer st = new StringTokenizer(s, "_", true);
		
		while (st.hasMoreElements()) {
			s = st.nextToken();
			
			if (s.equals("_")) {
				count += 5;
			}
		}
		
		System.out.println(count);
	}
}