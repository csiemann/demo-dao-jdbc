package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		System.out.println("Test 1: findById(){");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(3);
		System.out.println(department);
		System.out.println("}");
		System.out.println("Test 2: findAll(){");
		List<Department> list2 = departmentDao.findAll();
		list2.forEach(System.out::println);
		System.out.println("}");
		System.out.println("Test 3: insert(){");
		Department newDepartment = new Department(null,"Games");
		departmentDao.insert(newDepartment);
		System.out.println("Insert! new Id = "+newDepartment.getId());
		System.out.println("}");
		System.out.println("Test 4: update(){");
		department = departmentDao.findById(1);
		department.setName("Notebooks");
		departmentDao.update(department);
		System.out.println("Update completed!");
		System.out.println("}");
		System.out.println("Test 5: delete(){");
		Scanner scanner = new Scanner(System.in);
		departmentDao.deleteById(scanner.nextInt());
		System.out.println("Delete completed!");
		scanner.close();
		System.out.println("}");
	}

}
