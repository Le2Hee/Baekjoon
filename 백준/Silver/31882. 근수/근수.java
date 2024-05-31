import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		br.readLine(); // 문자열의 길이
		StringTokenizer st = new StringTokenizer(br.readLine(), "134567890"); // 문자열을 2를 제외하고 없애준다.
		
		BigInteger[] score = new BigInteger[1000001]; // 전체 스코어를 저장한다.
		score[1] = BigInteger.valueOf(1);
		score[2] = BigInteger.valueOf(4);
		
		for (int i = 3; i < 1000001; i++) {
			// 뒤에 2번째에 있는것 보다 i * i 를 더하면 그 길이에 맞는 총 점수가 나온다.
			score[i] = new BigInteger(String.valueOf(score[i - 2].add(BigInteger.valueOf(i).multiply(BigInteger.valueOf(i)))));
		}
		
		BigInteger count = BigInteger.valueOf(0); // 총 근수
		while (st.hasMoreElements()) {
			count = count.add(score[st.nextToken().length()]); // 문자열 길이로 총 근수 합을 구한다.
		}
		
		bw.write(count.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}