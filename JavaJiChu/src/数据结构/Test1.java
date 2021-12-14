package 数据结构;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

/**
 * 99乘法表
 * 100以内的质数
 * 二分查找
 * 线性排序
 * 冒泡排序
 * 数组反转
 * 杨辉三角
 * */
public class Test1 {
    public static void main(String[] args) {
        yangHui(10);
    }
    //二分查找
    public static int bindNum(int num,int []array,int head,int end){
         if(num<array[head]||num>array[end]||head>end){
            return -1;
        }
        System.out.println(num);
        System.out.println(array[end]);
        while(head<=end){
            System.out.println(head);
            System.out.println(end);
            int middle=(head+end)/2;
            if(array[middle]>num){
                end=middle-1;
            }else if(array[middle]<num){
                head=middle+1;
            }else{
                return middle;
            }
        }
        return -1;

    }
    //冒泡排序
    public static int[] bubbleSort(int [] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                int num=array[j];
                if (array[j] > array[j + 1]) {
                    array[j]=array[j+1];
                    array[j+1]=num;
                }
            }
        }
        return array;
    }
    //数组反转
    public static void arrayReverse(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int num=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=num;
        }
        for (int num:array) {
            System.out.print(num+"\t");
        }
    }
    //杨辉三角
    public static void yangHui(int size){
        int[][] array = new int[size][];
        for (int i = 0; i < array.length; i++) {
            array[i]=new int[i+1];
            array[i][0]=array[i][i]=1;
            if(i>1){
                for (int j = 1; j < array[i].length-1; j++) {
                    array[i][j]=array[i-1][j-1]+array[i-1][j];
                }
            }

        }for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array[j].length; k++) {
                System.out.print(array[j][k]+"\t");
            }
            System.out.println();
        }
    }
}
