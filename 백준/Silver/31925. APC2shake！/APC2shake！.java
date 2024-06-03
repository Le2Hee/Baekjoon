import java.io.*;
import java.util.*;

public class Main {
	
	// 3가지 조건을 만족하는 사람들의 이름과 APC점수를 저장하는 클래스
	public static class Member {
		String name;
		int APCrank;
		
		public Member(String n, int a) {
			name = n;
			APCrank = a;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 참가자의 수
		
		List<Member> list = new LinkedList<>(); // 3가지 조건을 만족하는 사람들을 저장하는 리스트
		StringTokenizer st;
		String name, attendance, premier;
		int srank, arank;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			name = st.nextToken(); // 이름
			attendance = st.nextToken(); // 재학 여부
			premier = st.nextToken(); // ICPC 수상 여부
			srank = Integer.parseInt(st.nextToken()); // shake! 최고 성적
			arank = Integer.parseInt(st.nextToken()); // APC 성적
			
			// 3가지 조건에 만족하는 사람들만 저장한다.
			if (attendance.equals("jaehak") && premier.equals("notyet") && (srank == -1 || srank > 3)) {
				list.add(new Member(name, arank));
			}
		}
		
		// 3가지 조건을 만족하는 사람이 10명이 넘으면 APC점수로 나열해서 10명만 선정
		if (list.size() > 10) {
			Collections.sort(list, (o1, o2) -> o1.APCrank - o2.APCrank);
			
			int removeNum = list.size() - 10;
			
			while (removeNum-- > 0) {
				list.remove(10);
			}
		}
		
		// 이름을 사전순으로 정렬
		Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));
		sb.append(list.size()).append("\n"); // 총 참가자 수
		
		for (Member m : list) {
			sb.append(m.name).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}