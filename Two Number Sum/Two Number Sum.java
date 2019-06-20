/*
  problem: given an array and a value X you have to find whether a pair exist in the array, whose sum is equal to X
  solution: 1. sort the array
            2. take two pointers left and right, left indicates leftmost element and right indicates rightmost element
            3. iterate till left == right (step 3-6)
            4. if left and right pointer sum is equal, pair exist
            5. if left + right > X, right--
            6. else left++
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static int pairSum(int arr[], int n, int x) {
        
        Arrays.sort(arr);
        
        int left = 0;
        int right = n - 1;
        
        while( left < right) {
            
            if( (arr[left] + arr[right]) == x ) {
                return 1;
            }
            else if( (arr[left] + arr[right]) > x ) {
                right--;
            }
            else {
                left++;
            }
        }
        
        return 0;
    }
    
	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while( t > 0 ) {
		    int n = scanner.nextInt();
		    int x = scanner.nextInt();
		    int[] arr = new int[n];
		    
		    for( int i = 0; i < n; i++ ) {
		        arr[i] = scanner.nextInt();
		    }
		    
		    if( pairSum(arr, n, x) == 1 ) {
		        System.out.println("Yes");
		    }
		    else {
		        System.out.println("No");
		    }
		    t--;
		}
	}
}
