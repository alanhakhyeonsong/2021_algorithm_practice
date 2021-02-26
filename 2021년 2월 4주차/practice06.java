// BOJ 1260번: DFS와 BFS
import java.util.*;
public class practice06 {
	static boolean[] visited;
	static ArrayList<Integer>[] list;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int start = sc.nextInt();
		
		list = new ArrayList[N+1];
		for(int i = 1; i <= N; i++) {
			list[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < M; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			list[u].add(v);
			list[v].add(u);
		}
		for(int i = 1; i <= N; i++)
			Collections.sort(list[i]);
		visited = new boolean[N+1];
		dfs(start);
		System.out.println();
		
		visited = new boolean[N+1];
		bfs(start);
		System.out.println();
		sc.close();
	}
	
	public static void dfs(int start) {
		if(visited[start])
			return;
		visited[start] = true;
		System.out.print(start + " ");
		for(int b : list[start]) {
			if(!visited[b])
				dfs(b);
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = true;
		while(!queue.isEmpty()) {
			int a = queue.poll();
			System.out.print(a + " ");
			for(int b : list[a]) {
				if(!visited[b]) {
					visited[b] = true;
					queue.add(b);
				}
			}		
		}
	}
}
