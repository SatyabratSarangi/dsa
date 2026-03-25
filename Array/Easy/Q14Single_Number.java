public class Q14Single_Number {
    public static int singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res^=nums[i];
        }
        
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,3,5,4};
        System.out.println(singleNumber(arr));
    }
}
