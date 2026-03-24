public class  Q11moores_voting_algo
{
    public static int majorityElement(int[] nums) {
        int count=0;
        int cand=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                cand=nums[i];
            }
            if(nums[i]==cand)
            {
                count++;
            }else
            {
                count--;
            }
        }
        return cand;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}