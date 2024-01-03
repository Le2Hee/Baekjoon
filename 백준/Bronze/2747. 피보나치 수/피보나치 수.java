import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[46];
        numbers[0] = 0;
        numbers[1] = 1;
        
        for (int i = 2; i <= n; i++) {
        	numbers[i] = numbers[i - 2] + numbers[i - 1];
        }
        
        System.out.println(numbers[n]);
    }
}