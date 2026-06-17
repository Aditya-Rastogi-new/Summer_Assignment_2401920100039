class Solution {
    public boolean similarPair(char top, char ch){
        if(top == '{' && ch == '}') return true;
        if(top == '(' && ch == ')') return true;
        if(top == '[' && ch == ']') return true;
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if(n%2 == 1) return false;
        for(int i = 0; i<n ; i++){
            char ch = s.charAt(i);
            if(ch == '[' || ch == '(' || ch == '{'){
                st.push(ch);
            }
            else{
                if(st.size() == 0) return false;
                char top = st.peek();
                if(similarPair(top,ch)){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return (st.size()==0);
    }
}
