class Solution {
    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (isInteger(tokens[i])) {
                int num = Integer.parseInt(tokens[i]);
                st.push(num);
            } else {
                int num1 = st.pop();
                int num2 = st.pop();
                switch (tokens[i]) {
                    case "+":
                        st.push(num2 + num1);
                        break;
                    case "-":
                        st.push(num2 - num1);
                        break;
                    case "*":
                        st.push(num2 * num1);
                        break;
                    case "/":
                        st.push(num2 / num1);
                        break;
                }
            }
        }
        return st.peek();
    }
}
