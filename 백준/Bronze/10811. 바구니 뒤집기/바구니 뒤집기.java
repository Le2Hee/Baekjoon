import java.io.*;
import java.util.*;

public class Main {
	
	static int[] numbers;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 바구니 개수
        int m = Integer.parseInt(st.nextToken()); // 테스트 케이스
        numbers = new int[n];
        
        for (int i = 0; i < n; i++) {
        	numbers[i] = i + 1;
        }
        
        while (m-- > 0) {
        	st = new StringTokenizer(br.readLine());
        	int start = Integer.parseInt(st.nextToken());
        	int end = Integer.parseInt(st.nextToken());
        	
        	baguni(start - 1, end - 1);
        }
        
        for (int num : numbers) {
        	sb.append(num).append(" ");
        }
        
        System.out.println(sb);
    }
    
    private static void baguni(int start, int end) {
    	int num = end - start + 1;
    	int number = start + (num / 2);
    	
    	if (num % 2 == 0) {
    		for (int i = 0; i < num / 2; i++) {
    			int min = number - 1 - i;
    			int max = number + i;
    			
    			int sub = numbers[min];
    			numbers[min] = numbers[max];
    			numbers[max] = sub;
    		}
    	} else {
    		for (int i = 0; i <= num / 2; i++) {
    			int min = number - i;
    			int max = number + i;
    			
    			int sub = numbers[min];
    			numbers[min] = numbers[max];
    			numbers[max] = sub;
    		}
    	}
    }
}
