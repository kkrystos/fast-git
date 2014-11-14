package com;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> listaList = new ArrayList<List<String>>();

		for (int i = 0; i < 10; i++) {
			List<String> ls = new ArrayList<String>();
			ls.add("jeden");
			ls.add("dwa");
			ls.add("trzy");
			ls.add("cztery");
			ls.add("piêæ");
			ls.add("szeœæ");
			ls.add("siedem");
			listaList.add(ls);
		}

		for (List<String> list : listaList) {
			System.out.println(list);
		}

	}

}
