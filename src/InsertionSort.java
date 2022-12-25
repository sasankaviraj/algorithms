/**
 * @author Sasanka Ariyaratna
 * @Date 12/25/2022
 * @Project algorithms
 */
public class InsertionSort {

    private static int[] arr = {12,6,7,8,10,2,9};

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        sort.insertionSort();
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private void insertionSort() {
        int n = arr.length;

        for (int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
