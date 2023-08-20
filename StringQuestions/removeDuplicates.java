/*
  Question : -> 
    Remove duplicates from a given String
    Given a string S, the task is to remove all the duplicates in the given string. 
*/

// Approach - 1
import java.util.Arrays;
public class removeDuplicates {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(removeDup(str));
    }

    public static char[] removeDup(String str){
        char strCharArr[] = str.toCharArray();
        int ind = 0;
        for(int i = 0; i < strCharArr.length; i++){
            int j;
            for(j = 0; j < i; j++){
                if(strCharArr[i] == strCharArr[j]) break;
            }
            if(i == j){
                strCharArr[ind++] = strCharArr[i];
            }
        }
        return Arrays.copyOf(strCharArr, ind);
    }
}
/*
i/p : "geeksforgeeks"
o/p : "geksfor"
*/

// Time Complexity :  O(n ^ 2)
// Space Complexity : O(1) 

// ----------------------------------------------------------------------------------------------------------

// Aproach - 2 :
public static String removDup(String str){
    char strCharArr[] = str.toCharArray();
    Arrays.sort(strCharArr);
    str = new String(strCharArr);
    int ind = 1, mov_ind = 1;
    while(mov_ind != strCharArr.length){
        if(strCharArr[mov_ind] != strCharArr[mov_ind - 1]){
            strCharArr[ind++] = strCharArr[mov_ind];
        }
        mov_ind++;
    }
    str = new String(strCharArr);
    return str.substring(0, ind);
}

/*
i/p : "geeksforgeeks"
o/p : "efgkors"  -> Here though we can get output, order is altered.
*/

// Time Complexity :  O(n * log n)
// Space Complexity : O(1) 

// ----------------------------------------------------------------------------------------------------------
