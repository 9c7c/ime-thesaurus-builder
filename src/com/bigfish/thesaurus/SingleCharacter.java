package com.bigfish.thesaurus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SingleCharacter {
	
	public static Map<String, String> wubi86(){
		Map<String, String> lvl1Character = new HashMap<String,String>();
		String[] word = {"一","地","在","要","工",
						"上","是","中","国","同",
						"和","的","有","人","我",
						"主","产","不","为","这",
						"民","了","发","以","经"};
		String[] code = {"g","f","d","s","a",
						"h","j","k","l","m",
						"t","r","d","w","t",
						"y","u","g","y","y",
						"n","b","n","n","x"};
		for (int i = 0; i < word.length; i++) {
			lvl1Character.put(word[i], code[i]);
		}
		
		Map<String, String> table=new HashMap<>();
		String path=new File("table").getAbsolutePath()+"/wubi86Table";
		try {
			StringBuffer input=new StringBuffer("");
			FileReader reader=new FileReader(path);
			BufferedReader br=new BufferedReader(reader);
			String str=null;
			while ((str=br.readLine())!=null) {
				input.append(str+"/n");
				String[] kv=str.split("\\t");
				String skey=kv[0];
				String svalue=kv[1];
				table.put(skey, svalue);
//				System.out.println(str);
			}
			br.close();
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String character=null;
		String firstCode=null;
		Iterator interator=lvl1Character.entrySet().iterator();
		try {
			while (interator.hasNext()) {
				Map.Entry entry=(Map.Entry)interator.next();
				character=(String) entry.getKey();
				firstCode=(String) entry.getValue();
				table.replace(character, firstCode);
			}
		} catch (Exception e) {
			System.out.println("cannot find ["+character+"] in the single character list.");
			e.printStackTrace();
		}
		return table;
	}
	

}
