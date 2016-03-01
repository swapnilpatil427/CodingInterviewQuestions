package ArraysandStrings;
import java.util.HashSet;
import java.util.Set;

public class minmerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] A = {4,7,3,9,2,45,78,787};
		 Set s = new HashSet();
	        int[] B = {12,40,32,78,23,42,12,23,34};
	        int min = Integer.MAX_VALUE,flag=0; 
		       // min = -1;
		        for(int i=0;i<A.length;i++){
		            for(int j=0;j<B.length;j++){
		                if(A[i]==B[j])
		                {	
		                    flag = 1;
			                	if(B[j] <= min)
			                	{
			                		min = B[j];			                		
			                	}
			                	break;	
			                	
		                }             	
		            }
		        }
		   if(flag == 0)
			   System.out.println(-1);
		    else
		    	 System.out.println(min);
	       // System.out.println(min);
	}

}
