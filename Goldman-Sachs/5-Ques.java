// brilliant use of TreeSet sata structure.
// https://practice.geeksforgeeks.org/problems/ugly-numbers2254/1/#

long getNthUglyNo(int n) {
        // code here
    TreeSet<Long> set = new TreeSet<>();
    set.add(1L);
    int i = n;
    long j = 0;
    while(i!=0) {
        j = set.pollFirst();
        set.add(j*2);
        set.add(j*3);
        set.add(j*5);
        i--;
    }
    return j;
}
