import java.io.*;
import java.util.*;

public class Main {

	static Integer[] numbers;
	static int[] nums;
	static String[] colors;
	static int methodMaxNum = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 5;
		StringTokenizer st;
		colors = new String[5];
		numbers = new Integer[5];
		int max = 0;
		nums = new int[10];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			colors[i] = st.nextToken();
			numbers[i] = Integer.parseInt(st.nextToken());
			nums[numbers[i]]++;
		}

		HashSet<String> set = new HashSet<>(Arrays.asList(colors));
		if (set.size() == 1) {
			if (continuous()) { // 1
				max = Math.max(max, methodMaxNum + 900);
			} else { // 4
				max = Math.max(max, methodMaxNum + 600);
			}
		}
		
		if (continuous()) { // 5
			max = Math.max(max, methodMaxNum + 500);
		}
		
		int code = numberCount();
		
		if (code == 2) {
			int m = 0;
			for (int i = 1; i < 10; i++) {
				if (nums[i] == 4) {
					m = i;
					break;
				}
			}
			max = Math.max(max, m + 800);
		} else if (code == 3) {
			int three = 0;
			int two = 0;
			for (int i = 1; i < 10; i++) {
				if (nums[i] == 3) {
					three = i;
				} else if (nums[i] == 2) {
					two = i;
				}
				if (three != 0 && two != 0) {
					break;
				}
			}
			max = Math.max(max, three * 10 + two + 700);
		} else if (code == 6) {
			int m = 0;
			for (int i = 1; i < 10; i++) {
				if (nums[i] == 3) {
					m = i;
					break;
				}
			}
			max = Math.max(max, m + 400);
		} else if (code == 7) {
			int b = 0;
			int s = 0;
			for (int i = 1; i < 10; i++) {
				if (nums[i] == 2) {
					if (s == 0) {
						s = i;
					} else {
						b = i;
						break;
					}
				}
			}
			max = Math.max(max, b * 10 + s + 300);
		} else if (code == 8) {
			int m = 0;
			for (int i = 1; i < 10; i++) {
				if (nums[i] == 2) {
					m = i;
					break;
				}
			}
			max = Math.max(max, m + 200);
		} else if (code == 9) {
			int m = 0;
			for (int i = 1; i < 10; i++) {
				if (nums[i] == 1) {
					m = i;
				}
			}
			max = Math.max(max, m + 100);
		}
		
		System.out.println(max);
	}

	private static boolean continuous() {
		boolean result = true;
		List<Integer> list = new LinkedList<>(Arrays.asList(numbers));
		Collections.sort(list);

		for (int i = 0; i < 4; i++) {
			if (list.get(i + 1) - list.get(i) != 1) {
				result = !result;
				break;
			}
		}

		methodMaxNum = list.get(4);
		return result;
	}

	private static int numberCount() {
		int code = 0;
		
		int two = 0;
		int three = 0;
		int four = 0;
		
		for (int i = 1; i < 10; i++) {
			switch (nums[i]) {
			case 2: two++; break;
			case 3: three++; break;
			case 4: four++; break;
			}
		}
		
		if (four == 1) {
			code = 2;
		} else if (three == 1 && two == 1) {
			code = 3;
		} else if (three == 1) {
			code = 6;
		} else if (two == 2) {
			code = 7;
		} else if (two == 1) {
			code = 8;
		} else {
			code = 9;
		}

		return code;
	}
}