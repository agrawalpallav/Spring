
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.org")
@EnableWebMvc
public class MyConfig {
	
	@Bean
	public InternalResourceViewResolver extension() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");//we use this to map the jsp files when jsp files are inside WEB-INF instead of webapp.
		vr.setSuffix(".jsp");
		return vr;
	}
}
