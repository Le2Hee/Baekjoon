import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (; ;) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()); // 상근이가 가지고 있는 CD 수
			int m = Integer.parseInt(st.nextToken()); // 선영이가 가지고 있는 CD 수
			
			if (n == 0 && m == 0) {
				break;
			}

			int[] nArr = new int[n];
			int[] mArr = new int[m];

			for (int i = 0; i < n + m; i++) {
				int num = Integer.parseInt(br.readLine());

				if (i < n) {
					nArr[i] = num;
				} else {
					mArr[i - n] = num;
				}
			}

			int count = 0;
			int index = 0;

			for (int i = 0; i < n; i++) {
				for (int j = index; j < m; j++) {
					if (nArr[i] == mArr[j]) {
						count++;
						index = j;
						break;
					} else if (nArr[i] < mArr[j]) {
						break;
					}
				}
			}

			System.out.println(count);
		}

		br.close();
	}
}