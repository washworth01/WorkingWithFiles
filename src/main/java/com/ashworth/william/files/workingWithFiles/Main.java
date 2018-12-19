package com.ashworth.william.files.workingWithFiles;

public class Main
{
	public static void main(String[] args)
	{
		Reader() = new Read();
		ListOfPeople people = new ListOfPeople();
		
		String personFile = "C:\\Users\\Admin\\Documents\\people.txt";
		
		people.add(new Person("Ted Bundy", "Saleman", 46));
		people.add(new Person("Charles Manson", "Artist", 57));
		people.add(new Person("Ted Cruz", "Politician", 48));
		people.add(new Person("Gareth Davis", "Pusher", 38));
		people.add(new Person("Albert Fish", "Chef", 43));
		
		
	}
}
