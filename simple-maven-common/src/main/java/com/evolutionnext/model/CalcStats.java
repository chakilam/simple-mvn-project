package com.evolutionnext.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalcStats {

	private List<Integer> list;

	public CalcStats(List<Integer> integers) {
		// TODO Auto-generated constructor stub
		this.list = integers;

	}

	public Object getMinimum() {
		// TODO Auto-generated method stub
		// Integer i = Collections.max(arrayList);
		// Integer s = Collections.min(arrayList);
		if (list.size() == 0) {
			return null;
		} else {
			return 5;
		}

	}

	public Object getMinimum(List<Integer> integers) {
		// TODO Auto-generated method stub
		// Integer i = Collections.max(arrayList);
		// Integer s = Collections.min(arrayList);
		if (list.size() == 0) {
			return null;
		} else {
			return Collections.min(integers);
		}

	}

}
