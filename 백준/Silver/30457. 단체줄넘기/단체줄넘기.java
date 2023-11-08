import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[n];
		int max = 0;
		int index = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());

			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}

		arr[index] = 0;
		int count = 1;
		index = count;
		Arrays.sort(arr);

		for (int i = n - 1; i >= index; i--) {
			if (arr[i] != 0 && max > arr[i]) {
				max = arr[i];
				arr[i] = 0;
				count++;
			}
		}

		if (count != n) {
			max = 0;
			index = 0;
			count++;

			for (int i = 0; i < n; i++) {
				if (max < arr[i]) {
					max = arr[i];
					index = i;
				}
			}

			arr[index] = 0;
			index = count;
			Arrays.sort(arr);

			for (int i = n - 1; i >= index; i--) {
				if (arr[i] != 0 && max > arr[i]) {
					max = arr[i];
					arr[i] = 0;
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}