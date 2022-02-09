package Test1;
import java.util.Scanner;
public class EmployeeQn2 {
		
		String name;
		String city;
		int age;
		int ssn;
		String country;
		
		
		public void getData() {
			Scanner sc= new Scanner(System.in);
			
			System.out.println ("Enter name");
			this.name= sc.next();
			System.out.println ("Enter city");
			this.city= sc.next();
			System.out.println ("Enter age");
			this.age= sc.nextInt();
			System.out.println ("Enter country");
			this.country= sc.next();
			this.ssn= sc.nextInt();
			System.out.println ("Enter ssn");
			
			sc.close();
			
		}
		
		public void printData () {
			System.out.println ("name"+this.name);
			System.out.println ("city"+this.city);
			System.out.println ("age"+this.age);
			System.out.println ("country"+this.country);
			System.out.println ("ssn"+this.ssn);
		
			
		}
		public static void main(String args[]) {
			EmployeeQn2 e1=new EmployeeQn2();
			
			e1.getData();
			e1.printData();
		}

		
					}


