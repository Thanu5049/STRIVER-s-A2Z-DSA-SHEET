public class SelectionSort{
    public static int[] selectionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int minIndex=i;  //edge cases handling
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minIndex]>arr[j])
                minIndex=j;
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]+",");
        //TC - O(n square)
    }
}