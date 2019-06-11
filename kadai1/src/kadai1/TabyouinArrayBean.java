package kadai1;

import java.util.ArrayList;

public class TabyouinArrayBean {
	private ArrayList<TabyouinBean> tabyouinArray;
	public TabyouinArrayBean() {
	      tabyouinArray=new ArrayList<TabyouinBean>();

	       // TODO Auto-generated constructor stub
	   }
	   public void addTabyouinArray(TabyouinBean tb){
	   	tabyouinArray.add(tb);
	   }
	   public int getArraysize(){
	   	return tabyouinArray.size();
	   }

	   public ArrayList<TabyouinBean> getTabyouinArray(){
	   	return tabyouinArray;

	   }
	   public void setTabyouinArray(ArrayList<TabyouinBean> tabyouinArray) {
			this.tabyouinArray = tabyouinArray;
		}





}
