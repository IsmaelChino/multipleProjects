package tutorial;

import java.util.logging.Logger;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import baselib.BaseService;

public class TutorialActivator implements BundleActivator {

	Logger log = Logger.getLogger(this.getClass().getName());
	
	@Override
	public void start(BundleContext context) throws Exception {
		log.info("started"); 
		new BaseService().sayHello();	
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		log.info("stopped.");
	}

}
