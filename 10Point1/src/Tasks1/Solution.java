package Tasks1;

public class Solution {
	private static final int DEFAULT_CAPACITY = 500000;	//Actual we need to support to increase/reduce capacity
	public int[] stack = new int[DEFAULT_CAPACITY];
	private int size = 0;
	
	private static final int MAX_TRANSACTIONS = 100000; //Actual we need to support to increase/reduce  capacity
	private int[] txIndex = new int[MAX_TRANSACTIONS];
	private int txMax = 0;
	
	public void push(int value){
		stack[size] = value;
		size++;
	}
	
	public int top() {
		if (size == 0) {
			return 0;
		}
		return stack[size - 1];
	}
	
	public void pop() {
		if (size > 0) {
			 stack[size - 1] = 0;
			 size--;
		}
	}
	
	public void begin() {
		txIndex[txMax] = size;
		txMax++;
	}
	
	public Boolean rollback() {
		if (txMax == 0) {
			return false;
		}
		
		txMax--;
		size = txIndex[txMax];
		
		return true;
	}
	
	public Boolean commit() {
		if (txMax == 0) {
			return false;
		}

		txMax--;
		return true;
	}
	
	

	
	public static void Test(){
		example1();
		example2();
	}
	
	public static void example1() {
        Solution sol = new Solution();
        sol.push(5);
        sol.push(2);                    // stack: [5,2]
        UtilHelper.print(sol.stack, sol.size);
        System.out.println("");
        
        int val = sol.top();
//        assert sol.top() == 2;
        System.out.println(val);
        sol.pop();                      // stack: [5]
//        assert sol.top() == 5;
        val = sol.top();
        System.out.println(val);

        Solution sol2 = new Solution();
        val = sol2.top();
//        assert sol2.top() == 0;         // top of an empty stack is 0
        System.out.println(val);
        
        sol2.pop();                     // pop should do nothing
    }

    public static void example2() {
        Solution sol = new Solution();
        sol.push(4);
        sol.begin();                    // start transaction 1
        sol.push(7);                    // stack: [4,7]
        sol.begin();                    // start transaction 2
        sol.push(2);                    // stack: [4,7,2]
        UtilHelper.print(sol.stack, sol.size);
        System.out.println("");
        
//        assert sol.rollback() == true;  // rollback transaction 2
        sol.rollback();
        UtilHelper.print(sol.stack, sol.size);
        System.out.println("");
        
        int top = sol.top();
//        assert sol.top() == 7;          // stack: [4,7]
        
        sol.begin();                    // start transaction 3
        sol.push(10);                   // stack: [4,7,10]
//        assert sol.commit() == true;    // transaction 3 is committed
        sol.commit();
        UtilHelper.print(sol.stack, sol.size);
        System.out.println("");
        
//        assert sol.top() == 10;
        System.out.println(sol.top());
//        assert sol.rollback() == true;  // rollback transaction 1
        sol.rollback();
        UtilHelper.print(sol.stack, sol.size);
        System.out.println("");
        
//        assert sol.top() == 4;          // stack: [4]
        System.out.println(sol.top());
//        assert sol.commit() == false;   // there is no open transaction
        sol.commit();
        UtilHelper.print(sol.stack, sol.size);
        System.out.println("");
    }
    
}