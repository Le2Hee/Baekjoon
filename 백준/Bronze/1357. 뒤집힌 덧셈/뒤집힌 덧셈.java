import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sbf = new StringBuffer(st.nextToken());
		int nx = Integer.parseInt(sbf.reverse().toString());
		
		sbf = new StringBuffer(st.nextToken());
		int ny = Integer.parseInt(sbf.reverse().toString());
		int sum = nx + ny;
		sbf = new StringBuffer(String.valueOf(sum));
		sbf.reverse();
		int result = Integer.parseInt(sbf.toString());
		System.out.println(result);
	}
}