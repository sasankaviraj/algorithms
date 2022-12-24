/**
 * @author Sasanka Ariyaratna
 * @Date 12/24/2022
 * @Project algorithms
 */
public class QuickSort {

    private static int[] arr = {10,6,11,8,12,2,9,15};

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        //takes the index of the array as bound
        sort.quickSort(0,7);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private void quickSort(int lowerBound, int upperBound){
        if(lowerBound < upperBound){
            int k = partition(lowerBound, upperBound);
            quickSort(lowerBound, k-1);
            quickSort(k+1, upperBound);
        }
    }

    private int partition(int lowerBound, int upperBound){
        int pivot = arr[lowerBound];
        int start = lowerBound;
        int end = upperBound;

        while(start < end){
            while(arr[start] <= pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }
            if(start < end){
                swap(start, end);
            }else {
                break;
            }
        }
        swap(lowerBound, end);
        return end;
    }

    private void swap(int start, int end){
        int tempStart = arr[start];
        arr[start] = arr[end];
        arr[end] = tempStart;
    }
}
