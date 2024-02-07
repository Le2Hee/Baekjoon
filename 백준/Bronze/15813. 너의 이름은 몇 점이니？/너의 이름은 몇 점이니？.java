import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) - 'A' + 1;
		}
		
		System.out.println(sum);
	}
}