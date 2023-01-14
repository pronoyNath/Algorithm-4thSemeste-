public class SelectionSort {

    void Selectionsort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int min = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            Swap(arr,i,min); 
        }
    }

    private void Swap(int[] arr, int i, int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }

    void Display(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {5,2,6,3,4};

        SelectionSort sort = new SelectionSort();
        sort.Selectionsort(arr);
        sort.Display(arr);
    }
}