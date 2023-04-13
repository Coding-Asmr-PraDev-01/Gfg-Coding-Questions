/*
  Question => 
    N frogs are positioned at one end of the pond. All frogs want to reach the other end of the pond as soon as possible. 
    The pond has some leaves arranged in a straight line. Each frog has the strength to jump exactly K leaves.
    For example, a  frog having strength 2 will visit the leaves 2, 4, 6, ...  etc. while crossing the pond.

  Given the strength of each frog and the number of leaves, your task is to find the number of leaves that not be
  visited by any of the frogs when all frogs have reached the other end of the pond
*/

// Approach - 1
 public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        boolean visited[] = new boolean[leaves + 1];
        Arrays.fill(visited, false);
        
        for(int i = 0; i < N; i++){
            int num = frogs[i];
            
            if(num <= leaves && !visited[num]){
                for(int j = num; j <= leaves; j += num){
                    visited[j] = true;
                }
            }
        }
        
        // Count the leftover leaves
        int count = 0;
        for(int i = 1; i <= leaves; i++){
            if(!visited[i]){
                count++;
            }
        }
        return count;
}
