import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		if (n >= 3 && 4 >= m) {
			sb.append("TroyMartian").append("\n");
		}
		
		if (6 >= n && 2 <= m) {
			sb.append("VladSaturnian").append("\n");
		}
		
		if (2 >= n && 3 >= m) {
			sb.append("GraemeMercurian");
		}
		
		System.out.println(sb);
	}
}