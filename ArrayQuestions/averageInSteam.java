/*
  Question => 
    Given a stream of incoming numbers, find average or mean of the stream at every point.
*/

// Approach-1
public static float[] streamAvg(int[] arr, int n) {
    float ansArr[] = new float[n];
    for(int i = 0; i < n; i++){
      float mean = 0;
      for(int j = 0; j <= i; j++){
        mean += (arr[j]);
      }
      mean = mean / (i + 1);
      ansArr[i] = mean;
    }
    return ansArr;
}

// Approach-2
public static float[] streamAvg(int[] arr, int n) {
    float [] newArr = new float[n];
    float add = 0;
    for(int i = 0; i < arr.length; i++){
        add = add + arr[i];
        newArr[i] = add / (i+1); 
    }
    return newArr;
}
