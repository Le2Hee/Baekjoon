import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] numbers = new int[100000001];
        int max = 0;
        int min = Integer.MAX_VALUE;
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
        	int num = Integer.parseInt(st.nextToken());
        	numbers[num] = 1;
        	max = Math.max(max, num);
        	min = Math.min(min, num);
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
        	int num = Integer.parseInt(st.nextToken());
        	if (numbers[num] == 1) {
        		numbers[num] = 3;
        	} else {
        		numbers[num] = 2;
        	}
        	max = Math.max(max, num);
        	min = Math.min(min, num);
        }
        
        int count = 0;
        
        for (int i = min; i <= max; i++) {
        	if (numbers[i] == 1 || numbers[i] == 2) {
        		count++;
        	}
        }
        
        System.out.println(count);
    }
}
