public class BubbleSortAlgo {

    void BubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j] > arr[j+1]){
                    Swap(arr,j,j+1);
                }
            }
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
        BubbleSortAlgo sort = new BubbleSortAlgo();
        sort.BubbleSort(arr);
        sort.Display(arr);
    }
}
