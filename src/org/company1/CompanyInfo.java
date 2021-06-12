package org.company1;

public class CompanyInfo {
public void companyName(int name) {
System.out.println(" Company Name is : "+name);	
}
public void companyName(int name,String name1) {
	System.out.println(" Company Name is : "+name +name1);	

}
public static void main(String[] args) {
	CompanyInfo CI=new CompanyInfo();
	CI.companyName(12345);
	CI.companyName(12345, "TCS");
}
}
