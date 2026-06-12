class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0;
        StringBuilder sb=new StringBuilder();

        while(i<n){
            int j=i;
            while(j<n&&chars[j]==chars[i]){
                j++;
            }
            int count=j-i;
            sb.append(chars[i]);
            if(count>1){
                sb.append(count);
            }
            i=j;
        }

        for(i=0;i<sb.length();i++){
            chars[i]=sb.charAt(i);
        }
        return sb.length();
    }
}
