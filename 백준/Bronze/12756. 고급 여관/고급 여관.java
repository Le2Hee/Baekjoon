import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int aA = Integer.parseInt(st.nextToken());
		int hA = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int aB = Integer.parseInt(st.nextToken());
		int hB = Integer.parseInt(st.nextToken());
		
		while (hA > 0 && hB > 0) {
			hA -= aB;
			hB -= aA;
		}
		
		if (hA <= 0 && hB <= 0) {
			System.out.println("DRAW");
		} else if (hA <= 0) {
			System.out.println("PLAYER B");
		} else {
			System.out.println("PLAYER A");
		}
	}
}