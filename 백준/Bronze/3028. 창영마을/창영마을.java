import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		boolean[] cup = new boolean[3];
		cup[0] = true;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				if (cup[0] || cup[1]) {
					cup[0] = !cup[0];
					cup[1] = !cup[1];
				}
			} else if (s.charAt(i) == 'B') {
				if (cup[1] || cup[2]) {
					cup[1] = !cup[1];
					cup[2] = !cup[2];
				}
			} else if (s.charAt(i) == 'C') {
				if (cup[0] || cup[2]) {
					cup[0] = !cup[0];
					cup[2] = !cup[2];
				}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			if (cup[i]) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}