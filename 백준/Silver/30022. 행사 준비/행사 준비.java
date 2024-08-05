import java.io.*;
import java.util.*;

public class Main {
	
	private static class Node implements Comparable<Node> {
		long dif;
		int index;
		
		public Node(long d, int i) {
			dif = d;
			index = i;
		}
		
		@Override
		public int compareTo(Node o) {
			return Long.compare(o.dif, dif);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 물건의 종류
		int a = Integer.parseInt(st.nextToken()); // 동하가 구매할 물건 수
		int b = Integer.parseInt(st.nextToken()); // 지원이가 구매할 물건 수
		
		// 서로의 차를 기준으로 정렬할 우선순위 큐
		PriorityQueue<Node> q = new PriorityQueue<>();
		long[] priceA = new long[n]; // 상점 1의 가격을 저장할 배열
		long[] priceB = new long[n]; // 상점 2의 가격을 저장할 배열
		
		// 서로의 차
		// 서로의 차를 이용하면 구매 횟수 제한을 고려하여, 전체 구매 비용을 최소화할 수 있습니다.
		// 서로의 차가 클수록 더 저렴한 상품을 고르는게 중요해집니다.
		long dif = 0; 
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			priceA[i] = Integer.parseInt(st.nextToken());
			priceB[i] = Integer.parseInt(st.nextToken());
			dif = Math.abs(priceA[i] - priceB[i]);
			q.add(new Node(dif, i));
		}
		
		long sum = 0;
		Node node;
		
		// 가격 차이가 큰 순으로 큐에서 나오게 된다.
		while (!q.isEmpty()) {
			node = q.poll();
			
			// 상점의 가격이 A가 클 경우
			if (priceA[node.index] > priceB[node.index]) {
				if (b > 0) { // B에서 구매가 가능하다면
					b--;
					sum += priceB[node.index];
				} else { // B에서 구매가 불가능하다면 
					a--;
					sum += priceA[node.index];
				}
				
			// 상점의 가격이 B가 클 경우
			} else if (priceA[node.index] < priceB[node.index]) {
				if (a > 0) { // A에서 구매가 가능하다면
					a--;
					sum += priceA[node.index];
				} else { // A에서 구매가 불가능하다면
					b--;
					sum += priceB[node.index];
				}
				
			// 두개의 가격이 같다면 어디에든 횟수를 -1을 할 수 있기 때문에 가격만 올려준다.
			} else {
				sum += priceA[node.index];
			}
		}
		
		bw.write(Long.toString(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}