// 프로그래머스 고득점 kit 그래프 - 가장 먼 노드
import java.util.*;
public class practice01 {
	public int solution(int n, int[][] edge) {
        int answer = 0;
        boolean[] visited = new boolean[n+1];
        boolean[][] connected = new boolean[n+1][n+1];
        for(int i = 0; i < edge.length; i++) {
        	connected[edge[i][0]][edge[i][1]] = true;
        	connected[edge[i][1]][edge[i][0]] = true;
        }
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> nextNodes = new ArrayList<>();
        queue.add(1);
        visited[0] = visited[1] = true;
        while(true) {
        	answer = queue.size();
        	while(!queue.isEmpty()) {
        		int node = queue.poll();
        		for(int i = 1; i <= n; i++) {
        			if(!visited[i] && connected[node][i]) {
        				nextNodes.add(i);
        				visited[i] = true;
        			}
        		}
        	}
        	if(nextNodes.isEmpty())
        		break;
        	queue.addAll(nextNodes);
        	nextNodes.clear();
        }
        return answer;
    }
}
