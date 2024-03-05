import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int sum;
		while (t-- > 0) {
			sum = 0;
			
			st = new StringTokenizer(br.readLine());
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			double c = Double.parseDouble(st.nextToken());
			double d = Double.parseDouble(st.nextToken());
			double e = Double.parseDouble(st.nextToken());
			double f = Double.parseDouble(st.nextToken());
			double g = Double.parseDouble(st.nextToken());
			
			sum = hurdles100m(a) + highJump(b) + shotPut(c) + run200m(d) + longJump(e) + javelin(f) + run800m(g);
			sb.append(sum).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int hurdles100m(double num) {
		return (int)(9.23076 * Math.pow(26.7 - num, 1.835));
	}
	
	private static int highJump(double num) {
		return (int)(1.84523 * Math.pow(num - 75, 1.348));
	}
	
	private static int shotPut(double num) {
		return (int)(56.0211 * Math.pow(num - 1.5, 1.05));
	}
	
	private static int run200m(double num) {
		return (int)(4.99087 * Math.pow(42.5 - num, 1.81));
	}
	
	private static int longJump(double num) {
		return (int)(0.188807 * Math.pow(num - 210, 1.41));
	}
	
	private static int javelin(double num) {
		return (int)(15.9803 * Math.pow(num - 3.8, 1.04));
	}
	
	private static int run800m(double num) {
		return (int)(0.11193 * Math.pow(254 - num, 1.88));
	}
}