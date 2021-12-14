package Day1023;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Day1112Test {
    public static void main(String[] args) {
        int[] array={111,222,333,444,555,666};
        System.out.println(BinarySearch(array, 442));
    }

    public static int BinarySearch(int[] array,int num) {
        int head=0;
        int end=array.length-1;
        int middle =0;
        if(num>array[end]||num<array[head]||head>end){
            return -1;
        }
        while(head<=end){
            middle=(head+end)/2;
            if(num>array[middle]){
                head=middle+1;
            }else if(num<array[middle]){
                end=middle-1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}
