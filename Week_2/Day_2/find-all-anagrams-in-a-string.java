class Solution {
    public boolean matches(int [] freq1,int [] freq2){
        for(int i = 0; i<26;i++){
            if(freq1[i]!=freq2[i])return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        if(n<m) return list; 
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i = 0; i<m; i++){
            freq1[p.charAt(i)-'a']++;
            freq2[s.charAt(i)-'a']++;
        }
        if(matches(freq1,freq2)) list.add(0);
        for(int i = m; i<n; i++){
            freq2[s.charAt(i)-'a']++;
            freq2[s.charAt(i-m)-'a']--;
            if(matches(freq1,freq2)) list.add(i-m+1);
        }
        return list;
    }
}
