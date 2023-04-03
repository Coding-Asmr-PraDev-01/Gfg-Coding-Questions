/*
  Question => 
  Given a binary array A[] of size N. The task is to arrange the array in increasing order.
  Note: The binary array contains only 0  and 1.
*/

public static void binSort(int A[], int N){
     int i = -1;
     int pivot = 0;
     for(int j = 0; j < N; j++){
         if(A[j] <= pivot){
             i++;
             int temp = A[i];
             A[i] = A[j];
             A[j] = temp;
         }
     }
}
