public class MedianOfArrays {


    public static void main(String[] args) {
        System.out.println("median: " + findMedianSortedArrays(new int[]{1, 5, 6}, new int[]{2, 3, 4}));
// 1, 2, 3 ,4, 5 ,6
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;
        int[] arr = new int[n1 + n2];
        int k = 0;
        while (i < n1 && j < n2) {

            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
            }
            else  {
                arr[k] = nums2[j];
                j++;
            }

            k++;


        }

        while (i < n1) {

            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n2) {

            arr[k] = nums2[j];
            j++;
            k++;
        }


        double median;
        int size = n1 + n2;
        if (size % 2 == 0) {
            median = (arr[size / 2] + arr[(size / 2) - 1]) / 2;
        } else {
            median = arr[size / 2];
        }

        return median;
    }


}

