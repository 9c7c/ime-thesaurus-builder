package com.bigfish.thesaurus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {
	public List<String> idiom(){
		List<String> words=new ArrayList<>();
		String path=new File("data").getAbsolutePath()+"/idiom.txt";
		File file=new File(path);
		try {
			String str=readFile(file);
			Matcher matcher=Pattern.compile("\\[([^x00-xff]+)\\]").matcher(str);
			while (matcher.find()) {
//				System.out.println(matcher.group(1));
				words.add(matcher.group(1));
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return words;
	}
	
	private String readFile(File file) throws IOException{
		InputStream inputStream=null;
		try{
			inputStream=new FileInputStream(file);
			int length=inputStream.available();
			byte [] buffer=new byte[length];
			inputStream.read(buffer);
			return new String(buffer); 
		}finally{
			if(inputStream!=null){
				inputStream.close();
			}
		}
	}

}
