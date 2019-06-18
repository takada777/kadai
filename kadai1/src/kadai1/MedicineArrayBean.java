package kadai1;

import java.io.Serializable;
import java.util.ArrayList;

public class MedicineArrayBean implements Serializable{
	private ArrayList<MedicineBean> mediArray;
	public MedicineArrayBean() {
	      mediArray=new ArrayList<MedicineBean>();

	       // TODO Auto-generated constructor stub
	   }
	   public void addMediArray(MedicineBean mBean){
	   	mediArray.add(mBean);
	   }
	   public int getArraysize(){
	   	return mediArray.size();
	   }

	   public ArrayList<MedicineBean> getMediArray(){
	   	return mediArray;

	   }
	   public void setMediArray(ArrayList<MedicineBean> mediArray) {
			this.mediArray = mediArray;
		}
	   public int getTotalkosu(){
		   int kosu=0;
		   for(MedicineBean rec : mediArray){
			   kosu+=rec.getTotalPrice();
		   }
		return sum;
	   }
}


