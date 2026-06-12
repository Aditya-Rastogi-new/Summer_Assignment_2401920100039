class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        boolean[] used = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (used[i]) continue;
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            used[i] = true;
            for (int j = i + 1; j < strs.length; j++) {
                if (!used[j] && isAnagram(strs[i], strs[j])) {
                    list.add(strs[j]);
                    used[j] = true;
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
