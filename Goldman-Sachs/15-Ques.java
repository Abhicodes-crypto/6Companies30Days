// https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1#
// modulo , easy problem.

public boolean canPair(int[] nums, int k) {
        // Code here
        int len = nums.length;
        if((len&1) == 1) {
            return false;
        }
        int freq[] = new int[k];
        for(int i = 0 ; i < len ; ++i) {
            freq[nums[i]%k]++;
        }
        if((freq[0]&1)==1) {
            return false;
        }
        int i = 1, j = k-1;
        while(i<j) {
            if(freq[i]!=freq[j]) return false;
            i++; j--;
        }
        return true;
    }
