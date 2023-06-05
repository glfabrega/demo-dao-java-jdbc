package application;

import java.util.List;

import model.DAO.DaoFactory;
import model.DAO.DepartmentDAO;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDAO departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("Teste 1 - department.findbyid");
		
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println();
		System.out.println("Teste 2 - department.findall");
		
		List<Department> list = departmentDao.findAll();
		
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("Teste 4 - department.insert");
		
		Department depInsert = new Department(null,"Alimentos");
		departmentDao.insert( depInsert );
		System.out.println("Inserted! New id " + depInsert.getId());
		
		System.out.println();
		System.out.println("Teste 5 - department.update");
		
		Department depUp = departmentDao.findById(5);
		depUp.setName("Alimentos edit");
		departmentDao.update(depUp);
		System.out.println("Updated!");
		
		System.out.println();
		System.out.println("Teste 6 - department.delete");
		
		departmentDao.deleteById(5);
		System.out.println("Deleted");
	

	}

}
