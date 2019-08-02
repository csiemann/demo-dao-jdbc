package application;

import java.util.Date;
import java.util.List;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		System.out.println("Test 1: findById(){");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("}");
		System.out.println("Test 2: findByDepartment(){");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);
		System.out.println("}");
		System.out.println("Test 3: findAll(){");
		List<Seller> list2 = sellerDao.findAll();
		list2.forEach(System.out::println);
		System.out.println("}");
		System.out.println("Test 4: insert(){");
		Seller newSeller = new Seller(null, "Ana Maria Braga", "anamb@gmail.com", new Date(), 100000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Insert! new Id = "+newSeller.getId());
		System.out.println("}");
		System.out.println("Test 5: update(){");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		System.out.println("}");
		DB.closeConnection();
	}

}
