class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        // 여는 괄호를 스택에 추가
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // 스택이 비어있는 경우 유효하지 않음
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                // 닫는 괄호와 스택의 상단 괄호가 매칭되는지 확인
                if((c == ')' && top != '(') || 
                   (c == ']' && top != '[') || 
                   (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        // 스택이 비어있어야 유효함
        return stack.isEmpty();
    }
}