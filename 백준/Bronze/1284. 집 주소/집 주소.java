import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String st;
		
		while (!(st = br.readLine()).equals("0")) {
			String[] str = st.split(""); 
			int sum = 2 + (str.length - 1);
			
			for (int i = 0; i < str.length; i++) {
				if (str[i].equals("1")) {
					sum += 2;
				} else if (str[i].equals("0")) {
					sum += 4;
				} else {
					sum += 3;
				}
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}
}