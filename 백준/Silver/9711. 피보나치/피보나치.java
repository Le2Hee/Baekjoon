import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		int max = 0;
		List<int[]> list = new LinkedList<>();
		
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			max = Math.max(a, max);
			int[] arr = {a, b};
			
			list.add(arr);
		}
		
		BigInteger[] pn = new BigInteger[max == 1 ? 2 : max];
		pn[0] = BigInteger.valueOf(1);
		pn[1] = BigInteger.valueOf(1);
		
		for (int i = 2; i < max; i++) {
			pn[i] = pn[i - 2].add(pn[i - 1]);
		}
		
		for (int i = 0; i < list.size(); i++) {
			sb.append("Case #").append(i + 1).append(": ").append(pn[list.get(i)[0] - 1].remainder((BigInteger.valueOf(list.get(i)[1])))).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}