/*
  Question => 
    Find the missing element from an ordered array arr[], 
    consisting of N elements representing an Arithmetic Progression(AP).
*/

public static int MissingElementOfAP {
    int findMissing(int[] arr, int n) {
        // code here
        int diff = (arr[n - 1] - arr[0]) / n;
        int firstTerm = arr[0];
        for(int i = 0; i < n; i++){
            int apTerm = firstTerm  + (i * diff); 
            if(apTerm != arr[i]){
                return apTerm;
            }
        }
        return -1;
    }
}
