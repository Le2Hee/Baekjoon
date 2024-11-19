import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int[] score = {13, 7, 5, 3, 3, 2}; // 차, 포, 마, 상, 사, 졸(병)의 점수
		StringTokenizer co = new StringTokenizer(br.readLine()); // 척이의 기물
		StringTokenizer ek = new StringTokenizer(br.readLine()); // 은규의 기물
		
		double coSum = 0;		// 초나라의 기물 점수
		double ekSum = 1.5;		// 한나라의 기물 점수
		
		for (int i = 0; i < 6; i++) {
			coSum += score[i] * Integer.parseInt(co.nextToken());
			ekSum += score[i] * Integer.parseInt(ek.nextToken());
		}
		
		// 초나라의 기물 점수가 높다면
		if (coSum > ekSum) {
			sb.append("cocjr0208");
			
		// 한나라의 기물 점수가 높다면
		} else {
			sb.append("ekwoo");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}