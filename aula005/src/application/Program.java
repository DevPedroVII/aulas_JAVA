package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee> list = new ArrayList<>();	
		
		System.out.print("How many emploees will be registered? ");
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++){
			
			System.out.println();
			System.out.println("Employee #"+ (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt(); 
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine(); 
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			
			Employee emp = new Employee (id, name, salary);
			
			list.add(emp);
		}
		
		sc.close();
	}

}
