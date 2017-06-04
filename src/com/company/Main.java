/*
键盘录入一个九九乘法表
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 键盘录入
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入n的值：(1-9)");
        int n = sc.nextInt();

        baio(n);
    }



    public static void baio(int n){
        for(int x=1;x<=n;x++){
            for(int y=1;y<=x;y++){
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    }
}
