import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        // 최소 힙: 가장 매운맛이 약한 음식부터 꺼내기 위함
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.offer(s);
        }

        int mixCount = 0;

        // 가장 작은 값이 K 이상이 될 때까지 반복
        while (pq.peek() < K) {
            // 섞을 음식이 부족하면 K를 만족시킬 수 없음
            if (pq.size() < 2) {
                return -1;
            }

            int first = pq.poll();   // 가장 안 매운 음식
            int second = pq.poll();  // 두 번째로 안 매운 음식

            int newScoville = first + (second * 2); // 섞은 음식의 스코빌 지수 공식
            pq.offer(newScoville);

            mixCount++;
        }

        return mixCount;
    }
}