package java_start;

import java.util.ArrayList;

public class A5_FetchEmpDiffCompany {

	public static void main(String[] args) {
		A5_FetchEmpDiffCompany a = new A5_FetchEmpDiffCompany();
		ArrayList<String> ibmEmpList =  a.getEmpList("IBM");
		System.out.println(ibmEmpList);
		ibmEmpList = a.getEmpListSwitch("IBM");
		System.out.println(ibmEmpList);
	}
		
		public ArrayList<String> getEmpList(String company){
			ArrayList<String> empList = new ArrayList<String>();
			if(company.equalsIgnoreCase("IBM")){
				empList.add("abhi");
				empList.add("appu");
				empList.add("dipu");
			} else if(company.equalsIgnoreCase("Microsoft")){
				empList.add("ajeya");
				empList.add("pal");
			} else if(company.equalsIgnoreCase("google")){
				empList.add("krishna");
				empList.add("sawan");
			} else if (company.equalsIgnoreCase("FB")) {
				empList.add("rohit");
				empList.add("pramod");
				empList.add("amresh");
			}else {
				System.out.println("invalid company name");
			}
			return empList;			
		}
		
		public ArrayList<String> getEmpListSwitch(String company){
			ArrayList<String> empList = new ArrayList<String>();
			
			switch (company) {
			case "IBM":
				empList.add("abhi");
				empList.add("ajeya");
				empList.add("pal");
				empList.add("rohit");
				empList.add("krishna");
				empList.add("pramod");
				break;

			default:
				break;
			}
			return empList;
		}
		
	}


