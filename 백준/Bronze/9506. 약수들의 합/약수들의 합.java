import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String str;
        
        while (!(str = br.readLine()).equals("-1")) {
        	int num = Integer.parseInt(str);
        	List<Integer> list = new LinkedList<Integer>();
        	int sum = divisor(num, list);
        	
        	sb.append(num);
        	
        	if (sum == num) {
        		sb.append(" = ");
        		
        		for (int i = 0; i < list.size(); i++) {
        			sb.append(list.get(i));
        			if (i != list.size() - 1) {
        				sb.append(" + ");
        			}
        		}
        	} else {
        		sb.append(" is NOT perfect.");
        	}
        	
        	sb.append("\n");
        }
        
       System.out.println(sb);
    }
    
    private static int divisor(int num, List<Integer> list) {
    	int result = 0;
    	
    	for (int i = 1; i < num; i++) {
    		if (num % i == 0) {
    			list.add(i);
    			result += i;
    		}
    	}
    	
    	return result;
    }
}