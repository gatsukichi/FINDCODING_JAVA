package ssk01;

public class J0801_MonthPayEx {
	public static void main(String[] args) {
		J0801_IPayable[] arr = new J0801_IPayable[4];
		
		arr[0] = new J0801_RegularWorker();
		arr[1] = new J0801_ContractWorker();
		arr[2] = new J0801_PartTimer();
		arr[3] = new J0801_RentalPay();
		
		System.out.println(arr[0].getMonthPay());
		System.out.println(arr[1].getMonthPay());
		System.out.println(arr[2].getMonthPay());
		System.out.println(arr[3].getMonthPay());
		
	}
}
