package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kadai1.EmpArrayBean;
import kadai1.EmpBean;
import kadai1.MedicineArrayBean;
import kadai1.MedicineBean;
import kadai1.MedicinePara;
import kadai1.PatArrayBean;
import kadai1.PatBean;
import kadai1.SyochiArrayBean;
import kadai1.SyochiBean;
import kadai1.TabyouinArrayBean;
import kadai1.TabyouinBean;
import kadai1.ToSHA2;
import kadai1.employeeParameter;
import kadai1.patientpara;
import kadai1.syochipara;
import kadai1.tabyouinPara;



public class Dao1 {
	private Connection connection;
	private PreparedStatement statement = null;
	EmpBean eBean=null;
	TabyouinBean TBean=null;
	PatBean pBean=null;
	MedicineBean mBean=null;
	SyochiBean sBean=null;





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
					//	EmpBean eBean=new EmpBean();
						//eBean.setEmpfname(rs.getString(employeeParameter.empfname));

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
						eBean=new EmpBean();
						eBean.setEmprole(rs.getInt(employeeParameter.emprole));

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
				TBean.setTabyouinaddress(rs.getString(tabyouinPara.tabyouinaddress));
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
	public  EmpBean Emplogin2(String empid,String emppasswd){

		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM employee WHERE empid = ? AND emppasswd = ? ");
			statement.setString(1, empid);
			statement.setString(2, emppasswd);

			rs=statement.executeQuery();
			//eBean.setEmprole(rs.getInt(employeeParameter.emprole));
					if(rs.next()){
						eBean=new EmpBean();
						eBean.setEmprole(rs.getInt(employeeParameter.emprole));
						eBean.setEmpfname(rs.getString(employeeParameter.empfname));


					}else {


						}







		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return eBean;
	}
	public boolean SerchEmp3(String empid){

		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM employee WHERE empid = ? ");
			statement.setString(1, empid);


			rs=statement.executeQuery();

					if(rs.next()){
						return true;


					}
					return false;











		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return false;
}
	public PatArrayBean outputPat(){
		PatArrayBean paBean=new PatArrayBean();
		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM patient ");

			rs=statement.executeQuery();
			while(rs.next()){
				pBean=new PatBean();
				pBean.setPatid(rs.getString(patientpara.patid));
				pBean.setPatlname(rs.getString(patientpara.patlname));
				pBean.setPatfname(rs.getString(patientpara.patfname));
				pBean.setHokenmei(rs.getString(patientpara.hokenmei));
				pBean.setHokenexp(rs.getDate(patientpara.hokenexp));
				paBean.addPatArray(pBean);

			}


		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return paBean;


	}
	public void hokenUpdate(String hokenmei,String hokenexp,String patid){

		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("UPDATE patient set hokenmei = ?,hokenexp = ? where patid = ?");
			statement.setString(1,hokenmei);
			statement.setString(2,hokenexp);
			statement.setString(3,patid);


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
	public PatArrayBean serchpat(String patname){
		PatArrayBean paBean=new PatArrayBean();
		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM patient WHERE patlname LIKE ? or patfname like ?");
			statement.setString(1, "%"+patname+"%");
			statement.setString(2, "%"+patname+"%");
			rs=statement.executeQuery();
			while(rs.next()){
				pBean=new PatBean();
				pBean.setPatid(rs.getString(patientpara.patid));
				pBean.setPatfname(rs.getString(patientpara.patfname));
				pBean.setPatlname(rs.getString(patientpara.patlname));
				pBean.setHokenmei(rs.getString(patientpara.hokenmei));
				pBean.setHokenexp(rs.getDate(patientpara.hokenexp));

				paBean.addPatArray(pBean);


			}


		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return paBean;


	}
	public MedicineArrayBean outputMedicine(){
		MedicineArrayBean maBean=new MedicineArrayBean();
		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM medicine ");

			rs=statement.executeQuery();
			while(rs.next()){
				mBean=new MedicineBean();
				mBean.setMedicineid(rs.getString(MedicinePara.medicineid));

				mBean.setMedicinename(rs.getString(MedicinePara.medicinename));

				mBean.setUnit(rs.getString(MedicinePara.unit));
				maBean.addMediArray(mBean);

			}


		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return maBean;




	}
	public MedicineArrayBean outputMedicine2(String medicineid,int kosu){
		MedicineArrayBean maBean=new MedicineArrayBean();
		ResultSet rs=null;

		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM medicine where medicineid= ?");
			statement.setString(1, medicineid);
			rs=statement.executeQuery();

			while(rs.next()){


				mBean=new MedicineBean();
				mBean.setMedicineid(rs.getString(MedicinePara.medicineid));

				mBean.setMedicinename(rs.getString(MedicinePara.medicinename));

				mBean.setUnit(rs.getString(MedicinePara.unit));
				mBean.setKosu(kosu);
				maBean.addMediArray(mBean);
				//System.out.println(mBean.getKosu());


			}


		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return maBean;
	}
	public MedicineBean outputMedicine3(String medicineid,int kosu){
		MedicineBean mBean=new MedicineBean();
		ResultSet rs=null;

		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM medicine where medicineid= ?");
			statement.setString(1, medicineid);
			rs=statement.executeQuery();

			while(rs.next()){


				mBean=new MedicineBean();
				mBean.setMedicineid(rs.getString(MedicinePara.medicineid));

				mBean.setMedicinename(rs.getString(MedicinePara.medicinename));

				mBean.setUnit(rs.getString(MedicinePara.unit));
				mBean.setKosu(kosu);

				//System.out.println(mBean.getKosu());


			}


		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return mBean;
	}

	public void SyochiRegister(String patid,String patlname,String patfname,String medicinename,String unit,String kosu){
		//String beforepass;

		ResultSet rs=null;
		this.open();

		try {
			statement =connection.prepareStatement("insert into syochi (patid,patlname,patfname,medicinename,unit,kosu) values(?,?,?,?,?,?)");
			statement.setString(1, patid);
			statement.setString(2, patlname);
			statement.setString(3, patfname);
			statement.setString(4, medicinename);
			statement.setString(5, unit);
			statement.setString(6, kosu);
			int num=statement.executeUpdate();

			rs=statement.executeQuery();

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
	public boolean SerchTabyouin3(String tabyouinid){

		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM tabyouin WHERE tabyouinid = ? ");
			statement.setString(1, tabyouinid);


			rs=statement.executeQuery();

					if(rs.next()){
						return true;


					}
					return false;











		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return false;
}
	public TabyouinArrayBean serchtabyouin2(){
		TabyouinArrayBean TABean=new TabyouinArrayBean();
		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM tabyouin ");
			//statement.setString(1, "%"+tabyouinaddress+"%");
			rs=statement.executeQuery();
			while(rs.next()){
				TBean=new TabyouinBean();
				TBean.setTabyouinid(rs.getString(tabyouinPara.tabyouinid));
				TBean.setTabyouinmei(rs.getString(tabyouinPara.tabyouinmei));
				TBean.setTabyouinaddress(rs.getString(tabyouinPara.tabyouinaddress));
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
	public  EmpBean Adminlogin2(String empid,String emppasswd){

		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM employee WHERE empid = ? AND emppasswd = ? ");
			statement.setString(1, empid);
			statement.setString(2, emppasswd);

			rs=statement.executeQuery();
			//eBean.setEmprole(rs.getInt(employeeParameter.emprole));
					if(rs.next()){
						eBean=new EmpBean();
						eBean.setEmprole(rs.getInt(employeeParameter.emprole));
						eBean.setEmpfname(rs.getString(employeeParameter.empfname));



					}else {


						}







		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return eBean;
	}
	public void medicineRegister(String medicineid,String medicinename,String unit){
		//String beforepass;
		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("insert into medicine (medicineid,medicinename,unit) values(?,?,?);");
			statement.setString(1, medicineid);
			statement.setString(2, medicinename);
			statement.setString(3, unit);

			int num=statement.executeUpdate();
		System.out.println(num);
			rs=statement.executeQuery();
			System.out.println(medicineid);
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
	public boolean SerchMedicine(String medicineid){

		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM medicine WHERE medicineid = ? ");
			statement.setString(1, medicineid);


			rs=statement.executeQuery();

					if(rs.next()){
						return true;


					}
					return false;











		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return false;
}
	public void deleteMedicine(String medicineid){

		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("delete FROM medicine WHERE medicineid = ? ");
			statement.setString(1, medicineid);

			int num=statement.executeUpdate();
			rs=statement.executeQuery();
			//eBean.setEmprole(rs.getInt(employeeParameter.emprole));
					if(rs.next()){




					}else {


						}







		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
	public SyochiArrayBean outputsyochi(){
		SyochiArrayBean saBean=new SyochiArrayBean();
		ResultSet rs=null;
		this.open();
		try {
			statement =connection.prepareStatement("SELECT * FROM syochi ");

			rs=statement.executeQuery();
			while(rs.next()){
				sBean=new SyochiBean();
				sBean.setPatid(rs.getString(syochipara.patid));
				sBean.setPatlname(rs.getString(syochipara.patlname));
				sBean.setPatfname(rs.getString(syochipara.patfname));
				sBean.setMedicinename(rs.getString(syochipara.medicinename));
				sBean.setUnit(rs.getString(syochipara.unit));
				sBean.setKosu(rs.getString(syochipara.kosu));
				saBean.addsyochiArray(sBean);

			}


		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return saBean;


	}
}

