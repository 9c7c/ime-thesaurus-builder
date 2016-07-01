package com.bigfish.thesaurus;

import java.util.Iterator;
import java.util.Map;

public class ThesaurusFormat {
	public String qqWubi(Map<String,String> words){
		String str="";
		Iterator interator = words.entrySet().iterator();
		while (interator.hasNext()) {
			Map.Entry entry=(Map.Entry)interator.next();
			String unit=(String) entry.getKey();
			String code=(String) entry.getValue();
			str=str+code+" "+unit+"\n";
		}
		return str;
	}

}
