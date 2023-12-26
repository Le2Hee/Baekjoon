import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine()); // n개의 수
		Stack<Integer> stack = new Stack<>();
		int current = 1; // 현재 수열에 넣어야 하는 수
		boolean valid = true;

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());

			while (current <= num) {
				stack.push(current);
				sb.append("+").append("\n");
				current++;
			}

			if (stack.isEmpty() || stack.peek() != num) {
				valid = false;
				break;
			}

			stack.pop();
			sb.append("-").append("\n");
		}

		if (valid) {
			System.out.println(sb);
		} else {
			System.out.println("NO");
		}
	}
}