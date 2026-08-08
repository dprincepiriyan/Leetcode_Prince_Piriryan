class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        if(s.length()==1){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }else if((!stack.isEmpty())&&(s.charAt(i)==')' && stack.peek()=='(')){
                stack.pop();
            }else if((!stack.isEmpty())&&(s.charAt(i)==']' && stack.peek()=='[')){
                stack.pop();
            }else if((!stack.isEmpty())&&(s.charAt(i)=='}' && stack.peek()=='{')){
                stack.pop();
            }else{
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}