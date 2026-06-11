class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char t;
        for (int i=0;i<s.length();i++){
            t = s.charAt(i);
            if (t == '('|| t == '['|| t == '{'){st.push(t);}
            else{
                if (st.isEmpty()){return false;}
                else if (t == ')' && st.peek() == '('){st.pop();}
                else if (t == ']' && st.peek() == '['){st.pop();}
                else if (t == '}' && st.peek() == '{'){st.pop();}
                else{return false;}
            }
        }
        if (st.isEmpty()){return true;}
        return false;
    }
}