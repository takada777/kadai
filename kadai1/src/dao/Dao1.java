package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kadai1.EmpBean;
import kadai1.employeeParameter;



public class Dao1 {
	private Connection connection;
	private PreparedStatement statement = null;
	EmpBean eBean=null;


	public void open() {
		if( connection == null){
        	try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost/kadai1","S3A101","12345");
			} catch (ClassNotFoundException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
        }
	}
	public void close() {
		if(connection != null){
			try {
				connection.close();
			} catch (SQLException sqle) {	}
		}
		statement = null;
	}
	public  boolean Adminlogin(String empid,String emppasswd){

		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM employee WHERE empid = ? AND emppasswd = ? AND emprole = 1");
			statement.setString(1, empid);
			statement.setString(2, emppasswd);

			rs=statement.executeQuery();

					if(rs.next()){
						return true;
					}else {
						return false;

						}







		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return false;
}
	public  boolean Emplogin(String empid,String emppasswd){

		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM employee WHERE empid = ? AND emppasswd = ? ");
			statement.setString(1, empid);
			statement.setString(2, emppasswd);

			rs=statement.executeQuery();

					if(rs.next()){
						return true;
					}else {
						return false;

						}







		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return false;
}
	public void Register(String empid,String empfname,String emplname,String emppasswd,int emprole){

		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("insert into employee (empid,empfname,emplname,emppasswd,emprole) values(?,?,?,?,?);");
			statement.setString(1, empid);
			statement.setString(2, empfname);
			statement.setString(3, emplname);
			statement.setString(4, emppasswd);
			statement.setInt(5, emprole);
			int num=statement.executeUpdate();
			System.out.println(num);
			rs=statement.executeQuery();

					while(rs.next()){


						}







		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

}
	public EmpBean SerchEmp(String empid){

		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM employee WHERE empid = ? ");
			statement.setString(1, empid);


			rs=statement.executeQuery();

					while(rs.next()){
						eBean=new EmpBean();
						eBean.setEmpid(empid);
						eBean.setEmpfname(rs.getString(employeeParameter.empfname));
						eBean.setEmplname(rs.getString(employeeParameter.emplname));
						eBean.setEmppasswd(rs.getString(employeeParameter.emppasswd));

					}











		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return eBean;
}
	public void Update(String emplname,String empfname,String empid){

		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("UPDATE employee set emplname = ?,empfname = ? where empid = ?");
			statement.setString(1,emplname);
			statement.setString(2,empfname);
			statement.setString(3,empid);


			int num=statement.executeUpdate();
			System.out.println(num);
			rs=statement.executeQuery();

					while(rs.next()){


						}







		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
