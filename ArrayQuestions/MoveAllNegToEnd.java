/*
  Question => 
    Given an unsorted array arr[] of size N having both negative and positive integers. 
    The task is place all negative element at the end of array without changing the order of positive element and negative element.
*/

// Approach - 1         Time Complexity => O(3n) and Space Complexity => O(n)
 public void segregateElements(int arr[], int n){
      int newArr[] = new int[n], ind = 0;
      for(int i = 0; i < n; i++){
          if(arr[i] > 0){
              newArr[ind++] = arr[i];
          }
      }

      for(int i = 0; i < n; i++){
          if(arr[i] < 0){
              newArr[ind++] = arr[i];
          }
      }

     for(int i = 0; i < n; i++){
         arr[i] = newArr[i];
     }
}

