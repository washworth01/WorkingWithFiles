package com.ashworth.william.files.workingWithFiles;

public class Person 
{
	private String name;
	private String occupation;
	private int age;
	
	public Person()
	{
		
	}
	
	public Person(String name, String occupation, int age)
	{
		this.name = name;
		this.occupation = occupation;
		this.age = age;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getOccupation() 
	{
		return occupation;
	}

	public void setOccupation(String occupation) 
	{
		this.occupation = occupation;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}	
}
