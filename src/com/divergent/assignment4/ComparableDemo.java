package com.divergent.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo implements Comparable<ComparableDemo> {
	int sudentid;
	String name;

	public ComparableDemo(int id, String name) {
		super();
		this.sudentid = id;
		this.name = name;
	}

	public String toString() {
		return " Student id = " + sudentid + " name = " + name;

	}

	public int getSudentid() {
		return sudentid;
	}

	public void setSudentid(int sudentid) {
		this.sudentid = sudentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		List<ComparableDemo> stud = new ArrayList<>();
		stud.add(new ComparableDemo(5, " kamini"));
		stud.add(new ComparableDemo(2, " yadav"));
		stud.add(new ComparableDemo(1, " satyam"));
		stud.add(new ComparableDemo(1, " john"));

		Collections.sort(stud);
		stud.forEach(System.out::println);
	}

	@Override
	public int compareTo(ComparableDemo o) {
		// increasing order
		if (this.sudentid > o.sudentid)
			return 1;
		else if (this.sudentid < o.sudentid)
			return -1;
		// return 0;

		return this.name.compareTo(name);
	}

	class SortByName implements Comparator<ComparableDemo> {

		@Override
		public int compare(ComparableDemo o1, ComparableDemo o2) {
			if (o1.name.equals(o2.name)) {
				return o1.sudentid - o2.sudentid;
			} else {
				o1.name.compareTo(o2.name);
			}
			return 0;
		}
	}
}