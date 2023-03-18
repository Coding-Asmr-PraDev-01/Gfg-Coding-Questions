/*
  Question => 
  Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.
*/

// Approach - 1
 public static long[] atLeastTwoGreater( long a[], long n){
    // Your code goes here
    Arrays.sort(a);
    long newArr[] = new long[a.length - 2];
    for(int i = 0; i < newArr.length; i++){
      newArr[i] = a[i];
    }
    return newArr;
}
