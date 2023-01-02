package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
	
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();

		
		
		System.out.println("==== TEST 1 ==== Seller Find By Id ====");
		Department dep = depDao.findById(3);	
		System.out.println(dep);
		
		
		System.out.println("==== TEST 2 - INSERT DEPARTMENT");
		Department dep1 = new Department(null, "Food");
		depDao.insert(dep1);
		System.out.println("Inserted! = New Department = " + dep1.getId());
		
		
		
		System.out.println("==== TEST 3 - UPDATE DEPARTMENT");
		dep = depDao.findById(1);
		dep.setName("Food");
		depDao.update(dep);
		System.out.println("Update completed");
		
		
		
		System.out.println("==== TEST 4 - DELETE DEPARTMENT");
		depDao.deleteById(5);
		System.out.println("Delete completed");
		
		
		System.out.println("\n==== TEST 5 ==== Department FindAll ====");
		List<Department> deplist = depDao.findAll();
		for (Department obj : deplist) {
			System.out.println(obj);
		}
		
	
		
	}

}
