import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i < 6; i++) {
			String[] name = br.readLine().split("");
			
			for (int j = 0; j < name.length - 2; j++) {
				if (name[j].equals("F")) {
					if (name[j + 1].equals("B")) {
						if (name[j + 2].equals("I")) {
							sb.append(i).append(" ");
							break;
						}
					}
				}
			}
		}
		
		if (sb.length() == 0) {
			sb.append("HE GOT AWAY!");
		}
		
		System.out.println(sb);
		
	}
}