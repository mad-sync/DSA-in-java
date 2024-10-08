public class BubbleSort {
    public static void main(String args[]){
        int[] nums = {2, 4, 3, 1, 5, 6};
        int temp =0 ;
        for(int n : nums){
            System.out.print(" "  + n);
        }
        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <nums.length-i-1 ; j++) {  //-i reduces looping sorted end values
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            for(int n : nums){
                System.out.print( " " + n);
            }
            System.out.println();
        }
        System.out.println("After sorting");
        for(int n : nums){
            System.out.print( " " + n);
        }
    }
}
