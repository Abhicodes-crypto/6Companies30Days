// https://practice.geeksforgeeks.org/problems/run-length-encoding/1/
String encode(String str)
	{
          //Your code here
          String ans = "";
          int i = 0, j =0;
          int n = str.length();
          while(j < n){
            char ch = str.charAt(j);
            while( j < n && str.charAt(j)==ch) {
              j++;
            }
            int h = j-i;
            ans+= ch + Integer.toString(h);
            i = j;
          }
          return ans;
          
	}
