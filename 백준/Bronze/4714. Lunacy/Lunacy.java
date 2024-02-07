import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		
		while (true) {
			s = br.readLine();
			double n = Double.parseDouble(s);
			
			if (n < 0) {
				break;
			}
			
			s = String.format("%.2f", n);
			sb.append("Objects weighing ").append(s).append(" on Earth will weigh ");
			
			n *= 0.167;
			s = String.format("%.2f", n);
			sb.append(s).append(" on the moon.\n");
		}
		
		System.out.println(sb);
	}
}
