package 基础;
//数组反转
public class ArrayReverse {

    public static void main(String[] args) {
        String[] array=new String[]{"jj","dd","cc","bb","aa","ff"};
        for (String s:array) {
            System.out.print(s+"--\t");
        }
        System.out.println("--------------方法一");
        String a;
        for (int i = 0; i < array.length/2; i++) {
            a=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=a;
         }
        for (String s:array) {
            System.out.print(s+"--\t");
        }
        System.out.println("二二二二二二方法二");
        for (int i = 0,j=array.length-1 ;i <j ; i++,j--) {
            a=array[i];
            array[i]=array[j];
            array[j]=a;
        }
        for (String s:array) {
            System.out.print(s+"--\t");
        }

    }
}
