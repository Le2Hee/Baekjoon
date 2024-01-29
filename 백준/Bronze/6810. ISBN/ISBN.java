import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder str = new StringBuilder("9780921418");
		str.append(br.readLine()).append(br.readLine()).append(br.readLine());
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if ((i + 1) % 2 == 0) {
				sum += (str.charAt(i) - '0') * 3;
			} else {
				sum += (str.charAt(i) - '0');
			}
		}
		
		str = new StringBuilder();
		str.append("The 1-3-sum is ").append(sum);
		System.out.println(str);
	}
}