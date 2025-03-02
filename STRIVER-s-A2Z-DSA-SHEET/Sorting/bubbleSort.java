public class bubbleSort{
    public static int[] BubbleSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        System.out.println("Before Sorting");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+",");
        BubbleSort(arr);
        System.out.println("After Sorting");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+",");
        //Time complexity in worst case-o(n square)
        //Best Time  Complexity when everything is sorted , for n numbers, o(n) or only for one number, o(1)
    }
}