class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < asteroids.length; i++){
            if(!stack.isEmpty() && stack.peek() > 0 && asteroids[i] < 0){
                if(Math.abs(stack.peek()) == Math.abs(asteroids[i])){
                    stack.pop();
                }
                else if(Math.abs(stack.peek()) < Math.abs(asteroids[i])){
                    stack.pop();
                    i--;
                }
            }
            else {
                stack.push(asteroids[i]); 
            }
        }

        int[] ans = new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}