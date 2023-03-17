package Demo01;

import java.util.Arrays;
import java.util.Date;

//数组
public class Demo0308ArraySort {
    public static void main(String[] args) {
        int[] d=new int[10000];
        for (int i = 0; i < d.length; i++) {
            d[i]= (int) (Math.random()*100);
        }
        long start = System.currentTimeMillis();
        int[] doubles = SelectSort(d);
        long end = System.currentTimeMillis();

        System.out.println(Arrays.toString(doubles));
        System.out.println(start-end);

    }


    //选择排序
    public static int[] SelectSort(int[] d) {
        for (int i = 0; i < d.length - 1; i++) {
            int minIndex = i;
            int minValue = d[i];
            for (int j = minIndex + 1; j < d.length; j++) {
                if (d[j] < minValue) {
                    minIndex = j;
                    minValue = d[j];
                }
            }
            d[minIndex] = d[i];
            d[i] = minValue;
        }
        return d;
    }

    //冒泡排序
    public static int[] BubbleSort(int[] d) {
        for (int i = 0; i < d.length - 1; i++) {
            for (int j = 0; j < d.length - 1 - i; j++) {
                if (d[j + 1] < d[j]) {
                    int minValue=0;
                    minValue = d[j];
                    d[j] = d[j+1];
                    d[j+1] = minValue;
                }
            }
        }
        return d;
    }

}
