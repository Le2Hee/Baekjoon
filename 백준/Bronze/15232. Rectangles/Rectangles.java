import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int h = Integer.parseInt(br.readLine());
		int w = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
