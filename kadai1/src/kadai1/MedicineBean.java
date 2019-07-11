package kadai1;

import java.io.Serializable;

public class MedicineBean implements Serializable{
String medicineid;
String medicinename;
String unit;
String qu;

public String getQu() {
	return qu;
}
public void setQu(String qu) {
	this.qu = qu;
}
int kosu;
int kosu1;
int kosu2;
int kosu3;

public int getKosu1() {
	return kosu1;
}
public void setKosu1(int kosu1) {
	this.kosu1 = kosu1;
}
public int getKosu2() {
	return kosu2;
}
public void setKosu2(int kosu2) {
	this.kosu2 = kosu2;
}
public int getKosu3() {
	return kosu3;
}
public void setKosu3(int kosu3) {
	this.kosu3 = kosu3;
}
String kazu;



public String getKazu() {
	return kazu;
}
public void setKazu(String kazu) {
	this.kazu = kazu;
}
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
	int sum=0;

	return sum+=kosu;
}
public void set(String string) {
	// TODO 自動生成されたメソッド・スタブ

}
}
