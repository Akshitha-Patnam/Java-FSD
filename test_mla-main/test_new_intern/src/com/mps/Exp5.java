package com.mps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee
{
	private int id;
	
	private String name;
	
	private int age;
	
	private String gender;
	
	private String department;
	
	private int yearOfJoining;
	
	double salary;
	
	public Employee()
	{
		
	}

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
}

public class Exp5 {
	
	//1 find out the count of male and female employees present in the company
	public static void getCountOfMaleNFemale(List<Employee> employeeList)
	{
		Map<String, Long> result = 
				
				employeeList.stream()				
				.collect(Collectors.groupingBy(Employee :: getGender, 
											Collectors.counting()));
		System.out.println(result);
	}
	
	//2 write a program to print the name of all departments in the company
	
	public static void getDepartmentNames(List<Employee> employeeList)
	{
		employeeList.stream()
		            .map(Employee :: getDepartment)
		            .distinct()
		            .forEach(System.out::println);
	}
	
	//3 find the average age of Male and Female Employees
	public static void getAverageGenderAge(List<Employee> employeeList)
	{
		Map<String, Double> avgData = 
				employeeList.stream()
							.collect(Collectors.groupingBy(Employee :: getGender,
							  Collectors.averagingInt(Employee :: getAge)));
		  System.out.println(avgData);
	}
	
	//4 get the name of employees who joined after 2019
	public static void getNameOfEmployees(List<Employee> employeeList)
	{
		employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2019)
							 .map(Employee :: getName)
							 .forEach(System.out::println);
	}
	
	//5 count the number of employees from each department
	public static void countByDept(List<Employee> employeesList)
	{
		Map<String, Long> cntResult = 
				employeesList.stream()
				.collect(Collectors.groupingBy(Employee :: getDepartment, 
						Collectors.counting()));
		
		cntResult.forEach((k,v)-> System.out.println(k+" --> "+v));
	}
	
	//6 find out the average salary of each department
	public static void averageSalaryOfDpt(List<Employee> employeesList)
	{
		Map<String, Double> result =
				
				employeesList.stream()
				.collect(Collectors.groupingBy(Employee :: getDepartment,
						Collectors.averagingDouble(Employee :: getSalary)));
		
		result.forEach((k,v) -> System.out.println(k+" --> "+v));
	}
	
	//7 find out the oldest employee, his/her age and department
	public static void oldestEmployeeAgeNDept(List<Employee> employeeList)
	{
		Optional<Employee> oldEmp = 
				
				employeeList.stream()
				.max(Comparator.comparing(Employee :: getAge));
		
		Employee empData = oldEmp.get();
		
		System.out.println("Name  :"+empData.getName());
		System.out.println("Age : "+empData.getAge());
		System.out.println("Dapartment : "+empData.getDepartment());
	}
	
	//8 find out the average and total salary of the company
	public static void getAverageNTotalSal(List<Employee> employeesList)
	{
		DoubleSummaryStatistics empSalResult = 
				
				employeesList.stream()
				.collect(Collectors.summarizingDouble(Employee :: getSalary));
		
		System.out.println("Average Salary : "+empSalResult.getAverage());
		System.out.println("Total Salary : "+empSalResult.getSum());
				
	}
	
	//9 list down the employees from each department
	public static void listEmpFromEachDpt(List<Employee> employeesList)
	{
		Map<String, List<Employee>> empListDpt = 
				
				employeesList.stream()
				.collect(Collectors.groupingBy(Employee :: getDepartment));
		
		for(String k : empListDpt.keySet())
		{
			System.out.println("Departments :: "+k);
			
			List<Employee> emp = empListDpt.get(k);
			
			for(Employee dt : emp)
			{
				System.out.println(dt);
			}
		}
	}
	
	//10 find out the highest experience employee in the company
	public static void getSeniorEmployee(List<Employee> employeesList)
	{
		Optional<Employee> seniorEmp = 
				
				employeesList.stream()
				.sorted(Comparator.comparing(Employee :: getYearOfJoining))
				.findFirst();
		
		Employee empData = seniorEmp.get();
		
		System.out.println("Senior Employee from the company : ");
		System.out.println("================");
		System.out.println("ID : "+empData.getId());
		System.out.println("Name : "+empData.getName());
		System.out.println("Age : "+empData.getAge());
		
	}
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Omsri nivas", 27, "Male", "Account And Finance", 2025, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		//Exp5.getCountOfMaleNFemale(employeeList);
		
		//Exp5.getDepartmentNames(employeeList);
		
		//Exp5.getAverageGenderAge(employeeList);
		
		//Exp5.getNameOfEmployees(employeeList);
		
		//Exp5.countByDept(employeeList);
		
		//Exp5.averageSalaryOfDpt(employeeList);
		
		//Exp5.oldestEmployeeAgeNDept(employeeList);
		
		//Exp5.getAverageNTotalSal(employeeList);
		
		//Exp5.listEmpFromEachDpt(employeeList);
		
		//Exp5.getSeniorEmployee(employeeList);
		
	}
}
