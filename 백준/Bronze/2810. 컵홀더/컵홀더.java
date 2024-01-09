import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split("");
		int count = 1;
		int pe = 0;
		
		for (int i = 0; i < n; i++) {
			if (str[i].equals("S")) {
				count++;
				pe++;
			} else {
				i++;
				count++;
				pe+=2;
			}
		}
		
		if (count <= pe) { 
			sb.append(count);
		} else {
			sb.append(pe);
		}
		
		System.out.println(sb);
	}
}