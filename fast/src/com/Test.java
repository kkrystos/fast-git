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

		for (int i = 0; i < 20; i++) {
			List<String> ls = new ArrayList<String>();
			ls.add("jeden");
			ls.add("dwa");
			ls.add("trzy");
			ls.add("cztery");
			ls.add("piêæ");
			ls.add("szeœæ");		
			ls.add("siedem"); 
			ls.add("osiem"); 	
			ls.add("dziewiec"); 		
			ls.add("dziesiec"); 	
			ls.add("jedenascie");
			listaList.add(ls);
		}

		int i= 1;
		for (List<String> list : listaList) {
			System.out.println(i+++" "+list);
		}

	}

}
