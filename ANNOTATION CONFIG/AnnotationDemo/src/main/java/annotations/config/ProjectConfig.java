package annotations.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( basePackages={"annotations.config.beans","annotations.config"})
public class ProjectConfig {

}
