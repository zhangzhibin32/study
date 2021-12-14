import java.util.Arrays;

public class ArraysUntilTest {
    public static void main(String[] args) {
        int [] array={11,3,9,6,7,8};
        ArraysUntil until = new ArraysUntil();
        int[] ints = until.sortOfArray(array);
        System.out.println(Arrays.toString(ints));
    }
}
