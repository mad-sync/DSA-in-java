import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] nums = {2,1,9,8,6,7};
        int minIndex = -1;
        int temp = 0;

        for (int i = 0; i < nums.length-1; i++) {
            minIndex = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[minIndex] > nums[j]){
                   minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
            System.out.println(Arrays.toString(nums));

    }
}
