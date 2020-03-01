package com.luhan.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //用while或者for循环输出1-1000之间能被5整除的数，并且每行输出3个
        for (int i = 1; i <= 1000; i++) {
            if(i%5==0){//能被5整除
                System.out.print(i+"\t");//不换行输出
            }
            if (i%(5*5)==0){
                System.out.println();//换行输出
            }
        }
    }
}
