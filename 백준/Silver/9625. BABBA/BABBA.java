import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int bcount = 0;
		int acount = 1;
		
		while (n-- > 0) {
			int b = bcount;
			
			bcount += acount;
			acount = 0;
			acount += b;
		}
		
		sb.append(acount).append(" ").append(bcount);
		System.out.println(sb);
	}
}