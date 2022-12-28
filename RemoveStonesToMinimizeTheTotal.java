class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->b-a); 
        int total = 0;
        for(int p : piles)
        {
            pq.add(p);
            total+=p;
        }
        while(k>0)
        {
            int current = pq.poll();
            pq.add(current- current/2);
            total-= (current/2);
            k--;
        }
        return total;
    }
}