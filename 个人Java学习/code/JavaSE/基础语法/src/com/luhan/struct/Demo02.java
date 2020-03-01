package com.luhan.struct;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name  = scanner.nextLine();
        switch (name){
            case "张飞" :
                System.out.println("张飞");
                break;
            case "刘备" :
                System.out.println("刘备");
                break;
            default:
                System.out.println("查无此人");
        }
    }
}
