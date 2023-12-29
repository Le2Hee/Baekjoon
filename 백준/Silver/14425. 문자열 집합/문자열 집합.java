import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        String[] narr = new String[n];
        String[] marr = new String[m];
        
        for (int i = 0; i < n; i++) {
        	String str = br.readLine();
        	narr[i] = str;
        }
        
        for (int i = 0; i < m; i++) {
        	String str = br.readLine();
        	marr[i] = str;
        }
        
        int count = 0;
        
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		if (marr[i].equals(narr[j])) {
        			count++;
        			break;
        		}
        	}
        }
        
        System.out.println(count);
    }
}
