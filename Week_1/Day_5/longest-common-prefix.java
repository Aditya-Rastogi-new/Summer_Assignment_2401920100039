class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        int n = strs.length;
        for (int i = 1; i < n; i++) {
            int j = 0;
            String prefix = "";
            String current = strs[i];
            int min = Math.min(ans.length(), current.length());
            while (j < min && ans.charAt(j) == current.charAt(j)) {
                prefix += ans.charAt(j);
                j++;
            }
            ans = prefix;
        }
        return ans;

    }
}
