/*
  Question => 
  You are given an array A, of N elements. 
  Find minimum index based distance between two elements of the array, x and y such that (x!=y).
*/

// Approach - 1
int minDist(int a[], int n, int x, int y) {
        // code here
        int ans = Integer.MAX_VALUE;
        int xCount = 0, yCount = 0;
        for(int i = 0; i < n; i++){
            if(a[i] == x){
                xCount = i + 1;
            }
            if(a[i] == y){
                yCount = i + 1;
            }
            
            if(xCount > 0 && yCount > 0){
                ans = Math.min(ans, Math.abs(xCount - yCount));
            }
        }
        
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        
        return ans;
        
    }
