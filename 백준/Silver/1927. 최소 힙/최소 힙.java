import java.io.*;
import java.util.*;

public class Main {
	
	public static class MinHeap {
		private ArrayList<Integer> heap;
		
		public MinHeap() {
			heap = new ArrayList<>();
			heap.add(0);
		}
		
		public void insert(int n) {
			heap.add(n);
			int p = heap.size() - 1;
			
			while (p > 1 && heap.get(p / 2)	> heap.get(p)) {
				int sub = heap.get(p / 2);
				heap.set(p / 2, n);
				heap.set(p, sub);
				
				p /= 2;
			}
		}
		
		public int delete() {
			if (heap.size() - 1 < 1) {
				return 0;
			}
			
			int deleteNum = heap.get(1);
			
			heap.set(1, heap.get(heap.size() - 1));
			heap.remove(heap.size() - 1);
			
			int pos = 1;
			
			while (pos * 2 < heap.size()) {
				int min = heap.get(pos * 2);
				int minIndex = pos * 2;
				
				if (pos * 2 + 1 < heap.size() && min > heap.get(pos * 2 + 1)) {
					min = heap.get(pos * 2 + 1);
					minIndex = pos * 2 + 1;
				}
				
				if (min > heap.get(pos)) {
					break;
				}
				
				int sub = heap.get(pos);
				heap.set(pos, heap.get(minIndex));
				heap.set(minIndex, sub);
				pos = minIndex;
			}
			
			return deleteNum;
		}
		
		public int size() {
			return heap.size();
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		MinHeap heap = new MinHeap();
		int n;
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			
			if (n != 0) {
				heap.insert(n);
			} else {
				sb.append(heap.delete()).append("\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}