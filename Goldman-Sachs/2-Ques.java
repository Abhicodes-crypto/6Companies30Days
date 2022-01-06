// https://practice.geeksforgeeks.org/problems/overlapping-rectangles1924/1/#
// In this question it is assumed that the rectangles are parallel to the axes, but 
// plot twist: what if they are not. Whats the solution then

int doOverlap(int l1[], int r1[], int l2[], int r2[]) {
    // code here
    if (l1[0] > r2[0] || l2[0] > r1[0])
        return false;

    // If one rectangle is above other
    if (r1[1] > l2[1] || r2[1] > l1[1])
       return false;

    return true;
}
