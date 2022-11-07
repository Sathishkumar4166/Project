package org.tcs;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;




public class OP {
public static void main(String[] args) throws Throwable {

	File file=new File("D:\\pc\\no\\sathis.txt");
	List<String> readLines = FileUtils.readLines(file);
	for (String string : readLines) {
		System.out.println(string);
	}
	
}
}
