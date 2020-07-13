package springboot.auto;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("springboot.dao")
@Import(MyRegister.class)
public class Config {
}
