package com.edge.interview;

import java.util.Scanner;
import java.util.Stack;
/**
 * @author edge
 *A string containing bracket pairs is not balanced if the set of brackets it encloses is not matched.
	Input: exp = “[()]{}{[()()]()}” 
	Output: Balanced

	Input: exp = “[(])” 
	Output: Not Balanced 
 */
public class Brackets {

	@SuppressWarnings({ "resource", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		System.out.println("Enter Input");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] datas = input.split(" ");
		int len= Integer.parseInt(datas[0]);
		Stack stack = new Stack<>();
		String flag = "YES";
		for(int i=1;i<=len;i++) {
			String data=datas[i];			
				char[] chunk = data.toCharArray();
				for (char ltr : chunk) {
					if (ltr == '[' || ltr == '{' || ltr == '(') {
						stack.push(ltr);
					} else if ((ltr == ']' || ltr == '}' || ltr == ')') && !stack.isEmpty()) {
						if (ltr == ']' && ((char) stack.pop()) != '[') flag = "No";
						else if (ltr == '}' && ((char) stack.pop()) != '{') flag = "No";
						else if (ltr == ')' && ((char) stack.pop()) != '(') flag = "No";
					}
				}
			System.out.print(flag+" ");
			flag="YES";
		}  

	}

}
