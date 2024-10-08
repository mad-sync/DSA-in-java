public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 7, 9};
        int target = 7;

        int result = linearSearch(nums , target);

        if(result != -1){
            System.out.println("the element index is " + result);
        }
        else
            System.out.println("Element not found");
    }

    public static int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                return i;
            }
        }

        return -1;
    }
}
