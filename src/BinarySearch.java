/**
 * @author Sasanka Ariyaratna
 * @Date 12/24/2022
 * @Project algorithms
 */
public class BinarySearch {
    private static int[] arr = {1,2,3,4,5,6,7,8,9,10,11};

    public static void main(String[] args) {
        //must be a sorted array to execute a binary search
        BinarySearch search = new BinarySearch();
        System.out.println(search.binarySearch(7));
    }

    private int binarySearch(int target){
        int min = 0;
        int max = arr[arr.length - 1];

        while (min <= max){
            int middle = min + (max - min) / 2;
            if (arr[middle] < target){
                min = middle + 1;
            }else if(arr[middle] > target){
                max = middle - 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
