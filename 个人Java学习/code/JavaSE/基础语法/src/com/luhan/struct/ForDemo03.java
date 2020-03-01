package com.luhan.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        //打印九九乘法表
        //定义两个因数a、b
        int a;
        int b;
        for (int i = 1; i < 10; i++) {
            a = i;
            for (int j = 1; j <= i; j++) {//这里布尔表达式j<i中的i，可以改成10，即j<9，就会打印一个完整的乘法表
                b = j;
                System.out.print(a + "*" + b + "=" + (a * b)+"\t");
            }
            System.out.println();
        }
    }
}
