package com.abelkin;

import java.util.*;

class Solution{
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a + b;
            int twos = 1;
            System.out.print(sum + " ");
            for (int j=1;j<n;j++) {
                twos *= 2;
                sum += b*twos;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
