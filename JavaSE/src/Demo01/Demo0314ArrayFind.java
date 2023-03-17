package Demo01;

import java.util.Arrays;

/*数组查找*/
public class Demo0314ArrayFind {
    public static void main(String[] args) {
        int[] ints=new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i]= (int) (Math.random()*100);
        }
        Arrays.sort(ints);
        Arrays.fill(ints,2,4,999);
        System.out.println(Arrays.toString(ints));


    }


    /**顺序查找 Sequential lookup*/
    public static int SequentialLookup(int[] ints,int num){
        int i=0;
        for (int j = 0; j < ints.length; j++) {
            if(ints[j]==num){
                i=j;
            }
        }
        return i;
    }
}
