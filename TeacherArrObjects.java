package MODULE3;
import java.util.Scanner;
class Person{
	String name;
	String gender;
	String address;
	int age;
	Person(){}
	Person(String name,String gender,String address,int age){
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}}
class Employee extends Person{
		String empid,company_name,qualification;
		float salary;
		Employee(){}
		Employee(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary)
		{
			super(name,gender,address,age);
			this.empid=empid;
			this.company_name=company_name;
			this.qualification=qualification;
			this.salary=salary;
		}}
	
class Teacher extends Employee{
		String  subject,department;
		int tid;
		
		Teacher(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary,String subject,String department,int tid)
		{
			super(name,gender,address,age,empid,company_name,qualification,salary);
			this.subject=subject;
			this.department=department;
			this.tid=tid;
		}
	
	
	public void display() {
		System.out.println("Teacher id: "+empid);
		System.out.println("Teacher name: "+name);
		System.out.println("Teacher gender: "+gender);
		System.out.println("Teacher address: "+address);
		System.out.println("Teacher age: "+age);
		System.out.println("Teacher company_name "+company_name);
		System.out.println("Teacher qualification: "+qualification);
		System.out.println("Teacher salary: "+salary);
		System.out.println("Teacher teacher-id: "+tid);
		System.out.println("Teacher subject: "+subject);
		System.out.println("Teacher department: "+department);}
	}
public  class TeacherArrObjects{
		public static void main(String [] args) {
			System.out.println("Enter number of Teachers: ");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println("Enter teacher details one by one");
			Teacher teacher[]=new Teacher[n];
			Scanner sct=new Scanner(System.in);
			int tid,age;
			String name,company_name,qualification,gender,empid;
			float salary;
			String address,department,subject;
			for(int i=0;i<n;i++) {
				System.out.println("Enter details of Teacher"+i+1);
				
				System.out.println("Enter Teacher name");
				name=sct.next();
				System.out.println("Enter Teacher gender");
				gender=sct.next();
				System.out.println("Enter Teacher address");
				address=sct.next();
				System.out.println("Enter Teacher age");
				age=sct.nextInt();
				System.out.println("Enter Employee id of teacher");
				empid=sct.next();
				System.out.println("Enter Teacher company_name");
				company_name=sct.next();
				
				System.out.println("Enter Teacher department");
				department=sct.next();
				System.out.println("Enter Teacher qualification");
				qualification=sct.next();
				System.out.println("Enter Teacher salary");
				salary=sct.nextFloat();
				System.out.println("Enter Teacher subject");
				subject=sct.next();
				System.out.println("Enter Teacher id(integer):");
				tid=sct.nextInt();
				
				
				Teacher t=new Teacher(name,gender,address,age,empid,company_name,qualification,salary,subject,department,tid);
				teacher[i]=t;
			}
				System.out.println("Teachers are: \n");
				for(Teacher x:teacher) {
					x.display();
					System.out.println("\n");
				
			}
		}
		
	}

		
		
	






