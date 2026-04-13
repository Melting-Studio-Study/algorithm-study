import java.util.*;
import java.io.*;

public class Main {
    static int N, K;
    static int[] visited = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.println(0);
        } else {
            bfs(N);
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = 1;

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            for (int i = 0; i < 3; i++) {
                int next;
                if (i == 0) next = curr - 1;
                else if (i == 1) next = curr + 1;
                else next = curr * 2;

                if (next == K) {
                    System.out.println(visited[curr]);
                    return;
                }

                if (next >= 0 && next <= 100000 && visited[next] == 0) {
                    visited[next] = visited[curr] + 1;
                    queue.add(next);
                }
            }
        }
    }
}