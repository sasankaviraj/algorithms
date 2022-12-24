/**
 * @author Sasanka Ariyaratna
 * @Date 12/24/2022
 * @Project algorithms
 */
public class BubbleSort {

    private static int[] arr = {12,6,7,8,10,2,9};

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        sort.bubbleSort();
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private void bubbleSort(){
        int k = 1;
        int n = arr.length;
        for (int i = 0; i <= n-1; i++){
            for (int j = 0; j <= n-k-1; j++){
                if (arr[j] > arr[j+1]){
                    swap(j, j+1);
                }
            }
        }
    }

    private void swap(int start, int end){
        int tempStart = arr[start];
        arr[start] = arr[end];
        arr[end] = tempStart;
    }
}
