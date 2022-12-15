package info.inetsolv.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;

@Configuration
public class JPATransactionManagerUtil {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	@Bean
	public JpaTransactionManager jpaTransactionManager() {
		
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		
		return transactionManager;
	}
}
