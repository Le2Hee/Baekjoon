import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		StringBuilder str;
		
		while (!(s = br.readLine()).equals("***")) {
			str = new StringBuilder(s);
			str.reverse();
			sb.append(str.toString()).append("\n");
		}
		
		System.out.println(sb);
	}
}