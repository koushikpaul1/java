package com.edge.interview.synechron;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public int solution(String S, int[] C){
		int result = 0;
		for(int i = 0;i < S.length() - 1;i++){
			if(S.charAt(i) == S.charAt(i + 1)){
				List<Integer> list = new LinkedList<Integer>();
				list.add(C[i]);
				while (i < S.length() - 1 && S.charAt(i) == S.charAt(i + 1))list.add(C[++i]);
				Collections.sort(list);
				for(int k = 0;k < list.size() - 1;k++)result += list.get(k);
			}
		}
		return result;
	}

	public int solution(int[] blocks){
		int result = 0;
		if(blocks.length == 2) return 2;
		for(int i = 0;i < blocks.length;i++){
			int temp = 0;int j = i;int k = i;
			if(i < blocks.length - 1 && blocks[i] < blocks[i + 1]) temp++;
			if(i > 0 && blocks[i] < blocks[i - 1]) temp++;
			while (j < blocks.length - 1 && blocks[j] < blocks[j + 1]){temp++;j++;}
			while (k > 0 && blocks[k] < blocks[k - 1]){temp++;k--;}
			if(temp > result) result = temp;
		}
		return result;
	}
}
