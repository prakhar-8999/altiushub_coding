class Solution {
    public int binarySearch(int arr[], int low, int high, int x){
        if (high >= low){
            int mid = low + (high - low) / 2;
            if(arr[mid] == x) return mid;
            if(arr[mid] > x) return binarySearch(arr, low, mid - 1, x);
            return binarySearch(arr, mid + 1, high, x);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int result = binarySearch(nums, 0, nums.length - 1, target);
        return result;
    }
}