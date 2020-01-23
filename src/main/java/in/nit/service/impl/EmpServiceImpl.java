package in.nit.service.impl;

import javax.inject.Inject;

import in.nit.dao.IEmpDao;
import in.nit.service.IEmpService;

public class EmpServiceImpl implements IEmpService {
	@Inject
	private IEmpDao dao;
	
	@Override
	public String saveData() {
		System.out.println("from service");
		return "FROM SERV:"+dao.saveData();
	}

}
