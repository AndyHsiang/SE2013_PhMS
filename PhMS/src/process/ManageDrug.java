package process;

import database.bean.Drug;

/**
 * @author Andy
 */
public class ManageDrug {
	/**
	 * @param drugName
	 * @return
	 */
	public static Drug searchDrug(String drugName){
		return null;
	}
	/**
	 * @param drug
	 * @return
	 */
	public static boolean addNewDrug(Drug drug){
		return false;
	}
	/**
	 * @param drugName
	 * @return
	 */
	public static boolean removeDrug(String drugName){
		return false;
	}
	/**
	 * @param DrugId
	 */
	public static void restock(int DrugId){
		
	}
	/**
	 * @param drugName
	 * @param quantity
	 */
	public static void lowStockWarning(String drugName, int quantity){
		System.out.println(drugName+" is running low\ncurrent quantity on hand: "+quantity);
	}
}
