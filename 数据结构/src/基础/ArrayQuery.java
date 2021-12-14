package 基础;
//数组查找
public class ArrayQuery {
    public static void main(String[] args) {
        //线性查找  挨个查找
        String[] array=new String[]{"jj","dd","cc","bb","aa","ff"};
        String dest="aa";
        for (int i = 0; i < array.length; i++) {
            if(dest.equals(array[i])){
                System.out.println(i);;
                break;
            }
        }
        /**二分查找
         * 折半查找  判断中间值与查找的值的大小关系，再决定查找哪一半，依次循环直到找到或者查找完。
         * 查找的数组必须有序
         */
        int [] arr2={1,10,20,30,40,50,60,70,80,90,100};
        int dest1=90;
        int head=0;//初始的首索引
        int end = arr2.length - 1;//初始的末索引
        while (head<=end){
            int middle=(head+end)/2;
            if(dest1==arr2[middle]){
                System.out.println(middle);
                break;
            }else if(arr2[middle]>dest1){
                end=middle-1;
             }else{
                head=middle+1;
             }
        }
     }
}
