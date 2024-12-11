package annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import annotations.config.beans.Vehicle;

@Configuration
@ComponentScan("annotations.config.beans")
public class ProjectConfig {
	
	@Primary
	@Bean
    Vehicle vehicle1() {
        Vehicle veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

	
    @Bean
    Vehicle vehicle2() {
        Vehicle veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean("ferrari")		// name/value
    Vehicle vehicle3() {
        Vehicle veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }
	
	@Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number() {
        return 16;
    }

}
