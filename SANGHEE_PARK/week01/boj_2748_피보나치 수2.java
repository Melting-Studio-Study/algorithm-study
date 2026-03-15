package org.example.week01;

import java.io.*;

//boj_2748_피보나치 수2.java
public class Boj2748 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long f = 0; //F(n) n이 90까지 이므로 long으로 선언
        long fi = 1;//F(n-1)
        long fii = 0; //F(n-2)

        if(n==0){
            System.out.println(0);
        } else if (n==1) {
            System.out.println(1);
        } else{
            for (int i = 0; i < n-1; i++) {
                f = fi + fii; //n 번째 피보나치 수 구하기
                fii = fi; // F(n-1)을 F(n-2)에 저장
                fi = f; //F(n)을 F(n-1)에 저장
            }
            System.out.println(f);
        }
    }
}