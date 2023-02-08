package com.edge.interview;
/**
 * @author edge
 *	//https://www.careercup.com/question?id=6262507668766720
		You are given a binary array with N elements: d[0], d[1], ... d[N - 1].
		You can perform AT MOST one move on the array: choose any two integers [L, R], and flip all the elements between (and including) the L-th and R-th bits. L and R represent the left-most and right-most index of the bits marking the boundaries of the segment which you have decided to flip.
		What is the maximum number of '1'-bits (indicated by S) which you can obtain in the final bit-string?
		'Flipping' a bit means, that a 0 is transformed to a 1 and a 1 is transformed to a 0 (0->1,1->0).
		Input Format
		An integer N
		Next line contains the N bits, separated by spaces: d[0] d[1] ... d[N - 1]
		
		Output:
		S		
		Constraints:
		1 <= N <= 100000
		d[i] can only be 0 or 1f
		0 <= L <= R < n
				
		Sample Input: 8 : 		1 0 0 1 0 0 1 0		
		Sample Output: 	6		
		Explanation:		
		We can get a maximum of 6 ones in the given binary array by performing either of the following operations:
		Flip [1, 5] ==> 1 1 1 0 1 1 1 0
 */
public class Flip {
	public static void flipBits(int[] a) {

		int maxDiff = 0;
		int flipStartIndex = 0;
		int flipEndIndex = -1;
		int onesToFlip = 0;
		int totalNumberOfOnes = 0;

		int currentDiff = 0;
		int currentStart = 0;
		int currentOnesToFlip = 0;

		for (int i = 0; i < a.length; i++) {
		    if (a[i] == 0) {
				currentDiff -= 1;
		    } else {
				currentDiff += 1;
				currentOnesToFlip++;
				totalNumberOfOnes++;
		    }
		    if (currentDiff < maxDiff) {
				maxDiff = currentDiff;
				flipStartIndex = currentStart;
				flipEndIndex = i;
				onesToFlip = currentOnesToFlip;
		    } else if (currentDiff > 0) {
				currentDiff = 0;
				currentStart = i + 1;
				currentOnesToFlip = 0;
		    }
		}
		System.out.println(flipEndIndex - flipStartIndex + 1 - onesToFlip +   totalNumberOfOnes - onesToFlip);
}
       
    //  Driver code to test above method 
    public static void main(String args[]) 
    { 
        int [] str = {1,0,1,0}; 
        flipBits(str);
     
		
		
    } 
} 