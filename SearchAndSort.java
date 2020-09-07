
public class SortAlgorithm {

    public static void main(String[] args) {
       Integer[] arr = sortArray(new Integer[]{5,99,12,56,123,457,120});
        for (Integer integer : arr) {
            System.out.print(" "+integer);
        }
        System.out.println();
        System.out.println( binarySearch(arr,0, arr.length-1, 123));
    }

    public static Integer[] sortArray(Integer[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int binarySearch(Integer[] array, int start, int end, int number) {
        if(end>=start) {
            int mid = start + (end - start) / 2;

            if(array[mid]==number)
                return mid;
            if(array[mid]>number)
             return  binarySearch(array, start, mid-1, number);

            return  binarySearch(array, mid+1, end, number);
        }
        return -1;
    }
}
