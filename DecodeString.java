class Solution {
    public String decodeString(String s) {
        Stack<Character> string_stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ']'){
                string_stack.push(s.charAt(i));
            } else {
                StringBuilder word = new StringBuilder();
                while(string_stack.peek() != '['){
                    word.append(string_stack.pop());
                }

                string_stack.pop();

                StringBuilder number = new StringBuilder();
                while(!string_stack.isEmpty() && Character.isDigit(string_stack.peek())) {
                    number.insert(0, string_stack.pop());
                }

                int counter = Integer.parseInt(number.toString());
                char words[] = word.reverse().toString().toCharArray();
                for(int j = 0; j < counter; j++){
                    for(char c : words){
                        string_stack.push(c);
                    }
                }
            }
        }

        StringBuilder result = new StringBuilder();
        while(!string_stack.isEmpty()){
            result.append(string_stack.pop());
        }

        return result.reverse().toString();
    }
}