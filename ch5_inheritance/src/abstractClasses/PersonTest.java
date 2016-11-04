package abstractClasses;

import java.util.*;
/**
 * This program demonstrates abstract classes
 * @author Monstar
 * 2016.9.1
 */
public class PersonTest 
{
	public static void main(String[] args)
	{
		Person[] people = new Person[2];
		
		//fill the people array with Student and Employee objects
		people[0] = new Employee("Harry Hacker", 5000, 1989, 10, 1);
		people[1] = new Student("Maria Morris", "computer science");
		
		//print out names and description of all Person objects
		for (Person p : people)
			System.out.println(p.getName() + ", " + p.getDescription());
	}
}
