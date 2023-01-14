public class InsertionSortAlgo {

    void InsersionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int item = arr[i];
            int j = i - 1;
            while (j >= 0 && item < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = item;
        }
    }

        void Display ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        public static void main (String[]args){
            int[] arr = {5, 6, 9, 3, 4};
            InsertionSortAlgo sort = new InsertionSortAlgo();
            sort.InsersionSort(arr);
            sort.Display(arr);
        }
}
