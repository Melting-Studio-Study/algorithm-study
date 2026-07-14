import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;      // 세로 길이
        int m = maps[0].length;   // 가로 길이

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{0, 0});
        visited[0][0] = true;
        maps[0][0] = 1; // 시작점 거리 초기화 (자기 자신 포함해서 세기 위함)

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                // 범위 체크가 배열 접근보다 먼저 와야 함 (조건 순서 중요)
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (visited[nx][ny]) continue;
                if (maps[nx][ny] == 0) continue; // 벽

                visited[nx][ny] = true;
                maps[nx][ny] = maps[x][y] + 1; // 이전 칸의 거리 + 1
                queue.offer(new int[]{nx, ny});
            }
        }

        // 도착점에 도달하지 못했다면 -1
        return visited[n - 1][m - 1] ? maps[n - 1][m - 1] : -1;
    }
}