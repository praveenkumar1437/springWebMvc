package info.inetsolv.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class LocalEntityManagerFactoryUtil {

	public LocalEntityManagerFactoryBean localEntityManagerFactoryBean() {
		
		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
		
		factoryBean.setPersistenceUnitName("praveen");
		
		return factoryBean;
	}
}
