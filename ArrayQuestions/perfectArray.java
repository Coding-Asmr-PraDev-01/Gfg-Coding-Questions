/*
    Question => 
    Given an array of size N and you have to tell whether the array is perfect or not.
    An array is said to be perfect if its reverse array matches the original array.
    If the array is perfect then return True else return False.
*/

// Brute Force Unoptimized Solution
public static void perfectArr(int arr[]){
    int len = arr.length;
    int newArr[] = new int[len];
    int isPerfect = 1;
    for(int i = len - 1; i >= 0; i--){
      newArr[len - i - 1] = arr[i];  
    }
    for(int i = 0; i < len; i++){
      if(arr[i] != newArr[i]){
        isPerfect = 0;
      }
    }
    if(isPerfect == 1){
      System.out.println("PERFECT");
    }else{
      System.out.println("NOT PERFECT");
    }
  }

// Optimized Solution
public static Boolean perfect2(int a[]){
     // Complete the function
    int n = a.length;
        boolean isPerfect = false;
        if(n == 1){
            return true;
        }
        
        for(int i = 0; i < n/2; i++){
            isPerfect = false;
            if(a[i] == a[n-(i+1)])
                isPerfect = true;
        }
      return isPerfect;
  }
