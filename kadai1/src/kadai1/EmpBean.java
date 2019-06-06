package kadai1;

import java.io.Serializable;

public class EmpBean implements Serializable {
String empid;
String empfname;
String emplname;
String emppasswd;
int emprole;
public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
public String getEmpfname() {
	return empfname;
}
public void setEmpfname(String empfname) {
	this.empfname = empfname;
}
public String getEmplname() {
	return emplname;
}
public void setEmplname(String emplname) {
	this.emplname = emplname;
}
public String getEmppasswd() {
	return emppasswd;
}
public void setEmppasswd(String emppasswd) {
	this.emppasswd = emppasswd;
}
public int getEmprole() {
	return emprole;
}
public void setEmprole(int emprole) {
	this.emprole = emprole;
}
}
