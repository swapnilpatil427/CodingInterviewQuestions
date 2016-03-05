package LogicalQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MyOwnMutexLocks {
	/* Let X is the variable [0-100000]
	 * We can either Acquire lock on X or 	Release a lock
	   
	  We can have two operation - 
	  ACQUIRE X
	  RELEASE X
	  
	  Rules
	  Rule 1 - RELEASE should happen in reverse order of ACQUIRE
	  Example 1: 
	  Input - 
	  ACQUIRE 364 
	  ACQUIRE 84
	  RELEASE 364
	  RELEASE 84
	  
	  Output :
	  3 // As at the third location our property is violated, last acquired lock was 84, so 84 should be released first.
	  
	  Rule 2 - Cannot be released until lock is Acquired.
	   Example 2: 
	  Input - 
	  ACQUIRE 364 
	  RELEASE 84
	  RELEASE 364
	  
	  Output :
	  2 // 84 is released before acquiring the lock.
	  
	  Rule 3 - All the acquired locks must be released before exiting.
	   Example 3: 
	  Input - 
	  ACQUIRE 364 
	  ACQUIRE 84
	  RELEASE 84
	  RELEASE 364
	  ACQUIRE 56
	  
	  Output :
	  5 // 56 is not released before exiting the code. 
	 *  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] events = {"ACQUIRE 364", "ACQUIRE 84", "RELEASE 84","RELEASE 364","ACQUIRE 56"};
		System.out.println(checkConditions(events));	
	}
	
	public static int checkConditions(String[] events) {
		Stack<Integer> stack = new Stack<Integer>();
		Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		int i = 0;
		for(i = 0;i < events.length; i++) {
			String[] event = events[i].split(" ");
			String command = event[0];
			int lockLoc = Integer.parseInt(event[1]);
			if(command.equalsIgnoreCase("ACQUIRE")) {
				map.put(lockLoc, true);
				stack.add(lockLoc);
			} else if (command.equalsIgnoreCase("RELEASE")) {
				int temp = 0;
				boolean check = map.containsKey(lockLoc);
				if(check && map.get(lockLoc) ==  true) {
				  if(stack.peek() != lockLoc) {
					  return (i+1);
				  } else {
					  stack.pop();
				  }
				} else {
					return (i+1);
				}
			} else {
				return -1;
			}
		}
		
		if(stack.isEmpty()) {
			return 0;
		} else {
		    return i;
		}
	}

}
