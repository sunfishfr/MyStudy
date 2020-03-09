package com.luhan.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,5,6,3,1,7,4,8,9,10};
        int[] arrSorted = bubbleSort(arr);
        System.out.println(Arrays.toString(arrSorted));
    }

    public static int[] bubbleSort(int[] arr){
        //临时变量
        int temp = 0;
        int times = 0;
        //外层循环，判断我们要多少次循环
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            //内层循环，比较相邻两个元素的大小，并且交换位置
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
                times++;
            }
            if (!flag){
                break;
            }
        }
        System.out.println("times = " + times);
        return arr;
    }
}
