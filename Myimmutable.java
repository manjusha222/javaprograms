package student;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
enum Currency{Dollars, Rupees, Yens};
enum Department{Sales,Marketing,Production};

final class Company{
	private String companyName;
	private int registrationNumber;
   public List<Employee> elist;
   public String deparray[];
	Company(){}
	public Company(String companyName, int registrationNumber) {
		super();
		this.companyName = companyName;
		this.registrationNumber = registrationNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public int getRegistrationNumber() {
		return registrationNumber;
	}
	public Employee registerEmployee(){
		return new Employee();
	}
	}
//Mutable class means objects f employee class may be changed
class Employee{
	private StringBuilder empName;
	private int empCode;
	private Currency salaryType;
	private float salary;
	Employee(){}
	public Employee(StringBuilder empName, int empCode) {
		super();
		this.empName = empName;
		this.empCode = empCode;
	}
	public StringBuilder getEmpName() {
		return empName;
	}
	public void setEmpName(StringBuilder empName) {
		this.empName = empName;
	}
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	public Currency getSalaryType() {
		return salaryType;
	}
	public void setSalaryType(Currency salaryType) {
		this.salaryType = salaryType;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
public class Myimmutable  {
	public static void main(String[] args) throws IOException{
		Company c1=new Company("HCL", 12345);
		Company c2=c1;
		
		c2=new Company("WIpro", 99999);
		c2.getCompanyName().replace("W", "P");
		System.out.println("Company:"+c1.getCompanyName()+"RegistrationNumber:"+c1.getRegistrationNumber());
		System.out.println("Company:"+c2.getCompanyName()+"RegistrationNumber:"+c2.getRegistrationNumber());
		char reply;
		c1.elist=new ArrayList<Employee>();
		do
		{
		Employee e=c1.registerEmployee();
		System.out.println("Enter employeee code:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		e.setEmpCode(Integer.parseInt(br.readLine()));
		System.out.println("Enter employeee name:");
		
		e.setEmpName(new StringBuilder(br.readLine()));
		
		c1.elist.add(e);
		System.out.println("Wish to ad more?(y/n)");
		reply=br.readLine().toLowerCase().charAt(0);
		}while(reply=='y');
		for(Employee emp : c1.elist)
		{
			System.out.println(emp.getEmpCode()+"\t"+emp.getEmpName());
		}
	}
}
		
		
		
	


