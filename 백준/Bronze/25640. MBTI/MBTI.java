import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		while (n-- > 0) {
			String s = br.readLine();
			
			if (str.equals(s)) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}