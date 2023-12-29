public class SelectionSortExample {
    public static void main(String[] args) {
        // smallest will move to the 1st index 0
        // 1 swape per iteration, we have to assume the smallest number i and should compare all the number and swape
        // selection sort
        int[] nums= {7,8,5,3,2,1};
        // outer loop
        for(int i=0; i<nums.length-1; i++){
            int smallest=i;
            // inner loop for comparing
            for(int j=i+1; j<nums.length; j++){ // we need to compare the remaining elements only
                if(nums[smallest]> nums[j]){
                    smallest=j;
                }
            }
            // swape logic
            int temp=nums[smallest];
            nums[smallest]=nums[i];
            nums[i]=temp;
        }
        for(int num: nums){
            System.out.print(num);
        }

    }
}
