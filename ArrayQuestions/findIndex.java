/*
  Quetions => 
    Given an unsorted array Arr[] of N integers and a Key which is present in this array. 
    You need to write a program to find the start index( index where the element is first found from left in the array )
    and end index( index where the element is first found from right in the array ).
    If the key does not exist in the array then return -1 for both start and end index in this case.
*/

// Approach - 1

public static int[] findIndex(int a[], int key, int N){
 int ans[] = new int[]{-1, -1};
        int eleInd = -1;
        int isUnique = 0;
        for(int i = 0; i < N; i++){
            if(a[i] == key){
                if(eleInd == -1){
                    eleInd = i;
                }
                isUnique += 1;
            }
        }
        if(isUnique > 1){
            // for duplicate key
            for(int j = N - 1; j > eleInd; j--){
                if(a[j] == key){
                    ans[0] = eleInd;
                    ans[1] = j;
                    return ans;
                }
            }
        }else{
            // for unique key
            ans[0] = eleInd;
            ans[1] = eleInd;
            return ans;
        }
        return ans;
    } 
}


// Approach - 2
static int[] findIndex(int a[], int N, int key) { 
    int ans[] = new int[]{-1,-1};
    for(int i = 0;i<N;i++){
        if(a[i] == key){
            if(ans[0] == -1){
                ans[0] = i;
            }
            ans[1] = i;
        }
    }
    return ans;        
}

