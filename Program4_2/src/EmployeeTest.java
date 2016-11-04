import java.util.*;

/**
 * This program tests the Employee class.
 * @author Monstar
 * 2016.8.31
 */
public class EmployeeTest 
{
	public static void main(String[] args)
	{
		//fill the staff array with three Employee objects
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Dog", 10000, 1994,10,30);
		staff[1] = new Employee("Cat", 12000, 1993,10,30);
		staff[2] = new Employee("Man", 14000, 1992,10,30);
		
		//raise everyone's salary by 5%
		for(Employee e : staff)
			e.raiseSalary(5);
		
		//print out information about all Employee objects
		for(Employee e : staff)
			System.out.println("name " + e.getName() + ", salary " + e.getSalary() + 
					", hireDay= " + e.getHireDay());
		
	}
}

class Employee
{
	private String name;
	private double salary;
	private Date hireDay;
	public Employee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		//GregoCalendar uses 0 for January
		hireDay = calendar.getTime();
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getHireDay()
	{
		return hireDay;//should use "return hireDay.clone()"
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}