import java.io.*;
import java.util.*;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	static int n;
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		int num = n;
		sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.").append("\n");
		recursion();
		endString(num);
		
		System.out.println(sb);
	}
	
	private static void recursion() {
		String str = "";
		for (int i = 0; i < count; i++) {
			str += "____";
		}
		
		if (count != n) {
			sb.append(str).append("\"재귀함수가 뭔가요?\"").append("\n");
			sb.append(str).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.").append("\n");
			sb.append(str).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.").append("\n");
			sb.append(str).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"").append("\n");
			count++;
			recursion();
		} else {
			sb.append(str).append("\"재귀함수가 뭔가요?\"").append("\n");
			sb.append(str).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"").append("\n");
		}
	}
	
	private static void endString(int num) {
		String str = "";
		for (int i = 0; i < num; i++) {
			str += "____";
		}
		
		sb.append(str).append("라고 답변하였지.").append("\n");
		num--;
		
		if (num >= 0) {
			endString(num);
		}
	}
}