package in.nit.controller;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import in.nit.service.IEmpService;

@Path("/emp")
@Singleton
//@PerLookup
//@RequestScoped
//@Immediate
public class EmpRestController {
	
	@Inject
	private IEmpService service;
	
	@GET
	public String getMsg() {
		
		return "Hello:"+service.saveData();
	}
}
