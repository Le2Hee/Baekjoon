import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		double[] num = new double[n];
		for (int i = 0; i < n; i++) {
			num[i] = Double.parseDouble(br.readLine());
		}
		
		Arrays.sort(num);
		
		double cut = 0;
		double cor = 0;
		double sum = 0;
		
		for (int i = k; i < n - k; i++) {
			sum += num[i];
		}
		
		cut = sum / (n - 2 * k) + 1e-8;
		
		for (int i = 0; i < k; i++) {
			sum += num[k] + num[n - k - 1];
		}
		
		cor = sum / n + 1e-8;
		
		sb.append(String.format("%.2f", cut)).append("\n").append(String.format("%.2f", cor));
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}