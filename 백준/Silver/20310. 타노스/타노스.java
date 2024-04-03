import java.io.*;
import java.util.*;

public class Main {
	
	static char[] arr;
	static int[] num;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		arr = br.readLine().toCharArray();
		num = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			if (num[i] == 0) {
				if (arr[i] == '1') {
					num[i] = 2;
					func(i, 1);
				} else {
					num[i] = 1;
					func(i, 0);
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (num[i] == 1) {
				sb.append(arr[i]);
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void func(int index, int n) {
		for (int i = arr.length - 1; i > index; i--) {
			if (n == 0) {
				if (arr[i] == '0' && num[i] == 0) {
					num[i] = 2;
					break;
				}
			} else {
				if (arr[i] == '1' && num[i] == 0) {
					num[i] = 1;
					break;
				}
			}
		}
	}
}