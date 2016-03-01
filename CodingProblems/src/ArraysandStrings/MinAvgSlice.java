package ArraysandStrings;

public class MinAvgSlice {
	 public int solution(int[] A) {
	        // write your code in Java SE 8
	        
	        float minavg=Integer.MAX_VALUE;
	        int index=0;
	        for(int i=0; i<A.length-2;i++) {
	            float two = ((float)A[i]+(float)A[i+1])/2 ;
	            float three = ((float)A[i]+(float)A[i+1]+(float)A[i+2])/3;
	            float  avg = two < three ? two : three;
	            if(avg < minavg) {
	                minavg = avg;
	                index = i;
	            }
	        }
	        
	        if(((float)A[A.length-2]+(float)A[A.length-1])/2 < minavg) {
	            return A.length - 2;
	        } else {
	            return index;
	        }
	    }
}
