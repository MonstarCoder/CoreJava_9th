/**
 * This program demonstrates static methods.
 * @author Monstar
 * 2016.8.31
 */
public class StaticTest 
{
	public static void main(String[] args)
	{
		//fill the staff array with three Employee objects
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Tom", 10000);
		staff[1] = new Employee("Dick", 12000);
		staff[2] = new Employee("Harry", 14000);
		
		//print out information about all Employee objects
		for(Employee e : staff)
			System.out.println("name= " + e.getName() + ", id= " + e.getId() + 
					", salary= " + e.getSalary());
		
		int n =Employee.getNextId(); // calls static method
		System.out.println("Nex available id =" + n);
	}
}

class Employee
{
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int id;
	
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
		id = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId()
	{
		id = nextId; //set id to next available id
		nextId++;
	}
	
	public static int getNextId()
	{
		return nextId; // returns static field
	}
	
	public static void main(String[] args)
	{
		Employee e = new Employee("Haarry", 50000);
		System.out.println(e.getName() + " " + e.getSalary());
	}
}
