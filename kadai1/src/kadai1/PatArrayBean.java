package kadai1;

import java.io.Serializable;
import java.util.ArrayList;

public class PatArrayBean implements Serializable {
	private ArrayList<PatBean> patArray;
	public PatArrayBean() {
	      patArray=new ArrayList<PatBean>();

	       // TODO Auto-generated constructor stub
	   }
	   public void addPatArray(PatBean pBean){
	   	patArray.add(pBean);
	   }
	   public int getArraysize(){
	   	return patArray.size();
	   }

	   public ArrayList<PatBean> getPatArray(){
	   	return patArray;

	   }
	   public void setPatArray(ArrayList<PatBean> patArray) {
			this.patArray = patArray;
		}
}

