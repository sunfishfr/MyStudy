package com.luhan.struct;

public class ForDemo01 {
    public static void main(String[] args) {
        //计算0-100之间的奇数和与偶数和
        //1、定义奇数和与偶数和
        int oddSum = 0;
        int evenSum = 0;
        //2、循环
        for (int i = 0; i <= 100; i++) {
            //3、判断数字奇偶
            if (i % 2 != 0) {//奇数
                oddSum += i;
            } else {//偶数
                evenSum += i;
            }
        }
        System.out.println("奇数和为：" + oddSum);//输出：奇数和为：2500
        System.out.println("偶数和为：" + evenSum);//输出：偶数和为：2550
    }
}
