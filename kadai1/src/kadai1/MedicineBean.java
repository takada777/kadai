package kadai1;

import java.io.Serializable;

public class MedicineBean implements Serializable{
String medicineid;
String medicinename;
String unit;
int kosu;
int kosu5;
int kosu6;
int kosu7;
public int getKosu5() {
	return kosu5;
}
public void setKosu5(int kosu5) {
	this.kosu5 = kosu5;
}
public int getKosu6() {
	return kosu6;
}
public void setKosu6(int kosu6) {
	this.kosu6 = kosu6;
}
public int getKosu7() {
	return kosu7;
}
public void setKosu7(int kosu7) {
	this.kosu7 = kosu7;
}
String kazu;
String kosu2[];
public String[] getKosu2() {
	return kosu2;
}
public void setKosu2(String[] kosu2) {
	this.kosu2 = kosu2;
}
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
