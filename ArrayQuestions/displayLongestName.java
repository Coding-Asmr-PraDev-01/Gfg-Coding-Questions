/*
  Question => 
    Given a list of names, display the longest name.
*/

public static String longest(String names[], int n) {
    String longestStr = names[0];
    for(int i = 1; i < n; i++){
        if(longestStr.length() < names[i].length()){
            longestStr = names[i];
        }
    }
    return longestStr;
}
