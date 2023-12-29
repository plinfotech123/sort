public class BubbleSortExample {
    public static void main(String[] args) {
        int[] nums={8,7,5,3,2,1};
        // outer
        for(int i=0; i<nums.length-1; i++) {
            // inner loop
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for(int num: nums){
            System.out.print(num);
        }

    }
}
