import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		int count = 0;
		
		while (!((str = br.readLine()).equals("0"))) {
			count++;
			String[] arr = str.split(" ");
			int r = Integer.parseInt(arr[0]);
			int w = Integer.parseInt(arr[1]);
			int l = Integer.parseInt(arr[2]);
			
			if (Math.pow(r + r, 2) >= Math.pow(w, 2) + Math.pow(l, 2)) {
				sb.append("Pizza ").append(count).append(" fits on the table.");
			} else {
				sb.append("Pizza ").append(count).append(" does not fit on the table.");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}