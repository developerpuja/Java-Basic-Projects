// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Day3_FindMissingNumberFromArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.MissingNumber(array, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int MissingNumber(int[] arr, int n) {
        // Your Code Here
        // Arrays.sort(arr);
       // int sum = 0;
        int sum=((n)*(n+1))/2;
      
        // for(int i = arr[0]; i<=arr.length+1; i++) {
        //      sum += i;
        // }
        
        for(int i = 0; i < arr.length; i++) {
             sum-=arr[i];
        }
        
        return sum;
    }
}