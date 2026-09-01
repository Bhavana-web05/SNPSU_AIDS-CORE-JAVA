package SearchingSortingAlgorithm.InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        for (int i = 1; i < arr.length; i++) {//index1=3
            int key = arr[i];//key=3
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
