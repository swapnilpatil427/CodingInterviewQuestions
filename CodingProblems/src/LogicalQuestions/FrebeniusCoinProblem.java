package LogicalQuestions;

/* Given two coins of denominations “X” and “Y” respectively, 
 * find the largest amount that cannot be obtained using these
 *  two coins (assuming infinite supply of coins) followed by 
 *  the total number of such non obtainable amounts, if no such 
 *  value exists print -1 */
public class FrebeniusCoinProblem {
	/* Calculates the GCD of two numbers */
	static int gcd(int a,int b) {
		int c;
		while(a != 0) {
			c = a;
			a = b%a;
			b = c;
		}
		
		return b;	
	}	
	/* returns the frobenius Largest coin value */
	static int frobeniusCoins(int x,int y){
		if(gcd(x,y)!=1)
			return -1;
		else 
		    return (x*y)-(x+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int y = 5;
		System.out.println(frobeniusCoins(x,y));
	}
}
