package com.ashworth.william.files.workingWithFiles;

import java.util.ArrayList;
import java.util.List;

public class ListOfPeople 
{
	List<Person> listOfPeople; 
	
	public ListOfPeople()
	{
		listOfPeople = new ArrayList<>();
	}
	
	public void add(Person p)
	{
		listOfPeople.add(p);
	}
	
	public void copy()
	{
		
	}
}
