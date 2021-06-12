package org.company;

public class CompanyInfo {
	public void companyName() {
		System.out.println("Company Name is Wipro");
	}
public void companyId() {
	System.out.println("Company Id is 109004028");
	
}
public void companyAddress() {
	System.out.println("Company Address is Wipro, Whitefield, Bangalore");
	
}
public static void main(String[] args) {
	CompanyInfo c=new CompanyInfo();
	c.companyName();
	c.companyId();
	c.companyAddress();
}
}
