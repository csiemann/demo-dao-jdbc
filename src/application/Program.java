package application;

import java.util.Date;

import entities.Department;
import entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department dp = new Department(1, "books");
		Seller s = new Seller(23, "Bob", "bob@gmail.com", new Date(), 1000.00, dp);
		System.out.println(s);
	}

}
