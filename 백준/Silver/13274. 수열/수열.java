import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
				
		Integer count = Integer.valueOf(st.nextToken());
		Integer queryCount = Integer.valueOf(st.nextToken());
		long[] sequence = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::valueOf).toArray();
		Arrays.sort(sequence);
		List<int[]> LRX = new ArrayList<>();
		
		for (int i = 0; i < queryCount; i++) {
			LRX.add(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray());
		}
		
		for (int[] array : LRX) {
			int start = array[0] - 1;
			int end = array[1];
			int plus = array[array.length - 1];
			
			for (int i = start; i < end; i++) {
				sequence[i] += plus;
			}
			
			Arrays.sort(sequence);
		}
		
		bw.write(Arrays.stream(sequence).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
		bw.flush();
		bw.close();
		br.close();
	}
}
