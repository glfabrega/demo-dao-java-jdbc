package model.DAO;

import db.DB;
import model.DAO.impl.DepartmentDaoJdbc;
import model.DAO.impl.SellerDaoJdbc;


public class DaoFactory {

	public static SellerDAO createSellerDao() {
		return new SellerDaoJdbc(DB.getConnection());
	}
	
	public static DepartmentDAO  createDepartmentDao(){
		return new DepartmentDaoJdbc(DB.getConnection());
	}
	
}
