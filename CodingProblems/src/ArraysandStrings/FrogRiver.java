package ArraysandStrings;

import java.util.BitSet;

public class FrogRiver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {7,4,3,2,5,1,8};
		
		System.out.println(solution(9,A,3));

	}
	
	static int solution(int X, int[] A, int D) {
	    // write your code in C99 (gcc 4.8.2)
		 int[] bitMap = new int[X]; 
		    int currPosition=0;
		    int i;
		    for(i=0;i<A.length;i++) {
		    	if(A[i]<= X) {
			        if(bitMap[A[i]] == 0) {
			        	bitMap[A[i]] =i+1;
			        }
		    	}       
		    }
		    
		    i=0;
		    while (currPosition<=X){
		        if(currPosition + D >= X) {
		            return (currPosition == 0)? 0 : bitMap[currPosition]-1; 
		    	}
		    	
		    	if(bitMap[currPosition + D] > 0 && (bitMap[currPosition]>0 || currPosition == 0) ) {	
		    		currPosition = currPosition + D;
		    	} else
		    	{
		    		currPosition++;
		    	}	    
		    }
		    
		   return -1;
		
	}

}
