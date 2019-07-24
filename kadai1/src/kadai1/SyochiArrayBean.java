package kadai1;

import java.io.Serializable;
import java.util.ArrayList;

public class SyochiArrayBean implements Serializable {
	private ArrayList<SyochiBean> syochiArray;
	public SyochiArrayBean() {
	      syochiArray=new ArrayList<SyochiBean>();

	       // TODO Auto-generated constructor stub
	   }
	   public void addsyochiArray(SyochiBean sBean){
	   	syochiArray.add(sBean);
	   }
	   public int getArraysize(){
	   	return syochiArray.size();
	   }

	   public ArrayList<SyochiBean> getsyochiArray(){
	   	return syochiArray;

	   }
	   public void setsyochiArray(ArrayList<SyochiBean> syochiArray) {
			this.syochiArray = syochiArray;
		}
	   public void delisyochiArray(String i) {
			syochiArray.remove(Integer.parseInt(i));
		}
}
