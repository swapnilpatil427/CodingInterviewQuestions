package ArraysandStrings;
import java.util.HashMap;
import java.util.Map;

public class CountSubString {
	static int palindrome(String str) {
	    Map<String, Integer> m = new HashMap<String, Integer>();
	    int n = str.length();
	 
	    // table for storing results (2 rows for odd-
	    // and even-length palindromes
	    int[][] R = new int[2][n+1];
	 
	    // Find all sub-string palindromes from the given input
	    // string insert 'guards' to iterate easily over s
	    str = "@" + str + "#";
	        
	    for (int j = 0; j <= 1; j++)
	    {
	        int rp = 0;   // length of 'palindrome radius'
	        R[j][0] = 0;
	 
	        int i = 1;
	        while (i <= n)
	        {
	            //  Attempt to expand palindrome centered at i
	            while (str.charAt(i - rp - 1) == str.charAt(i + j + rp))
	                rp++;  // Incrementing the length of palindromic
	                       // radius as and when we find vaid palindrome
	 
	            // Assigning the found palindromic length to odd/even
	            // length array
	            R[j][i] = rp;
	            int k = 1;
	            while ((R[j][i - k] != rp - k) && (k < rp))
	            {
	                R[j][i + k] = Math.min(R[j][i - k],rp - k);
	                k++;
	            }
	            rp = Math.max(rp - k,0);
	            i += k;
	        }
	    }
	        
	    str = str.substring(1, n+1);
	    m.put(str.charAt(0)+"",1);
	   // m[string(1, str[0])]=1;
	    for (int i = 1; i < n; i++)
	    {
	        for (int j = 0; j <= 1; j++){
	            for (int rp = R[j][i]; rp > 0; rp--) {
	            	if((i - rp - 1) < (2 * rp + j))
	                 m.put(str.substring(i - rp - 1, 2 * rp + j),1);
	            }
	        }
	        
	        m.put(str.charAt(i)+"",1);
	    }
	    return m.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(palindrome("aabaa"));
	}

}
