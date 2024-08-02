class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant_queue = new LinkedList<>();
        Queue<Integer> dire_queue = new LinkedList<>();

        for(int i = 0; i < senate.length(); i++) {
            if(senate.charAt(i) == 'R'){
                radiant_queue.offer(i);
            } else {
                dire_queue.offer(i);
            }
        }

        int length = senate.length();
        while(!radiant_queue.isEmpty() && !dire_queue.isEmpty()) {
            int radiant = radiant_queue.poll();
            int dire = dire_queue.poll();

            if(radiant < dire) {
                radiant_queue.offer(radiant + length);
            } else {
                dire_queue.offer(dire + length);
            }
        }

        return radiant_queue.isEmpty() ? "Dire" : "Radiant";
    }
}