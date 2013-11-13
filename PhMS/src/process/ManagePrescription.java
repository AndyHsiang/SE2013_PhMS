package process;

import database.bean.Drug;
import database.bean.Patient;
import database.bean.Prescription;

/**
 * @author Andy
 */
public class ManagePrescription {
	/**
	 * @param drug
	 * @param patient
	 * @param prescription
	 * @return
	 */
	public static boolean refillDrug(Drug drug, Patient patient, Prescription prescription){
		return false;
	}
	/**
	 * @param prescription
	 * @param patient
	 * @return
	 */
	public static boolean addPrescription(Prescription prescription, Patient patient){
		return false;
	}
	/**
	 * @param prescription
	 * @param patient
	 * @return
	 */
	public static boolean removePrescription(Prescription prescription, Patient patient){
		return false;
	}
	/**
	 * @param amount
	 * @param paymentType
	 * @return
	 */
	public static boolean processPayment(double amount, String paymentType){
		return false;
	}
}
