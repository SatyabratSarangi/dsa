
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Q7Minimum_Absolute_Difference {
    public static List<List<Integer>> minimumAbsDifference(int arr[])
    {
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<arr.length;i++)
        {
            int diff=arr[i]-arr[i-1];
            if(diff<mindiff)
            {
                mindiff=diff;
                res=new ArrayList<>();
                res.add(Arrays.asList(arr[i-1],arr[i]));
                
            }else if(diff==mindiff)
            {
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }

        }
        return res;

    }
    public static void main(String[] args) {
        int arr[]={4,2,1,3};
        List<List<Integer>> res=minimumAbsDifference(arr);
        System.out.println(res);

    }
}
