import java.io.*;
import java.util.*;

public class Main {
	
	static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		while (n-- > 0) {
			String s = br.readLine();
			count = 0;
			sb.append(isPalindrome(s)).append(" ").append(count).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static int recursion(String s, int l, int r){
		count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
	
	private static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}