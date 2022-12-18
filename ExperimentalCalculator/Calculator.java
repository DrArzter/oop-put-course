package ExperimentalCalculator;

import java.util.*;

public class Calculator {

	public static int solve(String input) {


		char[] expr = input.toCharArray();

		Stack<Integer> val = new Stack<Integer>();
		Stack<Character> opr = new Stack<Character>(); 
												// Stack for Operators
		for (int i = 0; i < expr.length; i++) {
			if (expr[i] == ' ') continue;					        // Skipping spaces
			if (expr[i] >= '0' && expr[i] <= '9') {					// If a number occurs, push it to number stack 'val'

				StringBuffer temp = new StringBuffer();
				while (i < expr.length && expr[i] >= '0' && expr[i] <= '9') temp.append(expr[i++]); 	// For more than one digit number	
				val.push(Integer.parseInt(temp.toString()));
			}
			else if (expr[i] == '(') 
                                opr.push(expr[i]); 							// Opening parenthesis, directly push it in 'opr'

			else if (expr[i] == ')') {									// Closing parenthesis, solve the contents of the parenthesis
				while (opr.peek() != '(') 
                                   val.push(calculate(opr.pop(), val.pop(), val.pop()));
				opr.pop();                                                                              // pop the open bracket
			}

			else if (expr[i] == '%' || expr[i] == '+' || expr[i] == '-' || expr[i] == '*' || expr[i] == '/' || expr[i] == '^') {       // Operator push it in 'opr'
				while (!opr.empty() && checkPrecedence(expr[i], opr.peek()))
                                      val.push(calculate(opr.pop(), val.pop(), val.pop())); // Loop activated when top of stack precedence is greater in precedence
				opr.push(expr[i]);
			}
		}
		while (!opr.empty()) val.push(calculate(opr.pop(), val.pop(), val.pop())); 			// Remaining Calculation in expression
		return val.pop(); 										// Top of stack 'val' contains the answer
	}

	public static boolean checkPrecedence(char opr1, char opr2) {		// Returns true if opr1 >= opr2 else return false
		if (opr2 == '(' || opr2 == ')') return false;
		if ((opr1 == '^') && (opr2 == '*' || opr2 == '/' || opr2 == '+' || opr2 == '-' || opr2 == '%')) return false;    	
		if ((opr1 == '*' || opr1 == '/') && (opr2 == '+' || opr2 == '-')) return false;	
		else return true;		
	}

	public static int calculate(char op, int b, int a) {
		switch (op) {
			case '%': return a % b;
			case '+': return a + b;
			case '-': return a - b;
			case '*': return a * b;
			case '/': if (b == 0) throw new UnsupportedOperationException("Cannot divide by zero"); return a / b;	//to handle divide by zero
			case '^': return (int)Math.pow(b,a);
		}
		return 0;
	}
	
	public static void main(String[] args) { 				// Main method
		String in;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an expression with spaces");	        // Like 2 * ( ( 3 + 4 ) / 7 ) % 3 and not 2*(3+4)/7)%3
		in = sc.nextLine();
		System.out.println("Answer = " + Calculator.solve(in));	
	}
}