package application;

import java.util.Date;
import java.util.List;

import model.DAO.DaoFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDAO sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("Teste 1 - seller.findbyid");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println();
		System.out.println("Teste 2 - seller.findbydep");
		Department dep = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("Teste 3 - seller.findbyall");
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("Teste 4 - seller.insert");
		
		Seller sellerIns = new Seller(null,"Rosa","rosa@gmail.com",new Date(),2200.23,dep);
		sellerDao.insert(sellerIns);
		System.out.println("Inserted! New id " + sellerIns.getId());
		
		System.out.println();
		System.out.println("Teste 5 - seller.upd");
		
		Seller sellerUp = sellerDao.findById(1);
		sellerUp.setName("Tom");
		sellerDao.update(sellerUp);
		System.out.println("Updated!");
		
		System.out.println();
		
		System.out.println("Teste 6 - seller.delete");
		sellerDao.deleteById(1);
		System.out.println("Deleted");
		
		
	}

}
