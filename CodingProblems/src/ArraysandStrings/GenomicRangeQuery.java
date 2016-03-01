package ArraysandStrings;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
		int[][] nucleotide = new int[S.length()][4];
	    int result[] = new int[P.length];
	
	     
	    for(int i=0; i < S.length(); i++) {
	        if(S.charAt(i) == 'A') {
	            nucleotide[i][0] = 1;
	        } else if(S.charAt(i) == 'C') {
	            nucleotide[i][1] = 1;
	        } else if(S.charAt(i) == 'G') {
	             nucleotide[i][2] = 1;
	        } else {
	             nucleotide[i][3] = 1;
	        }
	
	         if(i != 0) {
	            for(int j=0; j < 4 ; j++) {
	                
	                nucleotide[i][j] += nucleotide[i-1][j];
	
	            }
	        }     
	    }
	
	     for(int i=0; i < P.length; i++) {
	        int x = P[i];
	        int y = Q[i];
	       for(int a = 0; a < 4; a++){
	           int sub = 0;
	           if(x-1 >= 0) sub = nucleotide[x-1][a];
	               if(nucleotide[y][a] - sub > 0){
	                  result[i] = a+1;
	                  break;
	           }
	        }
	    }
	    
	    return result; 
    }
}
