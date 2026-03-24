public class Q10_move_zero {
    public static void moveZeroes(int[] nums) {
        int lp=0;
        int rp=0;
        while(rp<nums.length)
        {
            if(nums[rp]!=0)
            {
                int temp=nums[rp];
                nums[rp]=nums[lp];
                nums[lp]=temp;
                lp++;
            }
            rp++;
            
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1};
        moveZeroes(arr);
        for(int i : arr)
        {
            System.out.println(i);
        }
    }
}
