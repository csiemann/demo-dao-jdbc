package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department dp = new Department(1, "books");
		Seller s = new Seller(23, "Bob", "bob@gmail.com", new Date(), 1000.00, dp);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println(s);
	}

}
