import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str;
		
		while (!(str = br.readLine()).equals("END")) {
			StringBuffer sbf = new StringBuffer(str);
			sbf.reverse();
			sb.append(sbf).append("\n");
		}
		
		System.out.println(sb);
	}
}