public class Q13RangeSumQuery {
    static int pref[];
    public static void NumArray(int[] nums) {
        int n=nums.length;  
        pref= new int[n];
        pref[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            pref[i]=pref[i-1]+nums[i];
        }
    }
    
    public static int sumRange(int left, int right) {
        if(left==0)
        {
            return pref[right];
        }
        return pref[right]-pref[left-1];
    }

    public static void main(String[] args) {
        int arr[]={-2,0,3,-5,2,-1};
        NumArray(arr);
        System.out.println(sumRange(0,2));
    }
}
