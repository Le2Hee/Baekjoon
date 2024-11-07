import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 문제의 개수
		int count = 0;
		
		int rank;
		while (n-- > 0) {
			rank = Integer.parseInt(br.readLine()); // 문제의 난이도
			
			if (rank % 2 == 1) {
				count++;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
