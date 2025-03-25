package com.cls;

import java.util.Map.Entry;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Employee1 {

	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Employee1(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
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

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
				+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
	}

}

public class Exp8 {

	// 1.Find out the count of male and female employees present in the organization?
	public static void getCountOfMaleFemale(List<Employee1> employeeList) {
		Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee1::getGender, 
						Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployees);
	}

	// 2 Write a program to print the names of all departments in the organization.

	public static void getDepartmentName(List<Employee1> employeeList) {
		employeeList.stream()
					.map(Employee1::getDepartment)
					.distinct().forEach(System.out::println);
	}
	// 3 Find the average age of Male and Female Employees.

	public static void getGender(List<Employee1> employeeList) {
		Map<String, Double> avgAge = employeeList.stream()
				.collect(Collectors.groupingBy(Employee1::getGender, 
						Collectors.averagingInt(Employee1::getAge)));
		System.out.println(avgAge);
	}
	// 4 Get the Names of employees who joined after 2015.

	public static void getNameOfEmp(List<Employee1> employeeList) {
		employeeList.stream()
				.filter(e -> e.getYearOfJoining() > 2015)
				.map(Employee1::getName)
				.forEach(System.out::println);
	}
	// 5 Count the number of employees in each department.

	public static void countByDept(List<Employee1> employeeList) {
		Map<String, Long> countByDept = employeeList.stream()
				.collect(Collectors.groupingBy(Employee1::getDepartment, 
						Collectors.counting()));
		Set<Entry<String, Long>> entrySet = countByDept.entrySet();
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	// 6 Find out the average salary of each department.

	public static void avgSalary(List<Employee1> employeeList) {
		Map<String, Double> avgSalary = employeeList.stream().collect(
				Collectors
				.groupingBy(Employee1::getDepartment, 
						Collectors.averagingDouble(Employee1::getSalary)));
		Set<Entry<String, Double>> entrySet = avgSalary.entrySet();
		for (Entry<String, Double> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	// 7 Find out the oldest employee, his/her age and department?

	public static void oldestEmp(List<Employee1> employeeList) {
		Optional<Employee1> oldestEmp = employeeList.stream()
				.max(Comparator.comparingInt(Employee1::getAge));
		Employee1 oldestEmployee = oldestEmp.get();

		System.out.println("Name : " + oldestEmployee.getName());
		System.out.println("Age : " + oldestEmployee.getAge());
		System.out.println("Department : " + oldestEmployee.getDepartment());
	}
	// 8 Find out the average and total salary of the organization.

	public static void getEmpSalary(List<Employee1> employeeList) {
		DoubleSummaryStatistics empSalary = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee1::getSalary));

		System.out.println("Average Salary = " + empSalary.getAverage());
		System.out.println("Total Salary = " + empSalary.getSum());
	}
	// 9 List down the employees of each department.

	public static void listDownDept(List<Employee1> employeeList) {
		Map<String, List<Employee1>> empList = employeeList.stream()
				.collect(Collectors.groupingBy(Employee1::getDepartment));

		Set<Entry<String, List<Employee1>>> entrySet = empList.entrySet();

		for (Entry<String, List<Employee1>> entry : entrySet) {
			System.out.println("--------------------------------------");
			System.out.println("Employees In " + entry.getKey() + " : ");
			System.out.println("--------------------------------------");

			List<Employee1> list = entry.getValue();
			for (Employee1 e : list) {
				System.out.println(e.getName());
			}
		}
	}
	// 10 Find out the highest experienced employees in the organization

	public static void seniorEmp(List<Employee1> employeeList) {
		Optional<Employee1> seniorEmp = employeeList.stream()
				.sorted(Comparator.comparingInt(Employee1::getYearOfJoining))
				.findFirst();

		Employee1 seniorMostEmployee = seniorEmp.get();

		System.out.println("Senior Most Employee Details :");
		System.out.println("----------------------------");
		System.out.println("ID : " + seniorMostEmployee.getId());
		System.out.println("Name : " + seniorMostEmployee.getName());
		System.out.println("Age : " + seniorMostEmployee.getAge());
	}

	public static void main(String[] args) {
		List<Employee1> employeeList = new ArrayList<Employee1>();

		employeeList.add(new Employee1(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee1(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee1(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee1(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee1(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee1(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee1(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee1(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee1(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee1(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee1(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee1(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee1(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee1(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee1(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee1(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee1(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		Exp8.listDownDept(employeeList);
		
	}
}
