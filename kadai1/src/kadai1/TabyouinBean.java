package kadai1;

import java.io.Serializable;

public class TabyouinBean implements Serializable {
	String tabyouinid;
	String tabyouinmei;
	String tabyouinaddress;
	String tabyouintel;
	   int tabyouinshihonkin;
	   int kyukyu;
	public String getTabyouinid() {
		return tabyouinid;
	}
	public void setTabyouinid(String tabyouinid) {
		this.tabyouinid = tabyouinid;
	}
	public String getTabyouinmei() {
		return tabyouinmei;
	}
	public void setTabyouinmei(String tabyouinmei) {
		this.tabyouinmei = tabyouinmei;
	}
	public String getTabyouinaddress() {
		return tabyouinaddress;
	}
	public void setTabyouinaddress(String tabyouinaddress) {
		this.tabyouinaddress = tabyouinaddress;
	}
	public String getTabyouintel() {
		return tabyouintel;
	}
	public void setTabyouintel(String tabyouintel) {
		this.tabyouintel = tabyouintel;
	}
	public int getTabyouinshihonkin() {
		return tabyouinshihonkin;
	}
	public void setTabyouinshihonkin(int tabyouinshihonkin) {
		this.tabyouinshihonkin = tabyouinshihonkin;
	}
	public int getKyukyu() {
		return kyukyu;
	}
	public void setKyukyu(int kyukyu) {
		this.kyukyu = kyukyu;
	}
}
