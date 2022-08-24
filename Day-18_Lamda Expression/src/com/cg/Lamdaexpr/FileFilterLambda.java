package com.cg.Lamdaexpr;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String[] args) {
		//lambda expressiom for searching the file in given path of particular extension
		FileFilter filter=(File pathname)->pathname.getName().endsWith(".pdf");
		File dir=new File("C:\\Users\\Admin\\Desktop\\upsc books");
			File contents[]=dir.listFiles(filter);
			//enhanced for loop
			/*if any particular extension file is open on your system the
			 * you will get that file in $sign
			 */
			for(File i:contents)
			{
				System.out.println(i);
			}

	}

}
