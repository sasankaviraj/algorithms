/**
 * @author Sasanka Ariyaratna
 * @Date 12/25/2022
 * @Project algorithms
 */
public class SelectionSort {

    private static int[] arr = {12,6,7,8,10,2,9};

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        sort.selectionSort();
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private void selectionSort(){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            int min = i;
            for (int j = i+1; j < n; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            swap(i, min);
        }
    }

    private void swap(int start, int end){
        int tempStart = arr[start];
        arr[start] = arr[end];
        arr[end] = tempStart;
    }
}
