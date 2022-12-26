package com.edge.interview.oracle;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Result {

	public static int minX(List<Integer> arr) {
		int result = 0;
		int min = 0;
		for (int i : arr) {
			result += i;
			if (result < min)
				min = result;
		}
		return 0 - min + 1;
	}

	public static int countPerms(int n) {
		int result = 5;
		if (n == 1)
			return result;
		long[] last = { 1, 1, 1, 1, 1 };
		long[] now = new long[5];
		long forI = 4;
		long modulo = 1000000007L;
		for (int i = 2; i <= n; i++) {
			now[0] = last[1];
			now[1] = (last[0] + last[2]) % modulo;
			now[2] = forI;
			now[3] = (last[2] + last[4]) % modulo;
			now[4] = last[0];
			forI = 0;
			for (int j = 0; j < 5; j++) {
				last[j] = now[j];
				if (j != 2)
					forI += last[j];
			}
			forI %= modulo;
		}
		result = (int) ((now[0] + now[1] + now[2] + now[3] + now[4]) % modulo);
		return result;
	}
	 public static List<String> sortRoman(List<String> names) {
		    List <String> list=new LinkedList ();
		    Collections.sort(names);
		    for(String name:names)list.add(name);
		    return list;

		    }
}
