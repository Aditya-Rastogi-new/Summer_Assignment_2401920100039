class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        if(m == 0) return true;
        if(m>n) return false;
        int j = 0;
        for(int i = 0; i<n; i++){
            if(s.charAt(j)==t.charAt(i)){
                j++;
            }
            if(j == m) break;
        }
        if(j == m) return true;
        return false;
    }
}
