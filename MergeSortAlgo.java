public class MergeSortAlgo {
   void MergeSort(int[] arr,int low,int high){
       if (low<high){
           int mid = low + (high-low)/2;
           MergeSort(arr,low,mid);
           MergeSort(arr,mid+1,high);
           Merge(arr,low,mid,high);
       }
   }

    private void Merge(int[] arr, int low, int mid, int high) {
       int[] temp = new int[high+1];
       for (int i=0;i<=high;i++){
           temp[i] = arr[i];
       }
       int i=low,j=mid+1,k=low;
       while (i<=mid && j<=high){
           if (temp[i] <= temp[j]){
               arr[k] = temp[i];
               i++;
           }
           else {
               arr[k] = temp[j];
               j++;
           }
           k++;
       }
       while (i<=mid){
           arr[k] = temp[i];
           k++;
           i++;
       }
    }

    void Display(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,6,3,8,5,4,7,1};
        MergeSortAlgo sort = new MergeSortAlgo();
        sort.MergeSort(arr,0,arr.length-1);
        sort.Display(arr);
    }
}
