import java.io.*;
import java.util.*;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		int count = 0;
		String name = "";
		
		while (!(str = br.readLine()).equals("0 0 0")) {
			count++;
			String[] arr = str.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int c = Integer.parseInt(arr[2]);
			double val = 0;
			
			if (a == -1) {
				name = "a";
				if (Math.pow(b, 2) >= Math.pow(c, 2)) {
					print(count, name, val);
				} else {
					val = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
					print(count, name, val);
				}
			} else if (b == -1) {
				name = "b";
				if (Math.pow(a, 2) >= Math.pow(c, 2)) {
					print(count, name, val);
				} else {
					val = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
					print(count, name, val);
				}
			} else {
				name = "c";
				val = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
				print(count, name, val);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static void print(int count, String name, double val) {
		if (val != 0) {
			String str = String.format("%.3f", val);
			sb.append("Triangle #").append(count).append("\n").append(name).append(" = ").append(str).append("\n");
		} else {
			sb.append("Triangle #").append(count).append("\n").append("Impossible.").append("\n");
		}
	}
}