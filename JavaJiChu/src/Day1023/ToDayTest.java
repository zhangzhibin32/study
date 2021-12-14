package Day1023;

import java.util.ArrayList;
import java.util.Arrays;
public class ToDayTest {
    public static void main(String[] args) {
        int[] array={34,5,22,-98,6,-76,0,-3};

    }

    //冒泡排序
    public static void BubbleSort(int[] array){
        for (int i = 0; i <array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    int num=array[j];
                    array[j]=array[j+1];
                    array[j+1]=num;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    //99乘法表
    public static void MultiplicationTable(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
    //求质数
    public static void PrimeNumber(int num) {
        boolean flag=true;
        long s = System.nanoTime();
        int count=0;
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if(i%j==0){
                    flag=false;
                    break;
                }
            }if(flag)
                count++;
            flag=true;
        }
        System.out.println(count);
        long e = System.nanoTime();
        System.out.println(e-s);
    }
    //二分查找
    public static int BinarySearch(int[] array,int num){

        int head=0;
        int end=array.length-1;
        int middle=0;
        if(num<array[head]||num>array[end]||head>end){
            return -1;
        }
        while (head<=end){
             middle=(end+head)/2;
            if(num>array[middle]) head = 1 + middle;
            else if(num<array[middle]){
                end=middle-1;
            }else{
                return middle;
             }
        }
        return -1;
    }
    //有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
    public static void RabbitCalculation(int month) {
        int[] rabbit=new int[month];
        for (int i = 0; i < month; i++) {
            if (i == 0 || i == 1) {
                rabbit[0]=rabbit[1]=1;
            }else
                rabbit[i]=rabbit[i-1]+rabbit[i-2];
        }
        for (int num:rabbit) {
            System.out.println(num);
        }
    }



}
