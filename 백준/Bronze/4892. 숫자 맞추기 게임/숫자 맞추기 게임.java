import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		int count = 0;
		
		while (!(str = br.readLine()).equals("0")) {
			count++;
			sb.append(count).append(". ");
			int n = Integer.parseInt(str);
			n *= 3;
			if (n % 2 == 0) {
				sb.append("even ");
			} else {
				sb.append("odd ");
				n++;
				
			}
			n /= 2;
			n *= 3;
			n /= 9;
			sb.append(n).append("\n");
		}
		
		System.out.println(sb);
	}
}