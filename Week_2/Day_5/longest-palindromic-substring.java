class Solution {
    public boolean palindrom(String s,int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxlen = 1;
        for(int i = 0; i<n; i++){
            for(int j = i;j<n ; j++){
                if(palindrom(s,i,j)){
                    maxlen = Math.max(maxlen,j-i+1);
                }
            }
        }
        for(int i = 0; i<=n - maxlen;i++){
            if(palindrom(s,i,i+maxlen-1)){
                return s.substring(i,i+maxlen);
            }
        }
        return "";
    }
}
