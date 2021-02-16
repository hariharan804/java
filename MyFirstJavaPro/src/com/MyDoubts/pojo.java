package com.MyDoubts;

import java.sql.*;
import java.util.ArrayList;

/*
class Employee {
	  private String lastName;
	  private String firstName;
	  public Employee(String firstName,String lastName ) {
	    this.lastName = lastName;
	    this.firstName = firstName;
	  }

	  public String getLastName() {
	    return this.lastName;
	  }

	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }

	  public String getFirstName() {
	    return this.firstName;
	  }

	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }
	  
	}

public class pojo {
  public static void main(String[] a) {
    ArrayList<Employee> emps = new ArrayList<Employee>();
    
    Employee e1 = new Employee("aZZ", "AAAAA");
    emps.add(e1);
    emps.add(new Employee("bZZ", "AAAAA"));
    emps.add(new Employee("cZ", "AAAAA"));
     
     Employee e = emps.get(2);
    e.setFirstName("DDDD");
    for (int i = 0; i < emps.size(); i++) {
    
    	Employee ew = emps.get(i);
    	String x = ew.getFirstName();
    System.out.println(x);
    }
  }
}

*/

class Employee {

	int id;
	String name;
	String designation;
	long phoneno;
	double salary;
	char grade;

	public Employee(int id, String name, String designation, long phoneno, double salary, char grade) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.phoneno = phoneno;
		this.salary = salary;
		this.grade = grade;
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

	public String getdesignation() {
		return designation;
	}

	public void setdesignation(String designation) {
		this.designation = designation;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

}

public class pojo {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(100, "Gowsik", "Accountant", 1234567890l, 25000.0, 'A');
		Employee e2 = new Employee(101, "Ram", "Clerk", 1234567890l, 25000.0, 'A');
		Employee e3 = new Employee(102, "Hari", "Accountant", 1234567890l, 25000.0, 'A');
		Employee e4 = new Employee(99, "java", "Accountant", 1234567890l, 25000.0, 'A');
		Employee e5 = new Employee(33, "sanker", "HR", 1233434323l, 50000.0, 'z');

		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);

		for (int i = 0; i < al.size(); i++) {
			Employee e = al.get(i);
			String x = e.getdesignation();
			if (x.equals("Accountant")) {
				// insert JDBC code
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "1234");
					PreparedStatement ps = con.prepareStatement("insert into pojo1 values(?,?,?,?,?)");
					ps.setInt(1, e.getId());
					ps.setString(2, e.getName());
					ps.setString(3, e.getdesignation());
					ps.setLong(4, e.getPhoneno());
					ps.setDouble(5, e.getSalary());
					ps.setString(6, String.valueOf(e.getGrade()));

					ps.executeUpdate();
					con.close();
				} catch (Exception we) {
					System.out.print(we);
				}

				// System.out.println(e.getId()+" "+e.getName()+e.getGrade());
			}
		}

	}

}
