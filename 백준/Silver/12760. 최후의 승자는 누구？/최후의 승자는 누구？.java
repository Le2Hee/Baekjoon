import java.io.*;
import java.util.*;

public class Main {
	
	public static class Player {
		int number;
		Integer[] card;
		
		public Player(int n, Integer[] c) {
			card = new Integer[c.length];
			number = n;

			for (int i = 0; i < c.length; i++) {
				card[i] = c[i];
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 플레이어의 수
		int m = Integer.parseInt(st.nextToken()); // 가진 카드의 수
		
		// 플레이어들의 점수를 저장하는 배열
		int[] score = new int[n + 1];
		
		List<Player> list = new LinkedList<>();
		Integer[] subcard = new Integer[m];
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < m; j++) {
				subcard[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(subcard, (o1, o2) -> o2 - o1);
			list.add(new Player(i, subcard));
		}
		
		int max, scoreMax = 0;
		for (int i = 0; i < m; i++) {
			max = 0;
			
			for (int j = 0; j < n; j++) {
				max = Math.max(list.get(j).card[i], max);
			}
			
			for (int j = 0; j < n; j++) {
				if (list.get(j).card[i] == max) {
					score[list.get(j).number]++;
					scoreMax = Math.max(score[list.get(j).number], scoreMax);
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			if (score[i] == scoreMax) {
				sb.append(i).append(" ");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}