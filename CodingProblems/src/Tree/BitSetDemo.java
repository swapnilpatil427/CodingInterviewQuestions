package Tree;

import java.util.BitSet;

public class BitSetDemo {
	public static void main(String[] args){
		BitSet b = new BitSet(26);
		String s = "";
		b.cardinality();
		int[] a = {7,8,9,1,2,3,4,5,6};
		System.out.println(binarySearch(a,6));
	}
	
	static boolean binarySearch(int[] a, int data) {
        int low = 0;
        int high = a.length - 1;
        int mid = (low + high)/2;
        while(low <= high) 
         {
        	mid = (low + high)/2;
             if(a[mid] > data ){
                 if(data < a[high]) {
                   low = mid + 1;
                 } else
                 high= mid - 1;
             }
             else if(a[mid] < data ) {
                 if(data > a[high]) {
                 high= mid - 1;
                 } else {
                 low = mid + 1;
                 }
             } else {
                 return true;
             }
         }
         
         return false;
                   
}
}
