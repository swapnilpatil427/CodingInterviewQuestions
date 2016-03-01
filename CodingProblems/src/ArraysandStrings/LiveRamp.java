package ArraysandStrings;

public class LiveRamp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] A = {1, 3, 1, 4, 2,  5};	
		//System.out.println(solution(5,A,1));
		//int[] A = {2};	
		//System.out.println(solution(1,A,2));
		int[] A = {100,1000,2000,3000,4000,4001};	
		System.out.println(solution(5001,A,1000));

	}
	
	static int solution(int X, int[] A, int D) {
	    // write your code in C99 (gcc 4.8.2)
    	boolean[] bitMap = new boolean[X+D]; 
	    int count=0;
	   
	    if ( X < D) {
	    	return 0;
	    } else if (A.length == 0) {
	        return -1;
	    }
		for (int j=0; j < D ; j++)
    	{
    		if(bitMap[j]== false) {
    			bitMap[j] = true;
    			count++;
    		}
    	}
		
		if(count >=X) {
    		return 1;
		}
		
	    for(int i=0;i<A.length;i++) {
	    	for (int j=A[i];j < A[i] + D ;  j++)
	    	{
	    		if(bitMap[j]== false) {
	    			bitMap[j] = true;
	    			count++;
	    		}
	    	}	
	    	
	    	if(count >= X) {	
	    		if(i == 0){
	    			return 0;
	    		}else {
	    			return i;
	    		}
	    	}	    	
	    }
	    
	   return -1;
	}
}
