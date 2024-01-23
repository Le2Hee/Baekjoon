import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		double c = Double.parseDouble(st.nextToken());
		double d = Double.parseDouble(st.nextToken());
		
		int count = 0;
		double fi = a / c + b / d;
		double tw = c / d + a / b;
		double th = d / b + c / a;
		double fo = b / a + d / c;
		double max = Math.max(fi, tw);
		max = Math.max(max, th);
		max = Math.max(max, fo);
		
		if (max == fi) {
			count = 0;
		} else if (max == tw) {
			count = 1;
		} else if (max == th) {
			count = 2;
		} else {
			count = 3;
		}
		
		System.out.println(count);
	}
}