package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * List<String> list1 = new ArrayList<String>(); list1.add("David");
		 * list1.add("David4@mail.com"); list1.add("David2@mail.com");
		 * list1.add("David4@mail.com");
		 * 
		 * List<String> list2 = new ArrayList<String>(); list2.add("John");
		 * list2.add("John7@mail.com"); list2.add("John5@mail.com");
		 * list2.add("John3@mail.com");
		 * 
		 * List<String> list3 = new ArrayList<String>(); list3.add("Fern");
		 * list3.add("Fern6@mail.com"); list3.add("Fern4@mail.com");
		 * list3.add("Fern5@mail.com");
		 * 
		 * List<String> list4 = new ArrayList<String>(); list4.add("Celine");
		 * list4.add("Celine0@mail.com"); list4.add("Celine7@mail.com");
		 * list4.add("Celine7@mail.com");
		 * 
		 * List<String> list5 = new ArrayList<String>(); list5.add("Gabe");
		 * list5.add("Gabe8@mail.com"); list5.add("Gabe8@mail.com");
		 * list5.add("Gabe1@mail.com");
		 * 
		 * List<String> list6 = new ArrayList<String>(); list6.add("Ethan");
		 * list6.add("Ethan1@mail.com"); list6.add("Ethan6@mail.com");
		 * list6.add("Ethan6@mail.com");
		 * 
		 * List<String> list7 = new ArrayList<String>(); list7.add("Celine");
		 * list7.add("Celine4@mail.com"); list7.add("Celine8@mail.com");
		 * list7.add("Celine6@mail.com");
		 * 
		 * List<String> list8 = new ArrayList<String>(); list8.add("Celine");
		 * list8.add("Celine0@mail.com"); list8.add("Celine0@mail.com");
		 * list8.add("Celine4@mail.com");
		 */
		  
		  
		  List<String> list1 = new ArrayList<String>(); list1.add("Hanzo");
		  list1.add("Hanzo2@mail.com"); list1.add("Hanzo3@mail.com");
		  
		  List<String> list2 = new ArrayList<String>(); list2.add("Hanzo");
		  list2.add("Hanzo4@mail.com"); list2.add("Hanzo5@mail.com");
		  
		  List<String> list3 = new ArrayList<String>(); list3.add("Hanzo");
		  list3.add("Hanzo0@mail.com"); list3.add("Hanzo1@mail.com");
		  
		  List<String> list4 = new ArrayList<String>(); list4.add("Hanzo");
		  list4.add("Hanzo3@mail.com"); list4.add("Hanzo4@mail.com");
		  
		  List<String> list5 = new ArrayList<String>(); list5.add("Hanzo");
		  list5.add("Hanzo7@mail.com"); list5.add("Hanzo8@mail.com");
		  
		  List<String> list6 = new ArrayList<String>(); list6.add("Hanzo");
		  list6.add("Hanzo1@mail.com"); list6.add("Hanzo2@mail.com");
		  
		  List<String> list7 = new ArrayList<String>(); list7.add("Hanzo");
		  list7.add("Hanzo7@mail.com");
		  list7.add("Hanzo6@mail.com");
		  
		  List<String> list8 = new ArrayList<String>(); list8.add("Hanzo");
		  list8.add("Hanzo5@mail.com"); list8.add("Hanzo6@mail.com");

		
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
		 * 
		 * 
		 * List<String> list5 = new ArrayList<String>(); list5.add("Johnny");
		 * list5.add("johnsmith@mail.com"); list5.add("johhny007@gmail.com");
		 */
		 

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

		/*
		 * List<String> list1 = new ArrayList<String>(); list1.add("David");
		 * list1.add("David0@mail.com"); list1.add("David1@mail.com");
		 * 
		 * List<String> list2 = new ArrayList<String>(); list2.add("David");
		 * list2.add("David3@mail.com"); list2.add("David4@mail.com");
		 * 
		 * List<String> list3 = new ArrayList<String>(); list3.add("David");
		 * list3.add("David4@mail.com"); list3.add("David5@mail.com");
		 * 
		 * List<String> list4 = new ArrayList<String>(); list4.add("David");
		 * list4.add("David2@mail.com"); list4.add("David3@mail.com");
		 * 
		 * List<String> list5 = new ArrayList<String>(); list5.add("David");
		 * list5.add("David1@mail.com"); list5.add("David2@mail.com");
		 */

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
		List<List<String>> mainList = new ArrayList<List<String>>();
		int i = 0;
		while (i < accounts1.size()) {
			int j = i + 1;
			List<String> sortedList = new ArrayList<String>();
			while (j < accounts1.size()) {
				if (commonEmails(
						sortedList.size() > 0 ? sortedList : accounts1.get(i).subList(1, accounts1.get(i).size()),
						accounts1.get(j).subList(1, accounts1.get(j).size()))) {
					sortedList = mergeNSortList(
							sortedList.size() > 0 ? sortedList : accounts1.get(i).subList(1, accounts1.get(i).size()),
							accounts1.get(j).subList(1, accounts1.get(j).size()));
					accounts1.remove(j);
				} else
					j++;

			}
			int k = accounts1.size() - 1;
			while (k > i) {
				if (commonEmails(sortedList, accounts1.get(k).subList(1, accounts1.get(k).size()))) {
					sortedList = mergeNSortList(
							sortedList.size() > 0 ? sortedList : accounts1.get(i).subList(1, accounts1.get(i).size()),
							accounts1.get(k).subList(1, accounts1.get(k).size()));
					accounts1.remove(k);
				}
				k--;
			}

			int m = 0;
			boolean commonEmailMerge = false;
			while (m < mainList.size()) {
				if (commonEmails(mainList.get(m).subList(1, mainList.get(m).size()),
						accounts1.get(i).subList(1, accounts1.get(i).size()))) {
					commonEmailMerge = true;
					sortedList = mergeNSortList(mainList.get(m).subList(1, mainList.get(m).size()),
							accounts1.get(i).subList(1, accounts1.get(i).size()));
					List<String> temp = mainList.get(m).subList(0, 1);
					temp.addAll(1, mergeNSortList(mainList.get(m).subList(1, mainList.get(m).size()),
							accounts1.get(i).subList(1, accounts1.get(i).size())));
					mainList.set(m, temp);
				}
				
				if (commonEmails(mainList.get(m).subList(1, mainList.get(m).size()),
						sortedList)) {
					commonEmailMerge = true;
					sortedList = mergeNSortList(mainList.get(m).subList(1, mainList.get(m).size()),
							sortedList);
					List<String> temp = mainList.get(m).subList(0, 1);
					temp.addAll(1, mergeNSortList(mainList.get(m).subList(1, mainList.get(m).size()),
							sortedList));
					mainList.set(m, temp);
				}
				m++;
			}

			List<String> list = accounts1.get(i).subList(0, 1);
			if (sortedList.size() > 0)
				list.addAll(1, sortedList);
			else {
				Set<String> getSet = new TreeSet<String>(accounts1.get(i).subList(1, accounts1.get(i).size()));
				List<String> temp = new ArrayList<String>(getSet);
				Collections.sort(temp);
				list.addAll(1, temp);
			}
			if (!commonEmailMerge)
				mainList.add(list);
			commonEmailMerge = false;
			i++;
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
