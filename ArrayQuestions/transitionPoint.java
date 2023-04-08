/*
  Question => 
    Given a sorted array containing only 0s and 1s, find the transition point. 
    Input:
      N = 5
      arr[] = {0,0,0,1,1}
    Output: 3
      Explanation: index 3 is the transition 
      point where 1 begins.
*/

// Approach - 1                 TC -> O(n)
public static int transitionPoint(int arr[], int n) {
    for(int i = 0; i < n; i++){
        if(arr[i] == 1 && arr[n - 1] == 1 ) return 0;
        if(arr[i] == 0 && arr[n - 1] == 0 ) return -1;
        if(arr[i] == 0 && arr[i + 1] == 1){
            return (i + 1);
        }
    }
}
