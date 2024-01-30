import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder s = new StringBuilder(br.readLine());
		int count = 0;
		int num;
		
		while (true) {
			if (s.length() <= 3) {
				num = Integer.parseInt(s.toString());
				if (num <= 641) {
					count++;
					break;
				} else {
					count += 2;
					break;
				}
			} else {
				if (s.charAt(3) == '0') {
					count++;
					if (s.charAt(2) == '0') {
						s.delete(0, 1);
					} else {
						s.delete(0, 2);
					}
				} else {
					num = Integer.parseInt(s.substring(0, 3));
					count++;
					if (num <= 641) {
						s.delete(0, 3);
					} else {
						s.delete(0, 2);
					}
				}
			}
		}
		
		System.out.println(count);
	}
}