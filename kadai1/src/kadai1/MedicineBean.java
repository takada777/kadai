package kadai1;

import java.io.Serializable;

public class MedicineBean implements Serializable{
String medicineid;
String medicinename;
String unit;
int kosu;
public int getKosu() {
	return kosu;
}
public void setKosu(int kosu) {
	this.kosu = kosu;
}
public String getMedicineid() {
	return medicineid;
}
public void setMedicineid(String medicineid) {
	this.medicineid = medicineid;
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
public int getTotalKosu(){
	return shohinPrice * quantity;
}
