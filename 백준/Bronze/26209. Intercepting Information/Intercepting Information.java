import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean check = true;
		
		while (st.hasMoreElements()) {
			int n = Integer.parseInt(st.nextToken());
			if (n == 9) {
				check = false;
				break;
			}
		}
		
		if (check) {
			System.out.println("S");
		} else {
			System.out.println("F");
		}
	}
}