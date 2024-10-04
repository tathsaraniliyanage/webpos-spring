package lk.ijse.gdse.webposspring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Prabodha Thathsarani
 * @date 10/4/24
 * @project webpos-spring
 **/

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.webposspring")
@EnableJpaRepositories(basePackages = "lk.ijse.gdse.webposspring")
@EnableTransactionManagement
public class WebAppRootConfig {

}
