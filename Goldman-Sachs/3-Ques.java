// https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/#
/*
 New thing to learn : if array size is 'n' then number of subarrays is n*(n+1)/2 . if u add an elemnet to the array then size becomes n+1 and number of subarray becomes 
 (n*(n+1)/2 + n+1) .
 */

public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int i = 0, j = 0, ans = 0;
        long res = 1;
        while(j < n) {
            res*=a[j];
            while(res >= k) {
                res/=a[i];
                i++;
            }
            
            ans += j-i+1;
            j++;
        }
        return ans;
        
    }
