package com.luhan.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //定义变量：输入个数n、总和sum
        int n = 0;
        double sum = 0;
        System.out.println("请输入数字（按x可结束输入）：");
        //通过循环判断是否还有输入，并在里面对每一次进行求和和统计
        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            n = n + 1;
            sum = sum + x;
            System.out.println("你输入了第"+n+"个数，当前总和为："+sum);
        }
        System.out.println(n + "个数的和为：" + sum);
        System.out.println(n + "个数的平均值为：" + (sum/n));
        //关闭对象
        scanner.close();
    }
}
