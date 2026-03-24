
public class Q5TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        int lp=0;int rp=numbers.length-1;
        int arr[]=new int[2];
        int i=0;
        while(lp<rp)
        {
            if(numbers[lp]+numbers[rp]==target)
            {
                arr[i]=lp+1;
                arr[i+1]=rp+1;
            }
            if(numbers[lp]+numbers[rp]<target)
            {
                lp++;
            }else
            {
                rp--;
            }
        }
        return arr;
    }

public static void main(String[] args)
{
    int arr[]={2,7,11,15};
    int target=9;
    int res[]=twoSum(arr,target);
    for(int i:res)
    {
        System.out.println(i);
    }

}

}