package 基础;

import java.text.SimpleDateFormat;

//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int[] array={99,44,11,66,55,77,88,77,99};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        Long e= System.nanoTime();
        for (int i = 0; i < array.length; i++) {
             for (int j = i+1; j <array.length-1 ; j++) {
                if(array[i]>array[j]){
                   int c=array[i];
                    array[i]=array[j];
                    array[j]=c;
                }
            }
        }

        //冒泡排序
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                    int c=array[j];
                    array[j]=array[j+1];
                    array[j+1]=c;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }

    }
}
