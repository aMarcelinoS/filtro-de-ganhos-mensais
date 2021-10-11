package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;


public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
	//PART 1
		
		System.out.print("Enter departamet's name: ");
		String departamentName = sc.nextLine();				
		System.out.println();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();		
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();		
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker (workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament (departamentName));
		
	//PART 2
		System.out.println();
		System.out.print("How may contracts to this worker? ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #"+ i +" data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			System.out.println();
			
			HourContract contract = new HourContract (contractDate, valuePerHour, hours);
			worker.addContract(contract);
			
		}
		
	//PART 3
	System.out.println();	
	System.out.print("Enter month and year to calculate income (MM/YYYY): ");	
	String monthAndYear = sc.next();
	int month = Integer.parseInt(monthAndYear.substring(0, 2));
	int year = Integer.parseInt(monthAndYear.substring(3));
	
	System.out.println("Name: "+ worker.getName());
	System.out.println("Departament: "+ worker.getDepartament().getName());
	System.out.print("Income for "+ monthAndYear+": " + String.format("%.2f", worker.income(year, month)));
		
	sc.close();	
	}

}
