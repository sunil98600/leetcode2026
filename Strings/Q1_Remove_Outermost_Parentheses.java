package Strings;

public class Q1_Remove_Outermost_Parentheses {
  //bruteforce approach
  public static String removeOuterParentheses(String s) {
        StringBuilder result  = new StringBuilder();
        int depth = 0;
        int start = 0;
        for(int i=0;i < s.length();i++){
            if(s.charAt(i) == '(') depth++;
            else depth--;

            if(depth == 0){
                result.append(s,start+1,i);
                start = i+1;
            }
        }
        return result.toString();
    }

    //Optimal Approach
    public static String removeOuterParenthesesOptimal(String s) {
        StringBuilder result  = new StringBuilder();
        int depth = 0;

        for(char c : s.toCharArray()){
            if(c == '(' && depth++ > 0) result.append(c);
            if(c == ')' && --depth > 0) result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(Q1_Remove_Outermost_Parentheses.removeOuterParentheses(s));
        System.out.println(Q1_Remove_Outermost_Parentheses.removeOuterParenthesesOptimal(s));
    }
}
