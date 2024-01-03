import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < 2 * n - 1; i++) {
        	if (i < n) {
        		for (int j = 0; j < 2 * n; j++) {
            		if (i >= j || j >= 2 * n - 1 - i) {
            			sb.append("*");
            		} else {
            			sb.append(" ");
            		}
            		
            	}
        	} else {
        		for (int j = 2 * n; j > 0; j--) {
        			if (j < i + 2 && j > 2 * n - 1 - i) {
        				sb.append(" ");
        			} else {
        				sb.append("*");
        			}
        		}
        	}
        	sb.append("\n");
        }
        
        System.out.println(sb);
    }
}