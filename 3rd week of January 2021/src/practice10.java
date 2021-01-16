// 프로그래머스 고득점 kit 스택/큐 - 프린터
import java.util.*;
public class practice10 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Printer> q = new LinkedList<>();

		for (int i = 0; i < priorities.length; i++) { // print큐에 인덱스번호, 우선순위 삽입
			q.offer(new Printer(i, priorities[i]));
		}

		while (!q.isEmpty()) {

			boolean flag = false;
			int com = q.peek().priorities;
			for (Printer p : q) {
				if (com < p.priorities) { // 맨앞의 수보다 큰 숫자가 존재하면
					flag = true;
				}
			}

			if (flag) {
				q.offer(q.poll());
			} else {	// 현재 맨앞의 숫자가 가장 클 때
				if (q.poll().location == location) {
					answer = priorities.length - q.size();
				}
			}
		}
        return answer;
    }
    class Printer {
		int location;
		int priorities;

		Printer(int location, int priorities) {
			this.location = location;
			this.priorities = priorities;
		}
	}
}