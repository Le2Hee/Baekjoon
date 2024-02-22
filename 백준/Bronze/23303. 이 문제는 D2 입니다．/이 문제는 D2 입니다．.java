import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String a = br.readLine();
		boolean ch = false;
		a = a.replaceAll("D2", "!");
		a = a.replaceAll("d2", "!");
		
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '!') {
				ch = true;
				break;
			}
		}
		
		bw.write(ch ? "D2" : "unrated");
		bw.flush();
		bw.close();
		br.close();
	}
}
