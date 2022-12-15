package info.inetsolv.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(basePackages="info.inetsolv")
@EnableWebMvc
@EnableTransactionManagement
public class MOCUtil {

}
