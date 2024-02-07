import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[3];
		num[Integer.parseInt(st.nextToken())]++;
		num[Integer.parseInt(st.nextToken())]++;
		num[Integer.parseInt(st.nextToken())]++;
		
		if (num[1] > num[2]) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}
	}
}