package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kadai1.EmpArrayBean;
import kadai1.EmpBean;
import kadai1.TabyouinArrayBean;
import kadai1.TabyouinBean;
import kadai1.ToSHA2;
import kadai1.employeeParameter;
import kadai1.tabyouinPara;



public class Dao1 {
	private Connection connection;
	private PreparedStatement statement = null;
	EmpBean eBean=null;
	TabyouinBean TBean=null;




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
			//eBean.setEmprole(rs.getInt(employeeParameter.emprole));
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
	public void Register(String empid,String empfname,String emplname,String emppasswd,String emprole){
		String beforepass;
		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("insert into employee (empid,empfname,emplname,emppasswd,emprole) values(?,?,?,?,?);");
			statement.setString(1, empid);
			statement.setString(2, empfname);
			statement.setString(3, emplname);

			ToSHA2 sha2=new ToSHA2();
			emppasswd=sha2.getDigest(emppasswd);
			statement.setString(4, emppasswd);
			statement.setString(5, emprole);
			int num=statement.executeUpdate();
			System.out.println(num);
			rs=statement.executeQuery();

					while(rs.next()){
						beforepass=emppasswd;
						eBean=new EmpBean();
						eBean.setEmppasswd(beforepass);

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
						eBean.setEmprole(rs.getInt(employeeParameter.emprole));

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
	public void TabyouinRegister(String tabyouinid,String tabyouinmei,String tabyouinaddress,String tabyouintel,String tabyouinshihonkin,String kyukyu){

		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("insert into tabyouin (tabyouinid,tabyouinmei,tabyouinaddress,tabyouintel,tabyouinshihonkin,kyukyu) values(?,?,?,?,?,?);");
			statement.setString(1, tabyouinid);
			statement.setString(2, tabyouinmei);


			statement.setString(3, tabyouinaddress);
			statement.setString(4,tabyouintel);
			statement.setString(5, tabyouinshihonkin);
			statement.setString(6, kyukyu);
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
	public TabyouinArrayBean serchtabyouin(String tabyouinaddress){
		TabyouinArrayBean TABean=new TabyouinArrayBean();
		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM tabyouin WHERE tabyouinaddress LIKE ?");
			statement.setString(1, "%"+tabyouinaddress+"%");
			rs=statement.executeQuery();
			while(rs.next()){
				TBean=new TabyouinBean();
				TBean.setTabyouinid(rs.getString(tabyouinPara.tabyouinid));
				TBean.setTabyouinmei(rs.getString(tabyouinPara.tabyouinmei));
				TBean.setTabyouinaddress(tabyouinaddress);
				TBean.setTabyouintel(rs.getString(tabyouinPara.tabyouintel));
				TBean.setTabyouinshihonkin(rs.getInt(tabyouinPara.tabyouinshihonkin));
				TBean.setKyukyu(rs.getInt(tabyouinPara.kyukyu));
				TABean.addTabyouinArray(TBean);

			}


		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return TABean;


	}
	public EmpArrayBean outputEmp(){
		EmpArrayBean EABean=new EmpArrayBean();
		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM employee WHERE emprole='1'");

			rs=statement.executeQuery();
			while(rs.next()){
				eBean=new EmpBean();
				eBean.setEmpid(rs.getString(employeeParameter.empid));
				eBean.setEmplname(rs.getString(employeeParameter.emplname));
				eBean.setEmpfname(rs.getString(employeeParameter.empfname));
				eBean.setEmppasswd(rs.getString(employeeParameter.emppasswd));
				eBean.setEmprole(rs.getInt(employeeParameter.emprole));
				EABean.addEmpArray(eBean);

			}


		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return EABean;


	}
	public EmpBean serchinfo(String empid){

		ResultSet rs=null;
		EmpBean eBean = null;
		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM employee WHERE empid = ?");
			statement.setString(1, empid);
			rs=statement.executeQuery();

					if(rs.next()){
						eBean=new EmpBean();
						eBean.setEmpid(empid);
				        eBean.setEmppasswd(rs.getString(employeeParameter.emppasswd));



					}else{
						throw new SQLException("ユーザが見つかりません");
					}


		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return eBean;
	}
	public void UpdatePass(String emppasswd,String empid){

		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("UPDATE employee set emppasswd = ? where empid = ?");
			ToSHA2 sha2=new ToSHA2();
			emppasswd=sha2.getDigest(emppasswd);
			statement.setString(1,emppasswd);

			statement.setString(2,empid);


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
	public void PatRegister(String patid,String patfname,String patlname,String hokenmei,String hokenexp){
		//String beforepass;
		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("insert into patient (patid,patfname,patlname,hokenmei,hokenexp) values(?,?,?,?,?);");
			statement.setString(1, patid);
			statement.setString(2, patfname);
			statement.setString(3, patlname);
			statement.setString(4, hokenmei);
			statement.setString(5, hokenexp);
			int num=statement.executeUpdate();
			System.out.println(num);
			rs=statement.executeQuery();
			System.out.println(patid);
					while(rs.next()){
						//beforepass=emppasswd;
						//eBean=new EmpBean();
						//eBean.setEmppasswd(beforepass);


						}







		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

}
}
