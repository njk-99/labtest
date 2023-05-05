package question;

public class StudentRecord {
	String sname;
	int roll_no;
	void assign(String n, int r) {
		sname=n;
		roll_no=r;
	}
	void display() {
		System.out.println("Student Name is:" +sname);
		System.out.println("Student roll number is:" +roll_no);
	}
	public static void main(String[] args) {
		StudentRecord obj=new StudentRecord();
		obj.assign("John", 2);
		obj.display();
	}
	

}
