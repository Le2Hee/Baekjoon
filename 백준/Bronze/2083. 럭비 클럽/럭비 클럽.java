import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		StringTokenizer st;
		
		while (!(str = br.readLine()).equals("# 0 0")) {
			st = new StringTokenizer(str);
			String name = st.nextToken();
			int age = Integer.parseInt(st.nextToken()); 
			int weight = Integer.parseInt(st.nextToken());
			
			if (age > 17 || weight >= 80) {
				sb.append(name).append(" ").append("Senior").append("\n");
			} else {
				sb.append(name).append(" ").append("Junior").append("\n"); // 코드 1
			}
		}
		
		System.out.println(sb);
	}
}