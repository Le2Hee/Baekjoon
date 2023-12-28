import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        int xmin = Integer.MAX_VALUE;
        int xmax = Integer.MIN_VALUE;
        int ymin = Integer.MAX_VALUE;
        int ymax = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());
        	xmin = Math.min(xmin, x);
        	xmax = Math.max(xmax, x);
        	ymin = Math.min(ymin, y);
        	ymax = Math.max(ymax, y);
        }
        
        int width = xmax - xmin;
        int length = ymax - ymin;
        Math.abs(width);
        Math.abs(length);
        
        System.out.println(width * length);
    }
}