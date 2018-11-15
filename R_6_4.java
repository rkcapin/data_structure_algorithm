package Stack;

import java.util.Stack;
public class R_6_4 {

	public static void main(String[] args) {
		LinkedStack<Integer> S = new LinkedStack<>();
		LinkedStack<Integer> T = new LinkedStack<>();
		
		S.push(4);
		S.push(3);
		S.push(2);
		S.push(1);
		
		System.out.println("Original stack: ");
		System.out.println(S);

		transfer(S , T);
		
		System.out.println("Transfer stack: ");
		System.out.println(T);

	}

	private static void transfer(LinkedStack<Integer> S, LinkedStack<Integer> T)
	{
		
		while (!S.isEmpty()) {
			T.push(S.pop());
		}
		
	}

}
