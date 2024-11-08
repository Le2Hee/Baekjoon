import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 문자열의 길이
		char[] arr = br.readLine().toCharArray();
		
		List<Integer> pIndex = new ArrayList<>();
		List<Integer> cIndex = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			if (arr[i] == 'P') {
				pIndex.add(i);
			} else if (arr[i] == 'C') {
				cIndex.add(i);
			}
		}
		
		for (int i = 0; i < (pIndex.size() < cIndex.size() ? pIndex.size() : cIndex.size()); i++) {
			arr[pIndex.get(i)] = 'C';
			arr[cIndex.get(i)] = 'P';
		}
		
		for (char c : arr) {
			sb.append(c);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}