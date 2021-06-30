//public class MergeSort {
//
//    public static void main(String[] args) {
//        int[] arr = new int[]{2, 3, 4, 1, 0, 7, 5};
//        int[] sortedArr = sort(arr);
//   }
//
//    private static int[] sort(int[] arr) {
//        int right = arr.length - 1;
//        int left = 0;
//        int mid = (right - left) / 2;
//
//        mergeSort(arr, right, left);
//
//
//        return arr;
//    }
//
//    private static void mergeSort(int[] arr, int right, int left) {
//
//        int mid = (right - left) / 2;
//        if (right <= left) {
//            return ;
//        }
//
//        mergeSort(arr, mid, right);
//        mergeSort(arr, left, mid - 1);
//
//        merge(arr, mid, left, right);
//
//    }
//
//    private static void merge(int[] arr, int mid, int left, int right) {
//
//        int leftArr[] = new int[mid  - left];
//        int rightArr[] = new int[right  - mid];
//        int arrFinal[] = new int[right - left];
//        int i = left;
//        int j = mid;
//        int k = 0;
//       while (i < j ){
//
//           if (arr[i] < arr[j]){
//
//               leftArr[k] = arr[i];
//               i++;
//           }else{
//               rightArr[k];
//
//           }
//
//
//       }
//
//        for (int i = 0 ; i < mid ; i ++ ){
//            leftArr[i] = arr[j];
//            j++;
//
//        }
//
//        for (int i = left; i < right  - 1; i ++){
//
//            if (arr[i] < arr[j]) {
//
//                leftArr[i] = arr[i];
//            }else{
//
//               // rightArr[];
//
//            }
//
//
//        }
//
//
//
//
//
//    }
//}


