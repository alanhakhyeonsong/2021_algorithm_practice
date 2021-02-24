// 프로그래머스 고득점 kit 스택/큐 - 기능개발
import java.util.*;

public class practice2 {
	public static int[] solution(int[] progresses, int[] speeds) {
        var listPro = new ArrayList<Integer>();
        var listSpe = new ArrayList<Integer>();
        var listAns = new ArrayList<Integer>();
        
        for(int i = 0; i < progresses.length; i++) {
        	listPro.add(progresses[i]);
        	listSpe.add(speeds[i]);
        }
        
        while(!listPro.isEmpty()) {	// Progress 큐가 빌 때 까지 반복합니다.
        	int count = 0;	// 배포할 기능의 개수를 나타내는 count 변수입니다.
        	while(listPro.get(0) < 100) {	// 큐의 첫번째 요소가 100보다 작은지 판단하며 루프를 돌게 됩니다.
        		for(int i = 0; i < listPro.size(); i++)
        			listPro.set(i, listPro.get(i) + listSpe.get(i));	// 작업의 진도 + 속도  >= 100 이면 배포함을 나타냅니다.
        	}
        	for(int i = 0; i < listPro.size(); i++) {
        		if(listPro.get(i) >= 100)	// 루프를 차례대로 돌며 작업의 결과가 100 이상인 것이 있다면 count 값 증가
        			count++;
        		else break;
        	}
        	listAns.add(count);	// 증가시켰던 count 값을 Answer큐에 넣습니다.
        	
        	while(count-- > 0) {	// 큐에서 맨 앞 요소를 빼는 것인데 count 값을 감소시키고 뺍니다(이미 배포한 작업들을 큐에서 빼는 과정)
        		listPro.remove(0);
        		listSpe.remove(0);
        	}
        }
		int[] answer = new int[listAns.size()];
		for(int i = 0; i < listAns.size(); i++)
			answer[i] = listAns.get(i);
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		int[] answer = solution(progresses, speeds);
		
		for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
		}
	}
}
