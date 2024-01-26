import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = "";
		int sum = Integer.parseInt(br.readLine());
		
		while (!(s = br.readLine()).equals("=")) {
			if (s.charAt(0) == '+') {
				sum += Integer.parseInt(br.readLine());
			} else if (s.charAt(0) == '-') {
				sum -= Integer.parseInt(br.readLine());
			} else if (s.charAt(0) == '*') {
				sum *= Integer.parseInt(br.readLine());
			} else {
				sum /= Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println(sum);
	}
}