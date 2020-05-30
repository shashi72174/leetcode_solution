package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class AccountsMerge {

	public static void main(String[] args) throws Exception {

		/*
		 * List<String> list1 = new ArrayList<String>(); list1.add("Lily");
		 * list1.add("Lily3@m.co"); list1.add("Lily4@m.co"); list1.add("Lily17@m.co");
		 * List<String> list2 = new ArrayList<String>(); list2.add("Lily");
		 * list2.add("Lily23@m.co"); list2.add("Lily5@m.co"); list2.add("Lily3@m.co");
		 * List<String> list3 = new ArrayList<String>(); list3.add("Lily");
		 * list3.add("Lily0@m.co"); list3.add("Lily1@m.co"); list3.add("Lily8@m.co");
		 * List<String> list4 = new ArrayList<String>(); list4.add("Lily");
		 * list4.add("Lily14@m.co"); list4.add("Lily23@m.co"); List<String> list5 = new
		 * ArrayList<String>(); list5.add("Lily"); list5.add("Lily4@m.co");
		 * list5.add("Lily5@m.co"); list5.add("Lily20@m.co"); List<String> list6 = new
		 * ArrayList<String>(); list6.add("Lily"); list6.add("Lily1@m.co");
		 * list6.add("Lily2@m.co"); list6.add("Lily11@m.co"); List<String> list7 = new
		 * ArrayList<String>(); list7.add("Lily"); list7.add("Lily2@m.co");
		 * list7.add("Lily0@m.co"); list7.add("Lily14@m.co");
		 */

		
		  List<String> list1 = new ArrayList<String>(); list1.add("David");
		  list1.add("David4@mail.com"); list1.add("David2@mail.com"); list1.add("David4@mail.com");
		  
		  List<String> list2 = new ArrayList<String>(); list2.add("John");
		  list2.add("John7@mail.com"); list2.add("John5@mail.com"); list2.add("John3@mail.com");
		  
		  List<String> list3 = new ArrayList<String>(); list3.add("Fern");
		  list3.add("Fern6@mail.com"); list3.add("Fern4@mail.com"); list3.add("Fern5@mail.com");
		  
		  List<String> list4 = new ArrayList<String>(); list4.add("Celine");
		  list4.add("Celine0@mail.com"); list4.add("Celine7@mail.com"); list4.add("Celine7@mail.com");
		  
		  List<String> list5 = new ArrayList<String>(); list5.add("Gabe");
		  list5.add("Gabe8@mail.com"); list5.add("Gabe8@mail.com"); list5.add("Gabe1@mail.com");
		  
		  List<String> list6 = new ArrayList<String>(); list6.add("Ethan");
		  list6.add("Ethan1@mail.com"); list6.add("Ethan6@mail.com"); list6.add("Ethan6@mail.com");
		  
		  List<String> list7 = new ArrayList<String>(); list7.add("Celine");
		  list7.add("Celine4@mail.com"); list7.add("Celine8@mail.com"); list7.add("Celine6@mail.com");
		  
		  List<String> list8 = new ArrayList<String>(); list8.add("Celine");
		  list8.add("Celine0@mail.com"); list8.add("Celine0@mail.com"); list8.add("Celine4@mail.com");
		 

		List<List<String>> mainList = new ArrayList<List<String>>();
		mainList.add(list1);
		mainList.add(list2);
		mainList.add(list3);
		mainList.add(list4);
		mainList.add(list5);
		mainList.add(list6);
		mainList.add(list7);
		mainList.add(list8);
		System.out.println(accountsMerge(mainList));
	}

	public static List<List<String>> accountsMerge(List<List<String>> accounts) {
		CopyOnWriteArrayList<List<String>> accounts1 = new CopyOnWriteArrayList<List<String>>(accounts);
		CopyOnWriteArrayList<List<String>> returnList = new CopyOnWriteArrayList<List<String>>();
		List<List<String>> mainList = new ArrayList<List<String>>();
		boolean append = false;
		for (int i = 0; i < accounts1.size(); i++) {
			List<String> sortedList = new ArrayList<String>();
			append = false;
			int j = i + 1;
			while (j < accounts1.size()) {
				if (commonEmails(accounts1.get(i).subList(1, accounts1.get(i).size()),
						accounts1.get(j).subList(1, accounts1.get(j).size()))) {
					sortedList = mergeNSortList(
							sortedList.size() > 0 ? sortedList : accounts1.get(i).subList(1, accounts1.get(i).size()),
							accounts1.get(j).subList(1, accounts1.get(j).size()));
					accounts1.remove(j);
				} else
					j++;
			}
			int k = 0;
			while (k < returnList.size()) {
				if (commonEmails(
						sortedList.size() > 0 ? sortedList : accounts1.get(i).subList(1, accounts1.get(i).size()),
						returnList.get(k).subList(1, returnList.get(k).size()))) {
					append = true;
					sortedList = mergeNSortList(
							sortedList.size() > 0 ? sortedList : accounts1.get(i).subList(1, accounts1.get(i).size()),
							returnList.get(k).subList(1, returnList.get(k).size()));
					List<String> temp = returnList.get(k).subList(0, 1);
					temp.addAll(1, sortedList);
					returnList.set(k, temp);
				}
				k++;
			}
			if (!append) {
				List<String> list = accounts1.get(i).subList(0, 1);
				if (sortedList.size() > 0)
					list.addAll(1, sortedList);
				else {
					Set<String> getSet = new TreeSet<String>(accounts1.get(i).subList(1, accounts1.get(i).size()));
					List<String> temp = new ArrayList<String>(getSet);
					Collections.sort(temp);
					list.addAll(1, temp);
				}
				returnList.add(list);
			}
		}
		boolean commonEmail = false;
		for (int i = 0; i < returnList.size(); i++) {
			if (mainList.size() > 0) {
				for (int j = 0; j < mainList.size(); j++) {
					if (commonEmails(mainList.get(j).subList(1, mainList.get(j).size()),
							returnList.get(i).subList(1, returnList.get(i).size()))) {
						commonEmail = true;
						List<String> temp = mainList.get(j).subList(0, 1);
						temp.addAll(1, mergeNSortList(returnList.get(i).subList(1, returnList.get(i).size()),
								mainList.get(j).subList(1, mainList.get(j).size())));
						mainList.set(j, temp);
					}
				}
				if(!commonEmail)
					mainList.add(returnList.get(i));
				commonEmail = false;
			} else
				mainList.add(returnList.get(i));
		}
		return mainList;
	}

	public static boolean commonEmails(List<String> list1, List<String> list2) {
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i).equals(list2.get(j)))
					return true;
			}
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