package com.ashworth.william.files.workingWithFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read
{
	public static void bufferedcopy(String inFile, String outFile) throws IOException
	{
		BufferedReader bfrIn = new BufferedReader(new FileReader(inFile));
		BufferedWriter bfwOut = new BufferedWriter(new FileWriter(outFile));
		
		String line = "";
		while ((line = bfrIn.readLine()) != null)
		{
			bfwOut.write(line + "\n");
		}
		bfrIn.close();
		bfwOut.close();
	}
}
