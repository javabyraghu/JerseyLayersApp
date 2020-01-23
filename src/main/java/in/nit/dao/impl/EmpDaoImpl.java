package in.nit.dao.impl;

import in.nit.dao.IEmpDao;

public class EmpDaoImpl implements IEmpDao {

	@Override
	public String saveData() {
		System.out.println("from dao");
		return "DAO";
	}

}
