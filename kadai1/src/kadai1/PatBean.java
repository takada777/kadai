package kadai1;

import java.io.Serializable;
import java.sql.Date;

public class PatBean implements Serializable {
	String patid;
	String patfname;
	String patlname;
	String hokenmei;
	Date hokenexp;
	public String getPatid() {
		return patid;
	}
	public void setPatid(String patid) {
		this.patid = patid;
	}
	public String getPatfname() {
		return patfname;
	}
	public void setPatfname(String patfname) {
		this.patfname = patfname;
	}
	public String getPatlname() {
		return patlname;
	}
	public void setPatlname(String patlname) {
		this.patlname = patlname;
	}
	public String getHokenmei() {
		return hokenmei;
	}
	public void setHokenmei(String hokenmei) {
		this.hokenmei = hokenmei;
	}
	public Date getHokenexp() {
		return hokenexp;
	}
	public void setHokenexp(Date hokenexp) {
		this.hokenexp = hokenexp;
	}

}
