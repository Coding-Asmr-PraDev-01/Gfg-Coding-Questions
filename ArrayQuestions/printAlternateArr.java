public static void printAlternateArr(int arr[]) {
    int len = arr.length;
    for(int i = 0; i < len; i += 2){
      System.out.print(arr[i] + " ");
    }
  }
