import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ab = Integer.parseInt(st.nextToken());
		double bc = Double.parseDouble(st.nextToken());
		int cd = Integer.parseInt(st.nextToken());
		double result = (ab * cd) / bc;
		sb.append(result);
		System.out.println(sb);
	}
}