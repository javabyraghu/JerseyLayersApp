package in.nit.config;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;
import org.glassfish.jersey.internal.inject.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import in.nit.dao.IEmpDao;
import in.nit.dao.impl.EmpDaoImpl;
import in.nit.service.IEmpService;
import in.nit.service.impl.EmpServiceImpl;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig{

	@Inject
	public AppConfig(ServiceLocator locator) {
		packages("in.nit.controller");
		ServiceLocatorUtilities.enableImmediateScope(locator);
		register(new AbstractBinder() {
			
			@Override
			protected void configure() {
				bind(EmpServiceImpl.class).to(IEmpService.class);
				bind(EmpDaoImpl.class).to(IEmpDao.class);
			}
		});
	}
}
