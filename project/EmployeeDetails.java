package jdbc.employee.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class EmployeeDetails {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("----Welcome To JDBC Project------");
		System.out.println("Which Operation Do you Need To Perform ?");
		System.out.println("1.Save \n2.Update \n3.Delete \n4.FetchAll \n5.Fetch By ID \n6.Exit");
		int operation=sc.nextInt();
		
		switch(operation) {
		case 1://Save Operation
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String url="jdbc:mysql://localhost:3306/emp_details";
				String user="root";
				String password="root";
				Connection con=DriverManager.getConnection(url,user,password);
				
				String query="insert into employee values(?,?,?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(query);
			
				
				System.out.println("Enter the Id of the Employee");
				int id=sc.nextInt();
				System.out.println("Enter the Name of the Employee");
				String name=sc.next();
				System.out.println("Enter the Salary of the Employee");
				double salary=sc.nextDouble();
				System.out.println("Enter the Phone Number of the Employee");
				String phno=sc.next();
				System.out.println("Enter the email of the Employee");
				String email=sc.next();
				System.out.println("Enter the Address of the Employee");
				String Address=sc.next();
				System.out.println("Enter the Company Name of the Employee");
				String comname=sc.next();
				
				 
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setDouble(3, salary);
				ps.setString(4, phno);
				ps.setString(5, email);
				ps.setString(6, Address);
				ps.setString(7, comname);
				
				
				
				ps.execute();
				con.close();
				System.out.println("The Employee Details are Inserted Sucessfully");
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			break;
		case 2://Update
			while(true) {
			System.out.println("Enter What to Update ?");
			System.out.println("a.Name \nb.Salary \nc.PhoneNumber \nd.Email \ne.Exit");
			char update=sc.next().charAt(0);
			if(update == 'e') {
				System.out.println("Thank You For Upadting");
			    break;
			}

			switch(update) {
			case 'a'://For Updating the Name
				try {
					//Step-1
					Class.forName("com.mysql.cj.jdbc.Driver");
					//Step-2
					String url="jdbc:mysql://localhost:3306/emp_details";
					String user="root";
					String password="root";
					Connection con=DriverManager.getConnection(url,user,password);
					
					String query="update employee set name=? where id=?";
					PreparedStatement ps=con.prepareStatement(query);
					
					
					
					System.out.println("Enter the New Name of the Employee");
					String name=sc.next();
					
					System.out.println("Enter the Id of the Employee");
					int id=sc.nextInt();
					
					ps.setString(1, name);
					ps.setInt(2, id);
					
					
					ps.execute();
					con.close();
					System.out.println("The Employee Name was Updated Sucessfully");
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				continue;
			case 'b'://For Updating the Salary
				try {
					//Step-1
					Class.forName("com.mysql.cj.jdbc.Driver");
					//Step-2
					String url="jdbc:mysql://localhost:3306/emp_details";
					String user="root";
					String password="root";
					Connection con=DriverManager.getConnection(url,user,password);
					
					String query="update employee set salary=? where id=?";
					PreparedStatement ps=con.prepareStatement(query);
					
					
					
					System.out.println("Enter the New Salary of the Employee");
					double sal=sc.nextDouble();
					
					System.out.println("Enter the Id of the Employee");
					int id=sc.nextInt();
					
					ps.setDouble(1, sal);
					ps.setInt(2, id);
					
					
					ps.execute();
					con.close();
					System.out.println("The Employee Salary was Updated Sucessfully");
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				continue;
			case 'c'://For Updating the PhoneNumber
				try {
					//Step-1
					Class.forName("com.mysql.cj.jdbc.Driver");
					//Step-2
					String url="jdbc:mysql://localhost:3306/emp_details";
					String user="root";
					String password="root";
					Connection con=DriverManager.getConnection(url,user,password);
					
					String query="update employee set phonenumber=? where id=?";
					PreparedStatement ps=con.prepareStatement(query);
					
					
					
					System.out.println("Enter the New PhoneNumber of the Employee");
					String phno=sc.next();
					
					System.out.println("Enter the Id of the Employee");
					int id=sc.nextInt();
					
					ps.setString(1, phno);
					ps.setInt(2, id);
					
					
					ps.execute();
					con.close();
					System.out.println("The Employee Phone Number was Updated Sucessfully");
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				continue;
			case 'd'://For Updating the Email
				try {
					//Step-1
					Class.forName("com.mysql.cj.jdbc.Driver");
					//Step-2
					String url="jdbc:mysql://localhost:3306/emp_details";
					String user="root";
					String password="root";
					Connection con=DriverManager.getConnection(url,user,password);
					
					String query="update employee set email=? where id=?";
					PreparedStatement ps=con.prepareStatement(query);
					
					
					
					System.out.println("Enter the New Email of the Employee");
					String Email=sc.next();
					
					System.out.println("Enter the Id of the Employee");
					int id=sc.nextInt();
					
					ps.setString(1, Email);
					ps.setInt(2, id);
					
					
					ps.execute();
					con.close();
					System.out.println("The Employee Email was Updated Sucessfully");
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				continue;
			case 'e'://Exit
				System.out.println("Thank You For Upadting");
				break;
				
			default:
			    try {
			        throw new InvalidChoiceException("Invalid Update Option. Choose between a to e.");
			    } catch (InvalidChoiceException e) {
			        System.out.println("Error: " + e.getMessage());
			    }
			    continue;
			}
			
			
			}
			break;

	
		case 3://For Delete operation
			try {
				//Step-1
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Step-2
				String url="jdbc:mysql://localhost:3306/emp_details";
				String user="root";
				String password="root";
				Connection con=DriverManager.getConnection(url,user,password);
				//Step-3 use preapred statement
				String query="delete from employee where id =? ";
				PreparedStatement ps=con.prepareStatement(query);
				
				
				
				System.out.println("Enter the Id of the Employee");
				int id=sc.nextInt();
				
				ps.setInt(1, id);
				
				
				ps.execute();
				con.close();
				System.out.println("The Employee Details was Deleted Sucessfully");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 4://For Fetch All the Data
			try {
				//Step-1
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Step-2
				String url="jdbc:mysql://localhost:3306/emp_details";
				String user="root";
				String password="root";
				Connection con=DriverManager.getConnection(url,user,password);
				//Step-3 use preapred statement
				String query="select * from Employee";
				PreparedStatement ps=con.prepareStatement(query);
				
				ps.execute();
				
				ResultSet rs=ps.getResultSet();
				
				while(rs.next()) {
				
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getDouble(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));
				System.out.println(rs.getString(7));
				System.out.println("-------------");
				}
				
			
				
				con.close();
				System.out.println("The Employee Details are Fetched Sucessfully");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 5://For Fetch By Id
			try {
				//Step-1
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Step-2
				String url="jdbc:mysql://localhost:3306/emp_details";
				String user="root";
				String password="root";
				Connection con=DriverManager.getConnection(url,user,password);
				//Step-3 use preapred statement
				String query="select * from employee where id =?";
				PreparedStatement ps=con.prepareStatement(query);
				
				
				
				
				System.out.println("Enter the Id of the Employee");
				int id=sc.nextInt();
				
				
				ps.setInt(1, id);
				ps.execute();
				
				ResultSet rs=ps.getResultSet();
				
				if (rs.next()) {
				    System.out.println(rs.getInt(1));
				    System.out.println(rs.getString(2));
				    System.out.println(rs.getDouble(3));
				    System.out.println(rs.getString(4));
				    System.out.println(rs.getString(5));
				    System.out.println(rs.getString(6));
				    System.out.println(rs.getString(7));
				} else {
				    System.out.println("No Employee found with the given ID.");
				}

				
				
				
				//Step-7 Atlast we have to excute the prepare stmt by ps.execute and close the connection
				
				
				con.close();
				System.out.println("The Employee Details are Fetched Sucessfully");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 6:
			System.out.println("Thank You");
		    System.exit(0);
		default:
		    try {
		        throw new InvalidChoiceException("Invalid Main Menu Choice. Please enter between 1 and 6.");
		    } catch (InvalidChoiceException e) {
		        System.out.println("Error: " + e.getMessage());
		    }
		    break;

		}
		
	}
}

}
