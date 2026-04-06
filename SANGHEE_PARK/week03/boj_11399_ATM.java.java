package org.example.week03;

import java.util.*;
import java.io.*;

//boj_11399_ATM.java
public class Boj11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬
        Arrays.sort(arr);

        int sum = 0;
        int total = 0;

        for (int i = 0; i < N; i++) {
            sum += arr[i];   // 현재까지 누적 대기시간
            total += sum;    // 전체 합
        }

        System.out.println(total);
    }
}
