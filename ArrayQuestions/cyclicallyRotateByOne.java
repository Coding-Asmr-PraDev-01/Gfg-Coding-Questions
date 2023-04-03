/*
  Question =>
    Given an array, rotate the array by one position in clock-wise direction.
*/

  public void rotateByOne(int arr[], int n){
      int lastEle = arr[n - 1];
      for(int i = n - 2; i >= 0; i--){
          arr[i + 1] = arr[i];
      }
      arr[0] = lastEle;
  }
