public class GenerateParenthesis {
//    public StringBuilder strBuilder = new StringBuilder();
//    public List<String> result = new ArrayList();
//
//
//    public List<String> solution(int n) {
////        track(0, 0, n);
////        return result;
//        if(n==1) return new ArrayList<String>(Arrays.asList("()"));
//        Set<String> set=new HashSet<String>();
//        for(String str:generateParenthesis(n-1)){
//            for(int i=0;i<str.length();i++){
//                set.add(str.substring(0,i+1)+"()"+str.substring(i+1,str.length()));
//            }
//        }
//        List<String> list = new ArrayList<String>(set);
//        return list;
//    }
//
//
//
//    public void track(int openParenthesisUsed, int closedParenthesisUsed, int n) {
//
//        // if there are still available open parenthesis: (openParenthesisUsed < n)
//        if (openParenthesisUsed < n) {
//            strBuilder.append("(");
//            track(openParenthesisUsed + 1, closedParenthesisUsed, n);
//            strBuilder.deleteCharAt(strBuilder.length() - 1);
//        }
//
//        // if more open parenthesis are used than closed parenthesis
//        if (closedParenthesisUsed < openParenthesisUsed) {
//            strBuilder.append(")");
//            track(openParenthesisUsed, closedParenthesisUsed + 1, n);
//            strBuilder.deleteCharAt(strBuilder.length() - 1);
//        }
//
//        // if all open and closed parentheses have been consumed
//        if ((openParenthesisUsed == n) && (closedParenthesisUsed == n)) {
//            result.add(strBuilder.toString());
//            return;
//        }
//
//    }
}
