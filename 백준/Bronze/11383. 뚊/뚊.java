import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		String s = "";
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder();
		
		for (int i = 0; i < h; i++) {
			s = br.readLine();
			for (int j = 0; j < w; j++) {
				str1.append(s.charAt(j)).append(s.charAt(j));
			}
		}
		
		for (int i = 0; i < h; i++) {
			s = br.readLine();
			for (int j = 0; j < 2 * w; j++) {
				str2.append(s.charAt(j));
			}
		}
		
		if (str1.toString().equals(str2.toString())) {
			System.out.println("Eyfa");
		} else {
			System.out.println("Not Eyfa");
		}
	}
}