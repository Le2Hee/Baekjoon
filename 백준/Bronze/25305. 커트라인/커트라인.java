import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Integer[] numbers = new Integer[n];
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
        	numbers[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers[k - 1]);
    }
}