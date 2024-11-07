import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 진행되는 날짜
		int a = Integer.parseInt(st.nextToken()); // 칭찬하면 자라는 길이
		int b = Integer.parseInt(st.nextToken()); // 비난하면 자라는 길이
		
		int compliment = 1; // 칭찬양파
		int rebuke = 1; // 비난양파
		
		int sub = 0;
		while (n-- > 0) {
			compliment += a;
			rebuke += b;
			
			if (compliment < rebuke) {
				sub = compliment;
				compliment = rebuke;
				rebuke = sub;
			} else if (compliment == rebuke) {
				rebuke--;
			}
		}
		
		sb.append(compliment).append(" ").append(rebuke);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}