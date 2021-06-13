package org.company;

import org.client.Client;

public class Company extends Client {
	public void companyName() {
		System.out.println(" Company Name is : TCS ");

	}

	public void companyAddress() {
		System.out.println("Siruseri");
	}

	public void companyPhoneNumber() {
		System.out.println("1234567891");
	}

	public static void main(String[] args) {
		Company c = new Company();
		c.companyName();
		c.companyAddress();
		c.companyPhoneNumber();
		c.clientName();
	}

}
