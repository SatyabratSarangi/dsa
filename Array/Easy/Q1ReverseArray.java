
public class Q1ReverseArray
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,};
        int mid=arr.length/2;
        int i=0;
        while(i<mid)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
            i++;


        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }
    }
}