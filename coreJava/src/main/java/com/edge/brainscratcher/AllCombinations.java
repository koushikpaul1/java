package com.edge.brainscratcher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.util.Arrays.asList;

public class AllCombinations {

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		int length = 10;
		LinkedHashMap<Integer, ArrayList<ArrayList<Integer>>> result = new LinkedHashMap<Integer, ArrayList<ArrayList<Integer>>>(){{put(new Integer(1),new ArrayList<ArrayList<Integer>>(asList(new ArrayList<>(asList(new Integer(1))))));}};
		for (int i = 0; i < length - 1; i++) {
			ArrayList<ArrayList<Integer>> pre = result.get(result.size());
			ArrayList<ArrayList<Integer>> sent = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> ones = new ArrayList<Integer>();
			for (int k = 0; k <= result.size(); k++)
				ones.add(1);
			sent.add(ones);
			for (int j = 0; j < pre.size(); j++) {
				ArrayList<Integer> prepre = pre.get(j);
				for (int k = 0; k < prepre.size(); k++) {
					ArrayList<Integer> sentsent = new ArrayList<Integer>();

					sentsent.add(prepre.get(k) + 1);
					for (int k2 = k + 1; k2 < prepre.size(); k2++)sentsent.add(prepre.get(k2));
					for (int k3 = 0; k3 < k; k3++)sentsent.add(prepre.get(k3));

					Collections.sort(sentsent);
					sent.add(sentsent);
				}
			}
			result.put(result.size() + 1, new ArrayList<>(new LinkedHashSet<>(sent)));
			Set<ArrayList<Integer>> remDup = new LinkedHashSet<>(sent);
			System.out.println(remDup);
		}
		
		System.out.println("\n\n"+result);
	}
}
