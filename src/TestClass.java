import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		StackReferenceBased stack = new StackReferenceBased();
		
		stack.push("Red");
		stack.push("Yellow");
		stack.push("Blue");
		stack.displayStack();
		
		System.out.print("Input: ");
		String input = in.nextLine();
		System.out.println("Are the brackets balanced? " + isBalanced(input));
		
	}
	
	public static boolean isBalanced(String s) {
		StackReferenceBased stack = new StackReferenceBased();
		boolean balancedSoFar = true;
		int k=0;
		while(balancedSoFar && k < s.length()) {
			char ch = s.charAt(k);
			k++;
			if(ch == '{') {
				stack.push('{');
			}
			else if(ch == '}') {
				if(!stack.isEmpty()) {
					stack.pop();
				}
				else {
					balancedSoFar = false;
				}
			}
		}
		if(balancedSoFar && stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

}
