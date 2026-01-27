class Solution {
    private static boolean isPali(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String ans ="";
        int maxLen = 0;

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(isPali(s,i,j)){
                    int len = j-i+1;
                    if(len > maxLen){
                        maxLen = len;
                        ans = s.substring(i,j+1);
                    }

                }
            }
        }
        return ans;        
        
    }
}