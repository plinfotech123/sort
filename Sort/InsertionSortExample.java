public class InsertionSortExample {
    public static void main(String[] args) {
        int[] nums={8,9,7,5,4,3,2,1};

        for(int i=1; i<nums.length; i++){
            int current=nums[i];
            int j=i-1;

            while(j>=0 && current>nums[j]){
                nums[j+1]=nums[j];
                j--;
            }
            //placement
            nums[j+1]=current;
        }

        for(int num: nums){
            System.out.print(num);
        }

    }
}
