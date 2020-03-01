package com.luhan.struct;

public class Demo03 {
    public static void main(String[] args) {
        //计算1+2+3+...+100=？
        int i = 0;
        int sum  = 0;

        do{
            sum = sum + i;
            i++;
        }while (i<=100);//不满足条件，不再执行循环
        System.out.println("1+2+3+...+100="+sum);
    }
}
