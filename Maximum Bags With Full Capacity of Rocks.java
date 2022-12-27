class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int [] diff = new int[capacity.length];
        for(int i =0 ; i < capacity.length; i++)
        {
            diff[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(diff);

        int count = 0;
        for(int i = 0 ; i < diff.length;i++)
        {
            if(diff[i]==0)
            {
                count++;
            }else
            {
                if(additionalRocks>=diff[i])
                {
                    additionalRocks -= diff[i];
                    count++;
                }
            }
        }

        return count;
    }
}