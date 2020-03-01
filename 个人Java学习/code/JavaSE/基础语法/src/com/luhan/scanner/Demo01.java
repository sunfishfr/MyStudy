package com.luhan.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args){
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine方式接收：");

        //判断用户有没有输入字符串
        if(scanner.hasNextLine()){
            //使用nextLine方式接收
            String str = scanner.nextLine();
            System.out.println("输入的内容为："+str);
        }

        //float f = scanner.nextFloat();//获取浮点数
        //double d = scanner.nextDouble();//获取浮点数

        //凡是属于IO流的类，如果不关闭，会一直占用资源，要养成良好的习惯，用完就关掉
        scanner.close();
    }
}
