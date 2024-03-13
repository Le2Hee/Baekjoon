import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		boolean[] visit = new boolean[n1 + n2];
		StringBuilder o = new StringBuilder(br.readLine()).reverse();
		char[] one = o.toString().toCharArray();
		char[] two = br.readLine().toCharArray();
		char[] ant = new char[n1 + n2];
		
		for (int i = 0; i < n1; i++) {
			ant[i] = one[i];
			visit[i] = true;
		}
		
		for (int i = n1; i < n1 + n2; i++) {
			ant[i] = two[i - n1];
		}
		
		int time = Integer.parseInt(br.readLine());
		
		while (time-- > 0) {
			for (int i = 0; i < n1 + n2 - 1; i++) {
				if ((visit[i] && !visit[i + 1])) {
					char sub = ant[i];
					ant[i] = ant[i + 1];
					ant[i + 1] = sub;
					
					visit[i] = !visit[i];
					visit[i + 1] = !visit[i + 1];
					
					i++;
				}
			}
		}
		
		for (int i = 0; i < n1 + n2; i++) {
			sb.append(ant[i]);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}	
