public class Practice {
    void InsertionSort(int[] arr){
        for (int i=1;i< arr.length;i++){
            int item = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > item){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = item;
        }
    }

    void SelectionSort(int[] arr){
       for (int i=0;i< arr.length;i++){
           int min = i;
           for (int j=i+1;j< arr.length;j++){
               if (arr[min] > arr[j]){
                   min = j;
               }
           }
           Swap(arr,min,i);
       }
    }
    void BubleSort(int[] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length-i-1;j++){
                if (arr[j] > arr[j+1]){
                    Swap(arr,j,j+1);
                }
            }
        }
    }
    void QuickSort(int[] arr,int l,int h){
        if (l<h){
            int pi = Partition(arr,l,h);
            QuickSort(arr,l,pi-1);
            QuickSort(arr,pi+1,h);
        }
    }

    private int Partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l-1;
        for(int j=l;j< arr.length;j++) {
            if (arr[j] < pivot) {
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
        int[] arr = {5,3,6,2,1};
        Practice sort = new Practice();
        sort.QuickSort(arr,0,arr.length-1);
        sort.Display(arr);
    }
}
