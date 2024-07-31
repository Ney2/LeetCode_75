class RecentCounter {
    Queue<Integer> result;
    public RecentCounter() {
        result = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        result.add(t);
        while(result.peek() < t - 3000){
            result.poll();
        }

        return result.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */