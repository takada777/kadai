package kadai1;

import java.io.Serializable;

public class SyochiBean implements Serializable {
String patid;
String patlname;
String patfname;
String medicinename;
String unit;
String kosu;
String date;
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getPatid() {
	return patid;
}
public void setPatid(String patid) {
	this.patid = patid;
}
public String getPatlname() {
	return patlname;
}
public void setPatlname(String patlname) {
	this.patlname = patlname;
}
public String getPatfname() {
	return patfname;
}
public void setPatfname(String patfname) {
	this.patfname = patfname;
}
public String getMedicinename() {
	return medicinename;
}
public void setMedicinename(String medicinename) {
	this.medicinename = medicinename;
}
public String getUnit() {
	return unit;
}
public void setUnit(String unit) {
	this.unit = unit;
}
public String getKosu() {
	return kosu;
}
public void setKosu(String kosu) {
	this.kosu = kosu;
}
}
