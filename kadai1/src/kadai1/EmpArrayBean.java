package kadai1;

import java.io.Serializable;
import java.util.ArrayList;

public class EmpArrayBean implements Serializable {
	private ArrayList<EmpBean> empArray;
	public EmpArrayBean() {
	      empArray=new ArrayList<EmpBean>();

	       // TODO Auto-generated constructor stub
	   }
	   public void addEmpArray(EmpBean eBean){
	   	empArray.add(eBean);
	   }
	   public int getArraysize(){
	   	return empArray.size();
	   }

	   public ArrayList<EmpBean> getEmpArray(){
	   	return empArray;

	   }
	   public void setEmpArray(ArrayList<EmpBean> empArray) {
			this.empArray = empArray;
		}
}
