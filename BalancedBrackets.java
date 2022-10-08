import java.util.*;

public class BalancedBrackets {

	static boolean bracketsBalanced(String expr)
	{
		// Using ArrayDeque is faster than using Stack class
		Deque<Character> stack
			= new ArrayDeque<Character>();
		for (int i = 0; i < expr.length(); i++)
		{
			char x = expr.charAt(i);

			if (x == '(' || x == '[' || x == '{')
			{
				stack.push(x);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}

	public static void main(String[] args)
	{
		String expr = "([{})";

		if (bracketsBalanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}
