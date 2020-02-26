package ssk01;

public class J0707_EmployeeEx {
	public static void printPay(J0707_Employee emp) {
		System.out.println("====================");
		System.out.println(emp);
		System.out.println("--------------------");
		System.out.println(emp.getMonthPay());
		System.out.println("--------------------");
	}
	
	public static void main(String[] args) {
		J0707_Employee[] emps = new J0707_Employee[4];
		emps[0] = new J0707_RegularEmployee("E001","È«±æµ¿",5000,1000);
		emps[1] = new J0707_TempEmployee("E002","±èÃ¶¼ö",4000,0.5);
		emps[2] = new J0707_PartTimeEmployee("E003","¹ÚÀÎÈ£",3000,30);
		emps[3] = new J0707_PartTimeEmployee("E004","ÀÌ¿µÈñ",3000,60);
		
		for(int i=0;i<emps.length;i++) {
			printPay(emps[i]);
		}
	}
	
	
}
