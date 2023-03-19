/*
  Question => 
  Given a sorted array of size N and an integer K, 
  find the position(0-based indexing) at which K is present in the array using binary search.
*/

// Approach - 1
public static int binarysearch(int arr[], int n, int k) {
    // code here
    int start = 0, end = n - 1;
    while(start <= end){
        int mid = (start + end) / 2;
        if(arr[mid] == k){
            return mid;
        }else if(k < arr[mid]){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
    }
    return -1;
}
