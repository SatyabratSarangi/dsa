package Easy;
public class Q2MaxMinArray {
    public static void main(String args[])
    {
        int maxv=Integer.MIN_VALUE;
        int minv=Integer.MAX_VALUE;
        int arr[]={2,3,4,1,5,9};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxv)
            {
                maxv=arr[i];
            }
            if(arr[i]<minv)
            {
                minv=arr[i];
            }
            
        }
        System.err.println(maxv);
        System.out.println(minv);

    }
}
