import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String val1 = br.readLine();
		String val2 = br.readLine();
		String mul = br.readLine();
		String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		
		long sum = 0;
		long m = 0;
		
		for (int i = 0; i < 10; i++) {
			if (val1.equals(color[i])) {
				sum += i * 10;
			}
			
			if (val2.equals(color[i])) {
				sum += i;
			}
			
			if (mul.equals(color[i])) {
				m = (int) Math.pow(10, i);
			}
		}
		
		sb.append(sum * m);
		System.out.println(sb);
    }
}