class Solution {
    int count = 0;
    public int reversePairs(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return count;
    }

    private void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);
    }

    private void countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        for(int left = low; left <= mid; left++) {
            while(right <= high && (long) arr[left] > 2L*arr[right]) {
                right++;
            }
            count += right - (mid + 1);
        }
    }

    private void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp[k] = arr[left];
                k++;
                left++;
            }
            else {
                temp[k] = arr[right];
                k++;
                right++;
            }
        }

        while(left <= mid) {
            temp[k] = arr[left];
            k++;
            left++;
        }

        while(right <= high) {
            temp[k] = arr[right];
            k++;
            right++;
        }

        for(int i = low; i <= high; i++) {
            arr[i] = temp[i-low];
        }
    }
}