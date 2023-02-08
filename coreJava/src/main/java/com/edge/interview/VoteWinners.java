package com.edge.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.*;
/**
 * @author edge
 *We have an array of votes for different parties.
 *Print the party name who got the highest vote, if there are ties for the top position, print all the topper's names.
 */
public class VoteWinners {
	public static void main(String[] a){
		String[] votes = { "abc", "def", "xyz", "abc", "def", "abc", "mno", "mno", "mno" };
		Map<String, Integer> totalVotes = new HashMap<String, Integer>();
		for(String vote:votes){
			if(totalVotes.get(vote) != null){
				totalVotes.put(vote, totalVotes.get(vote) + 1);
			}else{
				totalVotes.put(vote, 1);
			}
		}
		List<Entry<String, Integer>> tempList = new LinkedList<Entry<String, Integer>>(totalVotes.entrySet());
		Collections.sort(tempList, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> x, Entry<String, Integer> y){
				return y.getValue().compareTo(x.getValue());
			}
		});
		List<String> topers = new ArrayList<String>();
		int i = 0;
		int vote = tempList.get(0).getValue();
		while (vote == tempList.get(i).getValue()){
			topers.add(tempList.get(i).getKey());
			i++;
		}
		System.out.println(tempList);
		System.out.println(topers.get(0));
		Collections.sort(topers, Collections.reverseOrder());
		System.out.println(topers.get(0));
	}
}
