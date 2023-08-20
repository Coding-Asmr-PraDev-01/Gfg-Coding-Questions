public static void main(String[] args) {
    String str1 = "pranay";
    String str2 = "prynaaimec";
    System.out.println(isMetaStrings(str1, str2));
}

// Approach - 1 
public static int isMetaStrings(String s1, String s2){
    if(s1.length() != s2.length() || s1.equals(s2)) return 0;
    int cnt = 0; int st_ind = 0; int end_ind = 0;
    for(int i = 0; i < s1.length(); i++){
        if(s1.charAt(i) != s2.charAt(i)){
            if(cnt == 0){
                st_ind = i;
                cnt++;
            }else{
                end_ind = i;
            }
        }
    }
    char s1CharArr[] = s1.toCharArray();
    char temp = s1CharArr[st_ind];
    s1CharArr[st_ind] = s1CharArr[end_ind];
    s1CharArr[end_ind] = temp;
    s1 = new String(s1CharArr);

    if(s1.equals(s2)) return 1;
    return 0;
}

/*
  i/p : s1 = "geeks", s2 = "keegs" 
  o/p : 1

  Time Complexity : O(n)
  Space Complexity : O(1)
*/
