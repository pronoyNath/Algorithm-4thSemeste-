public class QuickSortAlgo {

    void QuickSort(int[] arr,int l,int h){
        if (l<h){
            int pi = Partition(arr,l,h);
            QuickSort(arr,l,pi-1);
            QuickSort(arr,pi+1,h);
        }
    }

    private int Partition(int[] arr, int l, int h) {
        int pivot = arr[h];  //pivot is selected element
        int i = l-1;
        for (int j=l;j<=h-1;j++){  //here,i is small element locator (left of pivot is small elements)
            if (arr[j] < pivot){   //j is larger element locator (right of pivot is larger elements)
                i++;
                Swap(arr,i,j);
            }
        }
        Swap(arr,i+1,h);
        return (i+1);
    }

    private void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void Display(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,3,8,5};
        QuickSortAlgo sort = new QuickSortAlgo();
        sort.QuickSort(arr,0,arr.length-1);
        sort.Display(arr);
    }
}
