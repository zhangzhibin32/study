public class ArraysUntil {
    //数组的最大值
    public int getMax(int[] array){
        int maxValue=0;
        for (int i = 0; i < array.length; i++) {
            if(maxValue<array[i]){
                maxValue=array[i];
            }
        }
        return maxValue;
    }
    //数组的最小值
    public int getMin(int[] array){
        int minValue=0;
        for (int i = 0; i < array.length; i++) {
            if(minValue>array[i]){
                minValue=array[i];
            }
        }
        return minValue;
    }
    //数组的总和
    public int getSum(int[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }
    //数组的平均值
    public int getAvg(int[] array){
        int avg=0;
        avg=getSum(array);
        return avg/ array.length;
    }
    //反转数组
    public int[] reverse(int[] array){
        int[] arrays = new int[array.length];
        for (int i = 0; i < array.length/2; i++) {
            arrays[i]=array[array.length-1-i];
            arrays[arrays.length-1-i]=array[i];
        }
        return arrays;
    }
    //复制数组
    public int[] copyOfArray(int[] array){
        int[] arrays=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrays[i]=array[i];
        }
        return arrays;
    }
    //数组排序
    public int[] sortOfArray(int[] array){
        int num=0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]>array[j+1]){
                    num=array[j];
                    array[j]=array[j+1];
                    array[j+1]=num;
                }
            }
        }
        return array;
    }

    //遍历数组
    //查找指定元素
    public int lookUp(int[] array, int num) {
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                index=i;
                break;
            }
        }
        return index;
    }
}
