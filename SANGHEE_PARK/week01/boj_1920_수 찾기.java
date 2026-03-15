package org.example.week01;

import java.io.*;
import java.util.*;

public class Boj1920 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

       // 백준에서 시간 초과난 코드 O(n*m)
       /* int n = Integer.parseInt(br.readLine());
        int[] arrn = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrn[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arrm = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arrm[i] = Integer.parseInt(st.nextToken());
        }

        int check = 0; // 수가 있는 지 없는지 확인하는 변수


        for(int i=0;  i<m; i ++){
            for(int j=0; j<n; j++){
                 if(arrm[i]==arrn[j]){
                     check = 1;
                 }
            }
            System.out.println(check);
            check = 0;
        }*/

        // 이진 탐색으로 작성한 코드
        int n = Integer.parseInt(br.readLine());
        int[] arrn = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arrn[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrn);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<m;i++){
            int target = Integer.parseInt(st.nextToken());

            if(binarySearch(arrn, target))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }

    public static boolean binarySearch(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){

            int mid = (left + right) / 2;

            if(arr[mid] == target)
                return true;

            if(arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }

}
