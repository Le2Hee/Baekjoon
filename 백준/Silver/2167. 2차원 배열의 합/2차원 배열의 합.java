import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] numbers = new int[n][m];
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	for (int j = 0; j < m; j++) {
        		numbers[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        
        int k = Integer.parseInt(br.readLine());
        int i, j, x, y;
        int minx, miny, maxx, maxy;
        
        while (k-- > 0) {
        	int result = 0;
        	st = new StringTokenizer(br.readLine());
        	i = Integer.parseInt(st.nextToken()) - 1;
        	j = Integer.parseInt(st.nextToken()) - 1;
        	x = Integer.parseInt(st.nextToken()) - 1;
        	y = Integer.parseInt(st.nextToken()) - 1;
        	minx = Math.min(i, x);
        	miny = Math.min(j, y);
        	maxx = Math.max(i, x);
        	maxy = Math.max(j, y);
        	
        	for (int q = minx; q <= maxx; q++) {
        		for (int w = miny; w <= maxy; w++) {
        			result += numbers[q][w];
        		}
        	}
        	
        	sb.append(result).append("\n");
        }
        
        System.out.println(sb);
    }
}