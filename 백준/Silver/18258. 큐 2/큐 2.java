import java.io.*;
import java.util.*;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	static int[] numbers = new int[2000000];
	
	static int size = 0; 
	static int front = 0; // 맨 앞 인덱스
	static int back = 0;  // 맨 뒤 인덱스
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        while (n-- > 0) {
        	st  = new StringTokenizer(br.readLine());
        	
        	switch (st.nextToken()) {
			case "push" : 
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				pop();
				break;
			case "size":
				size();
				break;
			case "empty":
				empty();
				break;
			case "front":
				front();
				break;
			case "back":
				back();
				break;
			}
        }
        
        System.out.println(sb);
    }
    
    private static void push(int num) {
    	numbers[back] = num;
    	back++;
    	size++;
    }
    
    private static void pop() {
    	if (size == 0) {
    		sb.append(-1).append("\n");
    	} else {
    		sb.append(numbers[front]).append("\n");
    		size--;
    		front++;
    	}
    }
    
    private static void size() {
    	sb.append(size).append("\n");
    }
    
    private static void empty() {
    	if (size == 0) {
    		sb.append(1).append("\n");
    	} else {
    		sb.append(0).append("\n");
    	}
    }
    
    private static void front() {
    	if (size == 0) {
    		sb.append(-1).append("\n");
    	} else {
    		sb.append(numbers[front]).append("\n");
    	}
    }
    
    private static void back() {
    	if (size == 0) {
    		sb.append(-1).append("\n");
    	} else {
    		sb.append(numbers[back - 1]).append("\n");
    	}
    }
}