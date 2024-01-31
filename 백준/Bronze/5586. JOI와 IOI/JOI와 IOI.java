import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		int JOIcount = 0;
		int IOIcount = 0;
		
		for (int i = 0; i < s.length() - 2; i++) {
			if (s.charAt(i) == 'J' && s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'I') {
				JOIcount++;
			} else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'I') {
				IOIcount++;
			}
		}
		
		sb.append(JOIcount).append("\n").append(IOIcount);
		System.out.println(sb);
	}
}