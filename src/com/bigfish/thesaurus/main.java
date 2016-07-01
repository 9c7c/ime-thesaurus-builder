package com.bigfish.thesaurus;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author Bigfish/9c7c
 * @version 0.2a
 */

public class main {
	private static void output(String name, String content){
		String path=new File("output").getAbsolutePath()+"/"+name;
		try {
			FileWriter writer=new FileWriter(path);
			writer.write(content);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TableFactory factory=new TableFactory();
		Words words=new Words();
		List<String> target=words.idiom();
		Map<String,String> wubi86Table=factory.wubi86(target);
		
		//qq wubi86 format
		ThesaurusFormat format=new ThesaurusFormat();
		String qqWubi86=format.qqWubi(wubi86Table);
//		System.out.println(qqWubi86);
		output("qqWubi86Table",qqWubi86);

	}

}
