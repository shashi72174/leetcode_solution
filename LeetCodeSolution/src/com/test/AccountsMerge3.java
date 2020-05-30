package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class AccountsMerge3 {

	public static void main(String[] args) throws Exception {

		
		  List<String> list1 = new ArrayList<String>(); list1.add("Lily");
		  list1.add("Lily3@m.co"); list1.add("Lily4@m.co"); list1.add("Lily17@m.co");
		  List<String> list2 = new ArrayList<String>(); list2.add("Lily");
		  list2.add("Lily23@m.co"); list2.add("Lily5@m.co"); list2.add("Lily3@m.co");
		  List<String> list3 = new ArrayList<String>(); list3.add("Lily");
		  list3.add("Lily0@m.co"); list3.add("Lily1@m.co"); list3.add("Lily8@m.co");
		  List<String> list4 = new ArrayList<String>(); list4.add("Lily");
		  list4.add("Lily14@m.co"); list4.add("Lily23@m.co"); List<String> list5 = new
		  ArrayList<String>(); list5.add("Lily"); list5.add("Lily4@m.co");
		  list5.add("Lily5@m.co"); list5.add("Lily20@m.co"); List<String> list6 = new
		  ArrayList<String>(); list6.add("Lily"); list6.add("Lily1@m.co");
		  list6.add("Lily2@m.co"); list6.add("Lily11@m.co"); List<String> list7 = new
		  ArrayList<String>(); list7.add("Lily"); list7.add("Lily2@m.co");
		  list7.add("Lily0@m.co"); list7.add("Lily14@m.co");
		 

		
		/*
		 * List<String> list1 = new ArrayList<String>(); list1.add("John");
		 * list1.add("johnsmith@mail.com"); list1.add("john00@mail.com");
		 * 
		 * List<String> list2 = new ArrayList<String>(); list2.add("John");
		 * list2.add("johnnybravo@mail.com");
		 * 
		 * List<String> list3 = new ArrayList<String>(); list3.add("John");
		 * list3.add("johnsmith@mail.com"); list3.add("john_newyork@mail.com");
		 * 
		 * 
		 * List<String> list4 = new ArrayList<String>(); list4.add("Mary");
		 * list4.add("mary@mail.com");
		 */
		 

		/*
		 * List<String> list5 = new ArrayList<String>(); list5.add("John");
		 * list5.add("johnsmith@mail.com"); list5.add("johhny007@gmail.com");
		 */

		List<List<String>> mainList = new ArrayList<List<String>>();
		mainList.add(list1);
		mainList.add(list2);
		mainList.add(list3);
		mainList.add(list4);
		mainList.add(list5);
		mainList.add(list6);
		mainList.add(list7);
		System.out.println(accountsMerge(mainList));
	}

	public static List<List<String>> accountsMerge(List<List<String>> accounts) {
		CopyOnWriteArrayList<List<String>> accounts1 = new CopyOnWriteArrayList<List<String>>(accounts);
		List<List<String>> mainList = new ArrayList<List<String>>();
		int i=0;
		while(i<accounts1.size()) {
			List<String> sortedList = new ArrayList<String>();
			if(mainList.size()>0) {
				for(int j=0;j<mainList.size();j++) {
					if(commonEmails(mainList.get(j).subList(1, mainList.get(j).size()), accounts1.get(i).subList(1, accounts1.get(i).size()))) {
						sortedList = mergeNSortList(
								sortedList.size() > 0 ? sortedList : accounts1.get(i).subList(1, accounts1.get(i).size()),
								mainList.get(j).subList(1, mainList.get(j).size()));
						List<String> temp = mainList.get(j).subList(0, 1);
						temp.addAll(1, sortedList);
						mainList.set(j, temp);
						accounts1.remove(i);
					}
				}
				mainList.add(accounts1.get(i));
				accounts1.remove(i);
			}else {
				mainList.add(accounts1.get(i));
				accounts1.remove(i);
			}
		}
		return mainList;
	}

	public static boolean commonEmails(List<String> list1, List<String> list2) {
		for (int i = 0; i < list1.size(); i++) {
			if (list2.contains(list1.get(i)))
				return true;
		}
		return false;
	}

	public static List<String> mergeNSortList(List<String> list1, List<String> list2) {
		List<String> mergedList = null;
		Set<String> set = new HashSet<String>();
		set.addAll(list1);
		set.addAll(list2);
		mergedList = new ArrayList<String>(set);
		Collections.sort(mergedList);
		return mergedList;
	}
}