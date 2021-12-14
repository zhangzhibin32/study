package 数据结构;
/**
 * 99乘法表
 * 100以内的质数
 * */
public class PrimeNumber {
    public static void main(String[] args) {
        long e=System.nanoTime();


        label:for (int i =2; i <= 10000; i++) {
            boolean flag=true;
            /* 优化二
            for (int j = 2; j <=i ; j++)
             */
            for (int j = 2; j <=Math.sqrt(i) ; j++) {
                if(i%j==0){
                    /*flag=false;
                    break;//优化一:只对本身非质数的自然数有效*/
                    continue label;
                }
            }//if (flag)
            System.out.println(i);
        }

        long s=System.nanoTime();
        System.out.println((s-e)/1000);

    }
}
