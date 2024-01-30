import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int nmax = 0;
		int mmax = 0;
		int num = 0;
		
		st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreElements()) {
			num = Integer.parseInt(st.nextToken());
			nmax = Math.max(nmax, num);
		}
		
		st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreElements()) {
			num = Integer.parseInt(st.nextToken());
			mmax = Math.max(mmax, num);
		}
		
		int result = nmax + mmax;
		System.out.println(result);
	}
}
