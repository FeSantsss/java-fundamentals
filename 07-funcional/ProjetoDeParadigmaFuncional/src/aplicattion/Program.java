package aplicattion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				Double salary = Double.parseDouble(fields[2]);
				
				line = br.readLine();
				
				Employee emp = new Employee(name, email, salary);
				list.add(emp);
			}
			
			System.out.print("Enter salary: ");
			Double salaryRequered = sc.nextDouble();
			
			System.out.println("Email of people whose salary is more than " + salaryRequered + ":");
			list.stream()
				.filter(e -> e.getSalary() >= salaryRequered)
				.sorted(Comparator.comparing(Employee::getEmail))
				.collect(Collectors.toList())
				.forEach(System.out::println);
			
			
			System.out.print("Sum of salary of people whose name starts with 'M': ");
			System.out.println(list.stream()
				.filter(n -> n.getName().charAt(0) == 'M')
				.mapToDouble(Employee::getSalary)
				.sum());
				
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			sc.close();
		}
		
	}

}
