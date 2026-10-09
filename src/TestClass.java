import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		StackReferenceBased stack = new StackReferenceBased();
		
		int choice = 0;
		
		while(choice != 6) {
			System.out.println("===========================================================");
			System.out.println("Welcome to StackTest! Please select a number from the list.");
			System.out.println("===========================================================");
			System.out.println(" 1.	Push a string on to the stack");
			System.out.println(" 2.	Pop a string from the stack");
			System.out.println(" 3.	Peek at the top of the stack");
			System.out.println(" 4.	Empty the stack");
			System.out.println(" 5.	Check if a string has balanced brackets");
			System.out.println(" 6.	Quit the program");
			System.out.println("===========================================================");
			System.out.print("Enter a number: ");
			choice = in.nextInt();
			in.nextLine();
			System.out.println("===========================================================");
			
			switch(choice) {
				case 1:
					System.out.println();
					System.out.println("SELECTED: Push a string on to the stack");
					System.out.print("Enter a string: ");
					String string = in.nextLine();
										
					stack.push(string);
					
					System.out.println();
					System.out.println("Current Stack:");
					stack.displayStack();
					System.out.println();
					
					break;
				case 2:
					System.out.println();
					System.out.println("SELECTED: Pop a string from the stack");
					System.out.println("String popped from the stack: " + stack.pop());
					
					System.out.println();
					System.out.println("Current Stack:");
					stack.displayStack();
					System.out.println();
					
					break;
				case 3:
					System.out.println();
					System.out.println("SELECTED: Peek at the top of the stack");
					System.out.println("Top of the stack: " + stack.peek());
					
					System.out.println();
					System.out.println("Current Stack:");
					stack.displayStack();
					System.out.println();
					
					break;
				case 4:
					System.out.println();
					System.out.println("SELECTED: Empty the stack");
					stack.popAll();
					
					System.out.println();
					System.out.println("Current Stack:");
					stack.displayStack();
					System.out.println();
					System.out.println();
					
					break;
				case 5:
					System.out.println();
					System.out.println("SELECTED: Check if a string has balanced brackets");
					System.out.print("Enter a string: ");
					String s = in.nextLine();
					
					System.out.println();
					System.out.println("Does the string have balanced brackets? " + isBalanced(s));
					System.out.println();
					
					break;
				case 6:
					System.out.println();
					System.out.println("SELECTED: Quit the program");
					System.out.println("See you again soon!");
					break;
			}
		}
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
