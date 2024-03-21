import java.io.*;
import java.util.*;

public class Main {
	
	static List<Boolean[][]> list = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		Boolean[][] map;
		char[] arr;
		
		for (int k = 0; k < n; k++) {
			map = new Boolean[5][7];
			
			for (int i = 0; i < 5; i++) {
				arr = br.readLine().toCharArray();
				for (int j = 0; j < 7; j++) {
					if (arr[j] == '.') {
						map[i][j] = false;
					} else {
						map[i][j] = true;
					}
				}
			}
			
			list.add(map);
		}
		
		List<int[]> resultList = new LinkedList<>();
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int[] nums = new int[3];
				nums[0] = check(list.get(i), list.get(j));
				nums[1] = i + 1;
				nums[2] = j + 1;
				resultList.add(nums);
			}
		}
		
		Collections.sort(resultList, (o1, o2) -> o1[0] - o2[0]);
		sb.append(resultList.get(0)[1]).append(" ").append(resultList.get(0)[2]);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int check(Boolean[][] a, Boolean[][] b) {
		int count = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if (a[i][j] != b[i][j]) {
					count++;
				}
			}
		}
		
		return count;
	}
}