public class InsertionSort {
    public static void insertionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]+",");
        //best case is O(n) when the array is already sorted,worst case is o(n square)
    }
}
