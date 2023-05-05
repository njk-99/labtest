package exception_handling;

public class Employee {
	String empName;
	int empSal;
	String add;

	public Employee()
		{this("Nilam");}
	
	public Employee(String name)
		{ this(name, 60000); }
	public Employee(String name, int sal)
	    { this(name, sal, "Pune"); }
	public Employee(String name, int sal, String addr)
		  { this.empName=name;
		    this.empSal=sal;
		    this.add=addr;
	      }

    void disp() {
    System.out.println("Employee Name: "+empName); 
    System.out.println("Employee Salary: "+empSal); 
    System.out.println("Employee Address: "+add);
    }
 public static void main(String[] args)
    {
	    Employee e = new Employee();
	    e.disp();
	    }
    }


