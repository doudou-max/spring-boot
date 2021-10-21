package smoketest.tomcat.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import smoketest.tomcat.model.Student;

/**
 * @author: doudou
 * @since: 2021-10-21
 */
@Configuration
public class DemoConfiguration {

	@Bean
	public Student getStu() {
		return new Student();
	}

}
