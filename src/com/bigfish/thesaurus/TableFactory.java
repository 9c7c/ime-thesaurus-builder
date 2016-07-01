package com.bigfish.thesaurus;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TableFactory {
	
	public Map<String, String> wubi86(List<String> words){
		Map<String, String> result=new HashMap<String,String>();
		Map<String, String> wubi86=SingleCharacter.wubi86();
		
		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			String word=iterator.next();
			try {
				String first=wubi86.get(word.charAt(0)+"");
				String second=wubi86.get(word.charAt(1)+"");
				String third=wubi86.get(word.charAt(2)+"");
				String last=wubi86.get(word.charAt(word.length()-1)+"");
				String code=String.valueOf(first.charAt(0))+String.valueOf(second.charAt(0))
							+String.valueOf(third.charAt(0))+String.valueOf(last.charAt(0));
//				System.out.println(word+" - "+code);
				result.put(word, code);
			} catch (Exception e) {
				System.out.println(word+" - 转换失败");
			}
		}
		
		return result;
	}

}